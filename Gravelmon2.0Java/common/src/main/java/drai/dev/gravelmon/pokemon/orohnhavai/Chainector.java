package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chainector extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chainector() {
        super("Chainector",
                Type.ELECTRIC,
                new Stats(75,
                        50,
                        75,
                        135,
                        85,
                        75),
                List.of(Ability.PLUS,Ability.MINUS,Ability.BATTERY), Ability.BATTERY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its long arms serve a multitude of purposes from creating electrical connections to reaching an object that's far off. Their uses are so versatile that space stations are becoming more and more reliant on them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,1)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chainector");

    }


}
