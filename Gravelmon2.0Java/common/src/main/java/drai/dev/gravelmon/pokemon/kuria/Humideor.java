package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Humideor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Humideor() {
        super("Humideor",
                Type.WATER,Type.COSMIC,
                new Stats(90,
                        60,
                        100,
                        100,
                        90,
                        62),
                List.of(Ability.UNAWARE,Ability.HUMIDIFY), Ability.WATER_BUBBLE,
                6, 199,
                new Stats(0,0,1,1,0,0), 45,
                0.5,
                184, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Humideor keeps everything in a kilometer distance humid merely by being there. Due to the water released from its ears, it requires constant absorption of liters of water to survive."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Humideor");

    }


}
