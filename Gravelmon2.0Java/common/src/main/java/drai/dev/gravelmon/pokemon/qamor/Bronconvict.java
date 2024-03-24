package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bronconvict extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bronconvict() {
        super("Bronconvict",
                Type.DARK,
                new Stats(140,
                        85,
                        115,
                        30,
                        90,
                        22),
                List.of(Ability.STAMINA), Ability.PICKPOCKET,
                22, 165,
                new Stats(1,1,1,0,0,0), 60,
                0.5,
                240, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Bronconvict are very mellow Pokemon who feel embarrassed by the wild antics of their pre-evolution. These are hardworking Pokemon who no longer feel the need to steal or cause mayhem, instead they are content with tilling fields and aiding farmers. Their rope-like tails are made with extremely durable fibers, and can be used for a multitude of activities."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.SNATCH,6),
                        new MoveLearnSetEntry(Move.WRAP,11),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,21),
                        new MoveLearnSetEntry(Move.PURSUIT,25),
                        new MoveLearnSetEntry(Move.BATON_PASS,33),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,40),
                        new MoveLearnSetEntry(Move.COUNTER,46),
                        new MoveLearnSetEntry(Move.REVENGE,52),
                        new MoveLearnSetEntry(Move.LASH_OUT,57),
                        new MoveLearnSetEntry(Move.MEGA_KICK,63)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 54, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bronconvict");

    }


}
