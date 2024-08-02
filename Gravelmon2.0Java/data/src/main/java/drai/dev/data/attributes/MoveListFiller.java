package drai.dev.data.attributes;

import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.jetbrains.annotations.*;
import org.lwjgl.system.linux.*;

import java.util.*;

public class MoveListFiller {
    public static Map<ExperienceGroup, List<Integer>> MOVE_LEARNING_LEVELS = new HashMap<>();
    public static Map<String, Map<Type, List<Move>>> LEVEL_UP_SETS = new HashMap<>();

    public static List<MoveLearnSetEntry> resolveMoveList(Pokemon pokemon){
        var statArchetype = StatArchetype.findClosestArchetype(pokemon.getStats());
        List<MoveLearnSetEntry> learnSet = new ArrayList<>();
        List<List<Move>> moveOptions = getMoveOptions(statArchetype, pokemon.getPrimaryType(), pokemon.getSecondaryType());
        if(moveOptions.isEmpty()){
            return learnSet;
        }
        List<Iterator<Move>> iterators = new ArrayList<>();
        for(List<Move> moves : moveOptions){
            if(moves == null) {
                System.out.println();
            }
            iterators.add(moves.iterator());
        }

        var shouldContinue = true;
        var levelIterator = 0;
        var iterator = 0;
        while(shouldContinue) {
            if(iterator == moveOptions.size()) iterator = 0;
            var level = MOVE_LEARNING_LEVELS.get(pokemon.getExperienceGroup()).get(levelIterator);
            for (int i = iterator; i < moveOptions.size(); i++) {
                iterator ++;
                var move = iterators.get(i).next();
                if(move==null) continue;
                learnSet.add(new MoveLearnSetEntry(move, level));
                if(i == moveOptions.size()-1) shouldContinue = false;
                break;
            }
            if(levelIterator == MOVE_LEARNING_LEVELS.get(pokemon.getExperienceGroup()).size()-1) shouldContinue = false;
        }
        return learnSet;
    }

    private static MoveLearnSetEntry findApproximateMove(List<MoveLearnSetEntry> moveLearnSetEntries, int level) {
        return moveLearnSetEntries.stream().min(Comparator.comparing(entry -> Math.abs(Integer.parseInt(entry.getCondition()) - level), Integer::compareTo)).orElse(null);
    }

    private static List<List<Move>> getMoveOptions(StatArchetype statArchetype, Type primaryType, Type secondaryType) {
        List<List<Move>> lists = new ArrayList<>();
        var attackingType = getOverArchingArchetype(statArchetype);
        lists.add(getAttackingMoves(attackingType, primaryType));
        if(secondaryType != null){
            lists.add(getAttackingMoves(attackingType, secondaryType));
        }


        if(statArchetype.name().contains("WALL") || statArchetype.name().contains("BULKY")){
            lists.add(getDefensiveMoves(primaryType));
            if(secondaryType != null){
                lists.add(getDefensiveMoves(secondaryType));
            }
        }

        if(statArchetype.name().contains("SUPPORT")){
            lists.add(getSupportMoves(primaryType));
            if(secondaryType != null){
                lists.add(getSupportMoves(secondaryType));
            }
        }

        if(statArchetype.name().contains("FAST")){
            lists.add(getFastMoves(attackingType, primaryType));
            if(secondaryType != null){
                lists.add(getFastMoves(attackingType, secondaryType));
            }
        }

        if(lists.isEmpty()) lists.add(List.of(Move.TACKLE,Move.GROWL));
        return lists;
    }

