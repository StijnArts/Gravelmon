package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Eskiflurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eskiflurr() {
        super("Eskiflurr",
                Type.ICE, Type.FAIRY,
                new Stats(96,
                        32,
                        77,
                        82,
                        87,
                        68),
                List.of(Ability.CUTE_CHARM,Ability.TECHNICIAN,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(2,0,0,2,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Eskiflurr have very soft and silky fur that lock in heat to help it withstand extremely cold temperatures while the ice crystals lining its body help it to endure extreme heat. This species is in danger of extinction because its highly valuable fur and ice crystals being used for clothing and jewelry, making them hard to find in the wild or with Trainers."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eskiflurr");

    }


}
