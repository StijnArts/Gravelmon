package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chamot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chamot() {
        super("Chamot",
                Type.GROUND,Type.GRASS,
                new Stats(45,
                        30,
                        95,
                        30,
                        38,
                        22),
                List.of(Ability.STORM_DRAIN), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Chamot find abandoned clay pots to protect themselves from the harsh environment. During ancient times, tribesmen would often adorn their Chamot's pots with gold and silver embellishments."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chamot");

    }


}
