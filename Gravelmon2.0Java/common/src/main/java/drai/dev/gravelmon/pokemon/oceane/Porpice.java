package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Porpice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Porpice() {
        super("Porpice",
                Type.ICE,
                new Stats(52,
                        59,
                        51,
                        60,
                        62,
                        81),
                List.of(Ability.SLUSH_RUSH), Ability.UNBURDEN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                73, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("The two, dense pads on their back function as buoyancy devices. Should it fall ill, these will cease to function and Porpice won't be able to swim upright."),
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
           setLangFileName("Porpice");

    }


}
