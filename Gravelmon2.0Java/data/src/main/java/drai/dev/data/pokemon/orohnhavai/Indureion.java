package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Indureion extends drai.dev.data.pokemon.Pokemon {
    public Indureion() {
        super("Indureion",
                Type.FAIRY, Type.GRASS,
                new Stats(90,
                        100,
                        80,
                        100,
                        90,
                        120),
                List.of(Ability.WHITEVIRTUE), Ability.WHITEVIRTUE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("A mystical Pokemon that taught the people patience and kindness. Many farmers and gardeners believe that with patience, Indureion will bless them with bountiful crops and successful planting. Many believe eating the crops blessed by Indureion will purify them of their envy and impatience."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Indureion");

    }


}
