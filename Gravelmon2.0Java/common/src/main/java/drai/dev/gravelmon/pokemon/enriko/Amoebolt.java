package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Amoebolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amoebolt() {
        super("Amoebolt",
                Type.WATER,Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.POISON_HEAL), Ability.COLOR_CHANGE,
                8, 165,
                new Stats(0,0,0,2,0,0), 80,
                0.5,
                172, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_2),
                List.of("Pollutants processed by its cytoplasm are converted into electrical energy. This makes it one of the most versatile Pokémon when it comes to environmental preservation, being both a reliable source of renewable energy and a cleaner of oceanic pollution."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amoebolt");

    }


}
