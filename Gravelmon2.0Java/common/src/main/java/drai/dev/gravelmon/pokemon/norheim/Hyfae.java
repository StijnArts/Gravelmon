package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hyfae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hyfae() {
        super("Hyfae",
                Type.GRASS,Type.FAIRY,
                new Stats(125,
                        65,
                        65,
                        130,
                        80,
                        50),
                List.of(Ability.CHLOROPHYLL,Ability.SOUNDPROOF,Ability.PIXILATE), Ability.PIXILATE,
                8, 165,
                new Stats(1,0,0,2,0,0), 75,
                0.5,
                232, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Not even the greatest vocal coach can learn its song techniques. It is a wonder that this Pokémon can produce sound at all; while having such a long neck."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hyfae");

    }


}
