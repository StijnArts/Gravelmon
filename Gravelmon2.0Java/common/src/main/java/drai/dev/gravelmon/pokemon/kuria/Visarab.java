package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Visarab extends drai.dev.gravelmon.pokemon.Pokemon {
    public Visarab() {
        super("Visarab",
                Type.BUG,Type.DRAGON,
                new Stats(72,
                        135,
                        96,
                        100,
                        81,
                        116),
                List.of(Ability.INTIMIDATE,Ability.RECKLESS), Ability.WEAK_ARMOR,
                19, 733,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Because it has focused all of its saved energy into achieving evolution, it has a short lifespan. Its wings will turn red and glow faintly, casting its bone-white body in an ominous red light."),
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
           setLangFileName("Visarab");

    }


}
