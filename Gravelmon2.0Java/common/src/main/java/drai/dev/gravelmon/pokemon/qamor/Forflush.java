package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Forflush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Forflush() {
        super("Forflush",
                Type.POISON,Type.PSYCHIC,
                new Stats(54,
                        26,
                        52,
                        60,
                        66,
                        32),
                List.of(Ability.PERPLEXING), Ability.PERPLEXING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Forflush spend most of their life in a confused yet relaxed state due to the gasses that they release often at times of extreme stress. Not only can the gasses ward off predators and is completely harmless to this pokemon, but it also acts as a sort of stress reliever to them."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Forflush");

    }


}
