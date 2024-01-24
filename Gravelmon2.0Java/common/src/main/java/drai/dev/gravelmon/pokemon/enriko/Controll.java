package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Controll extends drai.dev.gravelmon.pokemon.Pokemon {
    public Controll() {
        super("Controll",
                Type.POISON,Type.DARK,
                new Stats(60,
                        75,
                        50,
                        50,
                        120,
                        60),
                List.of(Ability.REGENERATOR), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("It lives and hides under bridges and other man-made structures. When a person or Pokémon approaches, it sprays them with toxic spores."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Controll");

    }


}
