package drai.dev.data.pokemon.orohnhavai.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class HavaiianBlipbug extends drai.dev.data.pokemon.Pokemon {
    public HavaiianBlipbug() {
        super("Blipbug",
                Type.BUG, Type.GROUND,
                new Stats(25,
                        20,
                        20,
                        25,
                        45,
                        45),
                List.of(Ability.SWARM), Ability.COMPOUND_EYES,
                8, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("These variants of Blipbug are physically stronger than their other discovered forms. They are often found underground, where they dig complex tunnels and collect minerals needed for their growing bodies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Blipbug");

    }


}
