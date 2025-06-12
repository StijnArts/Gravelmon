package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Timingo extends drai.dev.data.pokemon.Pokemon {
    public Timingo() {
        super("Timingo",
                Type.NORMAL, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CUTE_CHARM), Ability.OBLIVIOUS,
                6, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Timingo are very shy Pokemon who are not as confident as their evolved form, Flambagant. They easily get embarrassed so they hide their face in shame. By learning to be confident, it grows closer to evolving. They hide their true feelings from people and by doing so, their psychic ability grows stronger."),
                List.of(new EvolutionEntry("flambagant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.PECK,8),
                        new MoveLearnSetEntry(Move.YAWN,11),
                        new MoveLearnSetEntry(Move.STORED_POWER,14),
                        new MoveLearnSetEntry(Move.ATTRACT,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.CHERUB_ARROW,24),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,28),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,41),
                        new MoveLearnSetEntry(Move.AIR_SLASH,47),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,52),
                        new MoveLearnSetEntry(Move.HEALING_WISH,60)
                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Timingo");

    }


}
