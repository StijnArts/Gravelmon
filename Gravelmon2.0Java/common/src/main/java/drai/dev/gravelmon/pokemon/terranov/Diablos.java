package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Diablos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diablos() {
        super("Diablos",
                Type.GROUND,
                new Stats(95,
                        130,
                        80,
                        70,
                        75,
                        105),
                List.of(Ability.RECKLESS), Ability.RECKLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Feared as tyrants of the desert, these Flying Wyverns attack any who stray into their territory. They use their huge horns in dash attacks to devastating effect. Their diet is comprised mostly of cacti."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Diablos");

    }


}
