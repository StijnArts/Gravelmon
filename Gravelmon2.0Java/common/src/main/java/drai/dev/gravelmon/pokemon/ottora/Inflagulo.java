package drai.dev.gravelmon.pokemon.ottora;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Inflagulo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inflagulo() {
        super("Inflagulo",
                Type.FIRE,
                new Stats(40,
                        60,
                        60,
                        55,
                        40,
                        60),
                List.of(Ability.BLAZE), Ability.TOUGH_CLAWS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Inflagulo are often hot headed and brash. It's seen rarely in autumnal forests, charring berries before tucking in."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inflagulo");

    }


}
