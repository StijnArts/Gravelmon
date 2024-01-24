package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wogfire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wogfire() {
        super("Wogfire",
                Type.FIRE,Type.POISON,
                new Stats(90,
                        85,
                        90,
                        60,
                        80,
                        55),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,2,0,0,0), 70,
                0.5,
                120, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The pores in its back lead to a sac of flammable, corrosive liquid. When Wogfire takes a blow, the liquid is forced out."),
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
           setLangFileName("Wogfire");

    }


}
