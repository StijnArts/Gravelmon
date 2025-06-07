package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Obideion extends drai.dev.data.pokemon.Pokemon {
    public Obideion() {
        super("Obideion",
                Type.FAIRY, Type.WATER,
                new Stats(120,
                        70,
                        70,
                        120,
                        90,
                        110),
                List.of(Ability.WHITEVIRTUE), Ability.WHITEVIRTUE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("A mystical Pokemon that taught the people ambition and hope. Long ago, a large river flowed through the islands but then went dry. The people prayed and hoped for the river to come back. Until one day, Obideion appeared and made the river flow again. Because of this, Obideion has been a symbol of ambition and hope. They say swimming in the river is good luck to achieving one's ambitions. Drinking from the river will purify those of their dishonesty and hatred."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Obideion");

    }


}
