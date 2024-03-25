package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Searell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Searell() {
        super("Searell",
                Type.NORMAL,Type.FIRE,
                new Stats(65,
                        90,
                        65,
                        90,
                        65,
                        90),
                List.of(Ability.STEADFAST), Ability.FRISK,
                12, 80,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Searell can ignite the seeds it keeps in it's cheeks to use for attacks. With their tail being very fluffy and warm, smaller Pokémon love to curl up in them on cold nights."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Searell");

    }


}
