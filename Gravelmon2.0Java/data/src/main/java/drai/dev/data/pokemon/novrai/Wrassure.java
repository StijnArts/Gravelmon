package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wrassure extends drai.dev.data.pokemon.Pokemon {
    public Wrassure() {
        super("Wrassure",
                Type.WATER,
                new Stats(75,
                        27,
                        60,
                        27,
                        68,
                        38),
                List.of(Ability.HEALER,Ability.HYDRATION,Ability.NURTURER), Ability.NURTURER,
                5, 165,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("A helpful Pokemon that feeds on grime accumulated by others. Many aquatic Pokemon trust them, and will seek them out to get a cleaning."),
                List.of(new EvolutionEntry("wrassuage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"))),
                        new EvolutionEntry("wrassassin", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "night")))),
                List.of(
                        new MoveLearnSetEntry(Move.AQUASLAP,1),
                        new MoveLearnSetEntry(Move.CUDDLE,4),
                        new MoveLearnSetEntry(Move.LIFE_DEW,9),
                        new MoveLearnSetEntry(Move.REFRESH,11),
                        new MoveLearnSetEntry(Move.WATER_PULSE,14),
                        new MoveLearnSetEntry(Move.BATON_PASS,19),
                        new MoveLearnSetEntry(Move.HELPING_HAND,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,24),
                        new MoveLearnSetEntry(Move.BEACHTIDE,29),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,31),
                        new MoveLearnSetEntry(Move.AQUA_RING,34),
                        new MoveLearnSetEntry(Move.WISH,39),
                        new MoveLearnSetEntry(Move.FLIP_TURN,41),
                        new MoveLearnSetEntry(Move.HEAL_BELL,44),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,49),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,51),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,54),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.WRAP,"tm"),
                        new MoveLearnSetEntry(Move.PURIFY,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