    private static List<Move> getFastMoves(String attackingType, Type type) {
        if(attackingType.equalsIgnoreCase("mixed")) {
            var l1 = LEVEL_UP_SETS.get("fastspecial").get(type);
            var l2 = LEVEL_UP_SETS.get("fastphysical").get(type);
            if(l1 == null) l1 = LEVEL_UP_SETS.get("fastspecial").get(type.getSubstitutionType());
            if(l2 == null) l2 = LEVEL_UP_SETS.get("fastphysical").get(type.getSubstitutionType());
            ArrayList<Move> mergedList = new ArrayList<>();
            Iterator<Move> i = l1.iterator();
            while (i.hasNext()) {
                mergedList.add(i.next());
            }
            i=l2.iterator();
            while (i.hasNext()) {
                mergedList.add(i.next());
            }
            return mergedList;
        }
        var moves = LEVEL_UP_SETS.get("fast"+attackingType).get(type);
        if (moves == null) moves = LEVEL_UP_SETS.get("fast"+attackingType).get(type.getSubstitutionType());
        return moves;
    }

    private static List<Move> getSupportMoves(Type type) {
        var moves = LEVEL_UP_SETS.get("support").get(type);
        if (moves == null) moves = LEVEL_UP_SETS.get("support").get(type.getSubstitutionType());
        return moves;
    }

    private static List<Move> getDefensiveMoves(Type type) {

        var moves = LEVEL_UP_SETS.get("defensive").get(type);
        if (moves == null) moves = LEVEL_UP_SETS.get("defensive").get(type.getSubstitutionType());
        return moves;
    }

    private static List<Move> getAttackingMoves(String attackingType, Type type) {
        if(attackingType.equalsIgnoreCase("mixed")) {
            var l1 = LEVEL_UP_SETS.get("special").get(type);
            var l2 = LEVEL_UP_SETS.get("physical").get(type);
            if(l1 == null) l1 = LEVEL_UP_SETS.get("special").get(type.getSubstitutionType());
            if(l2 == null) l2 = LEVEL_UP_SETS.get("special").get(type.getSubstitutionType());
            ArrayList<Move> mergedList = new ArrayList<>();
            Iterator<Move> i = l1.iterator();
            while (i.hasNext()) {
                mergedList.add(i.next());
            }
            i=l2.iterator();
            while (i.hasNext()) {
                mergedList.add(i.next());
            }
            return mergedList;
        }
        var attackingMoves = LEVEL_UP_SETS.get(attackingType);
        var moves = attackingMoves.get(type);
        if (moves == null) moves = LEVEL_UP_SETS.get(attackingType).get(type.getSubstitutionType());
        return moves;
    }

    private static String getOverArchingArchetype(StatArchetype statArchetype) {
        if (statArchetype.name().contains("SPECIAL")) {
            return "special";
        } else if (statArchetype.name().contains("PHYSICAL")) {
            return "physical";
        }
        return "mixed";
    }

