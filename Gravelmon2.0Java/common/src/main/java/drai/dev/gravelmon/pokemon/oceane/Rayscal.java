package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rayscal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rayscal() {
        super("Rayscal",
                Type.DARK,
                new Stats(40,
                        80,
                        40,
                        50,
                        40,
                        60),
                List.of(Ability.UNDERLING), Ability.UNNERVE,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("They make their home in deep, ocean trenches lined with geothermal vents. The sight of Rayscal swooping in the darkness among the burning towers is thought to have inspired our concept of hell."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rayscal");

    }


}
