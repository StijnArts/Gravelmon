package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hippony extends drai.dev.data.pokemon.Pokemon {
    public Hippony() {
        super("Hippony",
                Type.WATER,
                new Stats(55,
                        45,
                        45,
                        65,
                        60,
                        50),
                List.of(Ability.TORRENT), Ability.DAZZLING,
                5, 45,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Hippony are loved by young kids because of their playful attitude. They can create colorful bubbles, used to put on shows or to distract opponents in battle."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hippony");

    }


}