    static {
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.FLUCTUATING, List.of(1, 1, 1, 1, 5, 8, 12, 15, 19, 26, 29, 33, 39, 44, 50, 55));
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.SLOW, List.of(1, 1, 1, 1, 4, 8, 12, 16, 20, 24, 28, 33, 36, 40, 44, 48, 52, 56));
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.MEDIUM_SLOW, List.of(1, 1, 1, 1, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 44, 51, 58));
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.MEDIUM_FAST, List.of(1, 1, 1, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 39, 44, 50, 54));
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.FAST, List.of(1, 1, 1, 1, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56));
        MOVE_LEARNING_LEVELS.put(ExperienceGroup.ERRATIC, List.of(1, 1, 1, 1, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60));

        var specialMovesPerType = getSpecialMovesPerType();
        var attackMovesPerType = getPhysicalMovesPerType();
        var types = List.of(
                Type.NORMAL,
                Type.FIRE,
                Type.FIGHTING,
                Type.WATER,
                Type.FLYING,
                Type.GRASS,
                Type.POISON,
                Type.ELECTRIC,
                Type.GROUND,
                Type.PSYCHIC,
                Type.ROCK,
                Type.ICE,
                Type.BUG,
                Type.DRAGON,
                Type.GHOST,
                Type.DARK,
                Type.STEEL,
                Type.FAIRY
        );
        var defensiveMovesPerType = getDefensiveMovesPerType(types);
        var supportMovesPerType = getSupportMovesPerType(types);
        var fastSpecialMovesPerType = getFastSpecialMovesPerType(types);
        var fastPhysicalPerType = getFastPhysicalMovesPerType(types);
        LEVEL_UP_SETS.put("special", specialMovesPerType);
        LEVEL_UP_SETS.put("physical", attackMovesPerType);
        LEVEL_UP_SETS.put("defensive", defensiveMovesPerType);
        LEVEL_UP_SETS.put("support", supportMovesPerType);
        LEVEL_UP_SETS.put("fastphysical", fastPhysicalPerType);
        LEVEL_UP_SETS.put("fastspecial", fastSpecialMovesPerType);
    }

    private static @NotNull HashMap<Type, List<Move>> getFastSpecialMovesPerType(List<Type> types) {
        var defensiveMoves = new HashMap<Type, List<Move>>();
        var basicMoves = List.of(
                Move.VACUUM_WAVE,
                Move.NASTY_PLOT
        );
        for (Type type : types) {
            var typeMoves = new ArrayList<>(basicMoves);
            defensiveMoves.put(type, typeMoves);
        }
        return defensiveMoves;
    }

    private static @NotNull HashMap<Type, List<Move>> getFastPhysicalMovesPerType(List<Type> types) {
        var defensiveMoves = new HashMap<Type, List<Move>>();
        var basicMoves = List.of(
                Move.QUICK_ATTACK,
                Move.SWORDS_DANCE
        );
        for (Type type : types) {
            var typeMoves = new ArrayList<Move>();
            if(type == Type.PSYCHIC) {
                typeMoves.add(Move.AGILITY);
            }
            if(type == Type.NORMAL) {
                typeMoves.add(Move.EXTREME_SPEED);
            }
            if(type == Type.STEEL) {
                typeMoves.add(Move.BULLET_PUNCH);
            }
            if(type == Type.WATER) {
                typeMoves.add(Move.FLIP_TURN);
            }
            if(type == Type.BUG) {
                typeMoves.add(Move.UTURN);
            }
            if(type == Type.GRASS) {
                typeMoves.add(Move.GRASSY_GLIDE);
            }
            typeMoves.addAll(basicMoves);
            defensiveMoves.put(type, typeMoves);
        }
        return defensiveMoves;
    }

    private static @NotNull HashMap<Type, List<Move>> getSupportMovesPerType(List<Type> types) {
        var defensiveMoves = new HashMap<Type, List<Move>>();
        var basicMoves = List.of(
                Move.HEAL_BELL,
                Move.WISH
        );
        for (Type type : types) {
            var typeMoves = new ArrayList<Move>();
            if(type == Type.PSYCHIC) {
                typeMoves.add(Move.ALLY_SWITCH);
            }
            if(type == Type.BUG) {
                typeMoves.add(Move.POLLEN_PUFF);
            }
            if(type == Type.POISON) {
                typeMoves.add(Move.TOXIC);
            }
            if(type == Type.FIRE    ) {
                typeMoves.add(Move.WILLOWISP);
            }
            if(type == Type.FIGHTING) {
                typeMoves.add(Move.COACHING);
            }
            if(type == Type.GRASS   ) {
                typeMoves.add(Move.POISON_POWDER);
            }
            typeMoves.addAll(basicMoves);
            defensiveMoves.put(type, typeMoves);
        }
        return defensiveMoves;
    }

    private static @NotNull HashMap<Type, List<Move>> getDefensiveMovesPerType(List<Type> types) {
        var defensiveMoves = new HashMap<Type, List<Move>>();
        var basicMoves = List.of(
                Move.BULK_UP,
                Move.CALM_MIND,
                Move.TAUNT,
                Move.SUBSTITUTE,
                Move.REST
        );
        for (Type type : types) {
            var typeMoves = new ArrayList<Move>();
            if(type == Type.NORMAL) {
                typeMoves.add(Move.SLEEP_TALK);
            }
            if(type == Type.STEEL) {
                typeMoves.add(Move.IRON_DEFENSE);
            }
            if(type == Type.GROUND) {
                typeMoves.add(Move.SHORE_UP);
            }
            if(type == Type.GHOST) {
                typeMoves.add(Move.CURSE);
            }
            if(type == Type.GRASS) {
                typeMoves.add(Move.SYNTHESIS);
            }
            if(type == Type.FIGHTING) {
                typeMoves.add(Move.DRAIN_PUNCH);
            }
            typeMoves.addAll(basicMoves);
            defensiveMoves.put(type, typeMoves);
        }
        return defensiveMoves;
    }

    private static @NotNull HashMap<Type, List<Move>> getSpecialMovesPerType() {
        var specialMoves = new HashMap<Type, List<Move>>();
        specialMoves.put(Type.NORMAL, List.of(
                Move.TACKLE,
                Move.GROWL,
                Move.ROUND,
                Move.SWIFT,
                Move.UPROAR,
                Move.HYPER_VOICE,
                Move.HYPER_BEAM
        ));
        specialMoves.put(Type.FIRE, List.of(
                Move.EMBER,
                Move.GROWL,
                Move.FIRE_SPIN,
                Move.FLAME_CHARGE,
                Move.FLAME_BURST,
                Move.FLAMETHROWER,
                Move.FIRE_BLAST
        ));
        specialMoves.put(Type.FIGHTING, List.of(
                Move.LOW_KICK,
                Move.LEER,
                Move.REVENGE,
                Move.VACUUM_WAVE,
                Move.BRICK_BREAK,
                Move.AURA_SPHERE,
                Move.FOCUS_BLAST
        ));
        specialMoves.put(Type.WATER, List.of(
                Move.WATER_GUN,
                Move.TAIL_WHIP,
                Move.BUBBLE_BEAM,
                Move.BRINE,
                Move.SURF,
                Move.CHILLING_WATER,
                Move.HYDRO_PUMP
        ));
        specialMoves.put(Type.FLYING, List.of(
                Move.GUST,
                Move.LEER,
                Move.AIR_CUTTER,
                Move.WING_ATTACK,
                Move.AIR_SLASH,
                Move.DRILL_PECK,
                Move.HURRICANE

        ));
        specialMoves.put(Type.GRASS, List.of(
                Move.ABSORB,
                Move.LEER,
                Move.MEGA_DRAIN,
                Move.MAGICAL_LEAF,
                Move.GIGA_DRAIN,
                Move.ENERGY_BALL,
                Move.SOLAR_BEAM

        ));
        specialMoves.put(Type.POISON, List.of(
                Move.ACID,
                Move.LEER,
                Move.CLEAR_SMOG,
                Move.SLUDGE,
                Move.TOXIC_SPIKES,
                Move.SLUDGE_BOMB,
                Move.SLUDGE_WAVE

        ));
        specialMoves.put(Type.ELECTRIC, List.of(
                Move.THUNDER_SHOCK,
                Move.LEER,
                Move.CHARGE,
                Move.SHOCK_WAVE,
                Move.DISCHARGE,
                Move.THUNDERBOLT,
                Move.THUNDER

        ));
        specialMoves.put(Type.GROUND, List.of(
                Move.MUDSLAP,
                Move.SAND_ATTACK,
                Move.MUD_SHOT,
                Move.MUD_BOMB,
                Move.BULLDOZE,
                Move.SCORCHING_SANDS,
                Move.EARTH_POWER

        ));
        specialMoves.put(Type.PSYCHIC, List.of(
                Move.CONFUSION,
                Move.GROWL,
                Move.PSYBEAM,
                Move.FUTURE_SIGHT,
                Move.PSYCHIC,
                Move.PSYSHOCK,
                Move.PSYCHO_BOOST

        ));
        specialMoves.put(Type.ROCK, List.of(
                Move.ROCK_THROW,
                Move.DEFENSE_CURL,
                Move.ROLLOUT,
                Move.ANCIENT_POWER,
                Move.POWER_GEM,
                Move.STEALTH_ROCK,
                Move.METEOR_BEAM

        ));
        specialMoves.put(Type.ICE, List.of(
                Move.POWDER_SNOW,
                Move.GROWL,
                Move.ICY_WIND,
                Move.AURORA_BEAM,
                Move.FREEZEDRY,
                Move.ICE_BEAM,
                Move.BLIZZARD

        ));
        specialMoves.put(Type.DRAGON, List.of(
                Move.SCRATCH,
                Move.LEER,
                Move.TWISTER,
                Move.DRAGON_BREATH,
                Move.BREAKING_SWIPE,
                Move.DRAGON_PULSE,
                Move.DRACO_METEOR

        ));
        specialMoves.put(Type.GHOST, List.of(
                Move.LICK,
                Move.GROWL,
                Move.CONFUSE_RAY,
                Move.OMINOUS_WIND,
                Move.NIGHT_SHADE,
                Move.HEX,
                Move.SHADOW_BALL

        ));
        specialMoves.put(Type.DARK, List.of(
                Move.BITE,
                Move.LEER,
                Move.PAYBACK,
                Move.NIGHT_DAZE,
                Move.SNARL,
                Move.KNOCK_OFF,
                Move.DARK_PULSE

        ));
        specialMoves.put(Type.STEEL, List.of(
                Move.METAL_CLAW,
                Move.SCREECH,
                Move.IRON_TAIL,
                Move.SMART_STRIKE,
                Move.MIRROR_SHOT,
                Move.FLASH_CANNON,
                Move.STEEL_BEAM

        ));
        specialMoves.put(Type.FAIRY, List.of(
                Move.DISARMING_VOICE,
                Move.BABYDOLL_EYES,
                Move.DRAINING_KISS,
                Move.PLAY_NICE,
                Move.DAZZLING_GLEAM,
                Move.HYPER_VOICE,
                Move.MOONBLAST

        ));
        specialMoves.put(Type.BUG, List.of(
                Move.STRUGGLE_BUG,
                Move.STRING_SHOT,
                Move.SILVER_WIND,
                Move.SIGNAL_BEAM,
                Move.INFESTATION,
                Move.UTURN,
                Move.BUG_BUZZ

        ));
        return specialMoves;
    }

    private static @NotNull HashMap<Type, List<Move>> getPhysicalMovesPerType() {
        var physicalMoves = new HashMap<Type, List<Move>>();
        physicalMoves.put(Type.NORMAL, List.of(
                Move.TACKLE,
                Move.GROWL,
                Move.QUICK_ATTACK,
                Move.BITE,
                Move.TAKE_DOWN,
                Move.CRUNCH,
                Move.DOUBLEEDGE
        ));
        physicalMoves.put(Type.FIRE, List.of(
                Move.EMBER,
                Move.GROWL,
                Move.QUICK_ATTACK,
                Move.FLAME_CHARGE,
                Move.FIRE_PUNCH,
                Move.WILLOWISP,
                Move.FLARE_BLITZ
        ));
        physicalMoves.put(Type.FIGHTING, List.of(
                Move.LOW_KICK,
                Move.LEER,
                Move.REVENGE,
                Move.LOW_SWEEP,
                Move.BRICK_BREAK,
                Move.KARATE_CHOP,
                Move.CLOSE_COMBAT
        ));
        physicalMoves.put(Type.WATER, List.of(
                Move.WATER_GUN,
                Move.TAIL_WHIP,
                Move.BUBBLE_BEAM,
                Move.AQUA_TAIL,
                Move.SURF,
                Move.WATERFALL,
                Move.LIQUIDATION
        ));
        physicalMoves.put(Type.FLYING, List.of(
                Move.PECK,
                Move.LEER,
                Move.PLUCK,
                Move.WING_ATTACK,
                Move.AERIAL_ACE,
                Move.DRILL_PECK,
                Move.BRAVE_BIRD

        ));
        physicalMoves.put(Type.GRASS, List.of(
                Move.LEAFAGE,
                Move.LEER,
                Move.ABSORB,
                Move.TRAILBLAZE,
                Move.GIGA_DRAIN,
                Move.SEED_BOMB,
                Move.LEAF_BLADE

        ));
        physicalMoves.put(Type.POISON, List.of(
                Move.POISON_STING,
                Move.LEER,
                Move.VENOSHOCK,
                Move.POISON_TAIL,
                Move.TOXIC_SPIKES,
                Move.SLUDGE_BOMB,
                Move.POISON_JAB

        ));
        physicalMoves.put(Type.ELECTRIC, List.of(
                Move.THUNDER_SHOCK,
                Move.LEER,
                Move.CHARGE,
                Move.THUNDER_PUNCH,
                Move.DISCHARGE,
                Move.WILD_CHARGE,
                Move.SUPERCELLSLAM

        ));
        physicalMoves.put(Type.GROUND, List.of(
                Move.MUDSLAP,
                Move.GROWL,
                Move.SAND_ATTACK,
                Move.MUD_BOMB,
                Move.BULLDOZE,
                Move.DIG,
                Move.EARTHQUAKE

        ));
        physicalMoves.put(Type.PSYCHIC, List.of(
                Move.CONFUSION,
                Move.GROWL,
                Move.PSYBEAM,
                Move.FUTURE_SIGHT,
                Move.PSYCHIC,
                Move.ZEN_HEADBUTT,
                Move.PSYCHO_CUT

        ));
        physicalMoves.put(Type.ROCK, List.of(
                Move.ROCK_THROW,
                Move.DEFENSE_CURL,
                Move.ROLLOUT,
                Move.SMACK_DOWN,
                Move.ROCK_BLAST,
                Move.STEALTH_ROCK,
                Move.STONE_EDGE

        ));
        physicalMoves.put(Type.ICE, List.of(
                Move.POWDER_SNOW,
                Move.GROWL,
                Move.ICY_WIND,
                Move.ICE_PUNCH,
                Move.ICE_SPINNER,
                Move.ICE_SHARD,
                Move.ICICLE_CRASH

        ));
        physicalMoves.put(Type.DRAGON, List.of(
                Move.SCRATCH,
                Move.LEER,
                Move.DRAGON_RAGE,
                Move.DUAL_CHOP,
                Move.BREAKING_SWIPE,
                Move.DRAGON_CLAW,
                Move.OUTRAGE

        ));
        physicalMoves.put(Type.GHOST, List.of(
                Move.LICK,
                Move.GROWL,
                Move.CONFUSE_RAY,
                Move.HEX,
                Move.SHADOW_CLAW,
                Move.PHANTOM_FORCE,
                Move.POLTERGEIST

        ));
        physicalMoves.put(Type.DARK, List.of(
                Move.BITE,
                Move.LEER,
                Move.PAYBACK,
                Move.NIGHT_SLASH,
                Move.CRUNCH,
                Move.KNOCK_OFF,
                Move.SUCKER_PUNCH

        ));
        physicalMoves.put(Type.STEEL, List.of(
                Move.METAL_CLAW,
                Move.SCREECH,
                Move.IRON_TAIL,
                Move.SMART_STRIKE,
                Move.IRON_HEAD,
                Move.METEOR_MASH,
                Move.HARDPRESS

        ));
        physicalMoves.put(Type.FAIRY, List.of(
                Move.DISARMING_VOICE,
                Move.BABYDOLL_EYES,
                Move.DRAINING_KISS,
                Move.PLAY_NICE,
                Move.DAZZLING_GLEAM,
                Move.PLAY_ROUGH,
                Move.SPIRIT_BREAK

        ));
        physicalMoves.put(Type.BUG, List.of(
                Move.STRUGGLE_BUG,
                Move.STRING_SHOT,
                Move.LEECH_LIFE,
                Move.LUNGE,
                Move.XSCISSOR,
                Move.UTURN,
                Move.MEGAHORN

        ));
        return physicalMoves;
    }
}
