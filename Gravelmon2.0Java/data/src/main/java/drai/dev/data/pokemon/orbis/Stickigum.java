package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stickigum extends drai.dev.data.pokemon.Pokemon {
    public Stickigum() {
        super("Stickigum",
                Type.FAIRY,
                new Stats(95,
                        20,
                        15,
                        40,
                        120,
                        20),
                List.of(Ability.THICK_FAT), Ability.MISTY_SURGE,
                3, 20,
                new Stats(0,0,0,0,1,0), 230,
                0.5,
                101, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stickigum");

    }


}
