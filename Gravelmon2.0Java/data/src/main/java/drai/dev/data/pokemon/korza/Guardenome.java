package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Guardenome extends drai.dev.data.pokemon.Pokemon {
    public Guardenome() {
        super("Guardenome",
                Type.NORMAL,Type.ROCK,
                new Stats(96,
                        73,
                        132,
                        67,
                        102,
                        55),
                List.of(Ability.SAP_SIPPER), Ability.FLOWER_VEIL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                184, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MINERAL),
                List.of("Guardenome are gentle giants, preferring to avoid conflicts that will damage the plants in their care. Rather than becoming furious at their garden's damage, they will just be sad. --- New Ability: Gardener: 'Powers up Grass-type moves.'"),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Guardenome");

    }


}
