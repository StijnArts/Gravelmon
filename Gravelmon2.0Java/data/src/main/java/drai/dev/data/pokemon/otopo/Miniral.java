package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Miniral extends drai.dev.data.pokemon.Pokemon {
    public Miniral() {
        super("Miniral",
                Type.ROCK,
                new Stats(40,
                        60,
                        80,
                        40,
                        40,
                        40),
                List.of(Ability.ROCK_HEAD), Ability.ROCKFALL,
                4, 200,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Miniral are rock type Pokemon that may be found in fields and mountains. They are thought to be ordinary pebbles until they start walking! People frequently mistake them for pebbles whilst they rest and step or trip over them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.MAGNITUDE,7),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.ROCK_THROW,13),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,16),
                        new MoveLearnSetEntry(Move.SANDSTORM,18),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,20),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,25),
                        new MoveLearnSetEntry(Move.BULLDOZE,30),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.EXPLOSION,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,55),
                        new MoveLearnSetEntry(Move.STONE_EDGE,60)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Miniral");

    }


}
