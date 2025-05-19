package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tankyard extends drai.dev.data.pokemon.Pokemon {
    public Tankyard() {
        super("Tankyard",
                Type.STEEL,
                new Stats(75,
                        100,
                        165,
                        50,
                        85,
                        25),
                List.of(Ability.WEAK_ARMOR,Ability.HEATPROOF,Ability.HEAVY_METAL), Ability.HEAVY_METAL,
                8, 165,
                new Stats(0,0,2,0,0,0), 105,
                0.0,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Tankyard laze around in junkyards waiting for new garbage to arrive. As soon as it comes, they start to compact it using their strong steel crushers. After being made into cubes, Tankyard will typically eat them in one bite."),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tankyard");

    }


}
