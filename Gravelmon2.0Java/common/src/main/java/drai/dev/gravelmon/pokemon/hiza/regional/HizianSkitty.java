package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianSkitty extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianSkitty() {
        super("Skitty",
                Type.FAIRY,
                new Stats(50,
                        45,
                        45,
                        35,
                        35,
                        50),
                List.of(Ability.FLUFFY), Ability.FLUFFY,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.25,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("They are extremely playful and full of energy, once all that energy is burned they fall asleep for many hours."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skitty");

    }


}
