package drai.dev.gravelmon.pokemon.urzavos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bateeny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bateeny() {
        super("Bateeny",
                Type.FLYING, Type.GROUND,
                new Stats(35,
                        35,
                        34,
                        32,
                        34,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bateeny");

    }


}
