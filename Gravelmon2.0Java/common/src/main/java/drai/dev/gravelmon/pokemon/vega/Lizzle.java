package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Lizzle extends Pokemon {
    public Lizzle() {
        super( "Lizzle",
                Type.WATER,
                new Stats(45	,
                        55,
                        50	,
                        75,
                        55,
                        55),
                List.of(Ability.DRIZZLE), Ability.DRIZZLE,
                4, 78,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.WATER_3),
                List.of("Since it loses moisture quickly, it developed the ability to summon rain to protect itself from dehydration."),
                List.of(new EvolutionEntry("drizzlob", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,9),
                        new MoveLearnSetEntry(Move.SUPERSONIC,14),
                        new MoveLearnSetEntry(Move.ICY_WIND,19),
                        new MoveLearnSetEntry(Move.BODY_SLAM,23),
                        new MoveLearnSetEntry(Move.MIST,27),
                        new MoveLearnSetEntry(Move.WATER_PULSE,32),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,37),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,41),
                        new MoveLearnSetEntry(Move.THUNDER,45),
                        new MoveLearnSetEntry(Move.REFLECT,50),
                        new MoveLearnSetEntry(Move.DELUGE,55),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"egg"),
                        new MoveLearnSetEntry(Move.BARRIER,"egg"),
                        new MoveLearnSetEntry(Move.BIDE,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"egg"),
                        new MoveLearnSetEntry(Move.HAIL,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RECOVER,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SCALD,"egg"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.STARFREEZE,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
