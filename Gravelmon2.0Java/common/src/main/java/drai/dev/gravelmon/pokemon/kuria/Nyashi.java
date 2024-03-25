package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nyashi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nyashi() {
        super("Nyashi",
                Type.GHOST,Type.FIGHTING,
                new Stats(52,
                        70,
                        47,
                        40,
                        49,
                        90),
                List.of(Ability.TOUGH_CLAWS,Ability.LIFEBLOOD), Ability.SHADOW_TAG,
                6, 55,
                new Stats(0,0,0,0,0,1), 45,
                0.0,
                83, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("There were rumors that Nyashi are actually deceased Pokémon, due to their pale, cold skin, and slow breathing pattern. However, numerous researches debunked that theory."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nyashi");

    }


}
