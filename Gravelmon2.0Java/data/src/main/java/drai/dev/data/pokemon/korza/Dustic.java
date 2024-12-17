package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dustic extends drai.dev.data.pokemon.Pokemon {
    public Dustic() {
        super("Dustic",
                Type.GROUND,Type.ELECTRIC,
                new Stats(52,
                        21,
                        60,
                        68,
                        53,
                        70),
                List.of(Ability.STATIC,Ability.SHIELD_DUST), Ability.PLUS,
                4, 50,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                65, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Often found infesting abandoned buildings, where there's lots of dust to cover their fur in. Dustic rub their bodies across surfaces to create a static charge."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dustic");

    }


}
