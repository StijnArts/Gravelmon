package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Trashic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trashic() {
        super("Trashic",
                Type.POISON,Type.BUG,
                new Stats(30,
                        40,
                        35,
                        40,
                        50,
                        55),
                List.of(Ability.SWARM,Ability.POISON_TOUCH), Ability.LIQUID_OOZE,
                4, 80,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trashic");

    }


}
