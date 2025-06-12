package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nitecrawler extends drai.dev.data.pokemon.Pokemon {
    public Nitecrawler() {
        super("Nitecrawler",
                Type.BUG, Type.GHOST,
                new Stats(70,
                        125,
                        65,
                        125,
                        95,
                        90),
                List.of(Ability.POWERLEECH), Ability.DARKHOLD,
                22, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The grudges from countless bugs killed in hatred have coalesced into this pokemon. It rises during the full moon to take revenge, using its crawling tendrils to feed."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SPITE,7),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,21),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,25),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,33),
                        new MoveLearnSetEntry(Move.TAILWIND,38),
                        new MoveLearnSetEntry(Move.CORROSIVEBITE,43),
                        new MoveLearnSetEntry(Move.STICKY_WEB,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,52),
                        new MoveLearnSetEntry(Move.NIGHTMARE,59)            ),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nitecrawler");

    }


}
