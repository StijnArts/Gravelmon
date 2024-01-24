package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Eucharite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eucharite() {
        super("Eucharite",
                Type.FIGHTING,Type.WATER,
                new Stats(70,
                        110,
                        70,
                        115,
                        70,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.0,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Upon evolution the water in its vessel has turned into a sweet red wine, which Eucharite shares freely with its following, never seeming to deplete no matter the numbers."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eucharite");

    }


}
