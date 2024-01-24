package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Camozoic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Camozoic() {
        super("Camozoic",
                Type.ROCK,Type.GROUND,
                new Stats(85,
                        75,
                        90,
                        75,
                        90,
                        65),
                List.of(Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                168, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Camozoic");

    }


}
