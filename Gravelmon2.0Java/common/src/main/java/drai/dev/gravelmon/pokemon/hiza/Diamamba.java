package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Diamamba extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diamamba() {
        super("Diamamba",
                Type.POISON,Type.STEEL,
                new Stats(55,
                        70,
                        140,
                        70,
                        140,
                        60),
                List.of(Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                8, 165,
                new Stats(0,0,1,1,1,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Rattletack who didn't shed its skin enough will have it harden and become Diamamba. Its fangs are hard as diamond and can pierce through the hardest armor."),
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
           setLangFileName("Diamamba");

    }


}
