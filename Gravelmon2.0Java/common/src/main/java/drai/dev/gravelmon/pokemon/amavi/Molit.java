package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Molit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Molit() {
        super("Molit",
                Type.NORMAL,
                new Stats(45,
                        25,
                        50,
                        45,
                        55,
                        40),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                7, 61,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Early Route Normal Rodent Pokemon ----'Molite's nascent light powers only allow it to emit a weak glow to call for help when in danger.'"),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Molit");

    }


}
