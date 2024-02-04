package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nukemu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nukemu() {
        super("Nukemu",
                Type.ROCK,Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its mere presence flushes the caves it lives in with lethal amounts of radiation. It can split atoms with little effort, so extreme measures are taken to make sure none remain in the wild."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SINGE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,3),
                        new MoveLearnSetEntry(Move.SHARPEN,7),
                        new MoveLearnSetEntry(Move.ROCK_THROW,12),
                        new MoveLearnSetEntry(Move.ACID,17),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,26),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,32),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,37),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,46),
                        new MoveLearnSetEntry(Move.POWER_GEM,52),
                        new MoveLearnSetEntry(Move.EXPLOSION,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 47, 64, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nukemu");

    }


}
