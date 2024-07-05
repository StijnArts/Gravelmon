package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chucheek extends drai.dev.data.pokemon.Pokemon {
    public Chucheek() {
        super("Chucheek",
                Type.NORMAL,
                new Stats(65,
                        50,
                        50,
                        35,
                        25,
                        20),
                List.of(Ability.RUN_AWAY,Ability.TECHNICIAN), Ability.CHEEK_POUCH,
                3, 21,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Chucheek can use their tails as a fifth limb, hanging from branches and stems as they search for food."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chucheek");

    }


}
