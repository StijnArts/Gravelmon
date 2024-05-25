package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Teleprog extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teleprog() {
        super("Teleprog",
                Type.PSYCHIC,
                new Stats(65,
                        40,
                        65,
                        115,
                        95,
                        70),
                List.of(Ability.SUPERPOSITION), Ability.SUPERPOSITION,
                2, 10,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Added Oct 27 2021 Etymology: teleport + frog Placeholder moveset"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.DISABLE,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,20),
                        new MoveLearnSetEntry(Move.TELEKINESIS,25),
                        new MoveLearnSetEntry(Move.PSYCHIC,30),
                        new MoveLearnSetEntry(Move.HYPNOSIS,35),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,40),
                        new MoveLearnSetEntry(Move.REFLECT,45),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,45),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,50),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHICNOISE,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Teleprog");

    }


}
