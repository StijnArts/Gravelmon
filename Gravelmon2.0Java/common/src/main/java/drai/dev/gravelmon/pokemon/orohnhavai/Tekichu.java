package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tekichu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tekichu() {
        super("Tekichu",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUBBERBODY,Ability.LIGHTNING_ROD,Ability.COMBATSKIN), Ability.COMBATSKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tekichu suddenly appeared out of nowhere. For some reason, they have a strong hatred for Pikachu. They can withstand any electrical attacks or harsh combat due to their tough, durable rubber skin. Further research has concluded that Tekichu was manufactured and programmed to hate Pikachu. Who created them remains a mystery."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tekichu");

    }


}
