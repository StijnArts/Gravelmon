package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Musipede extends drai.dev.data.pokemon.Pokemon {
    public Musipede() {
        super("Musipede",
                Type.BUG,
                new Stats(65,
                        50,
                        100,
                        90,
                        75,
                        80),
                List.of(Ability.SWARM), Ability.SWARM,
                7, 165,
                new Stats(0,0,0,1,0,0), 100,
                0.5,
                151, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They emit sounds as the move which can be easily distinguished in the forest. With a great variation of pitch and volume, its rare to find two Musipedes that sound the same."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,14),
                        new MoveLearnSetEntry(Move.SING,18),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.XSCISSOR,30),
                        new MoveLearnSetEntry(Move.SCREECH,34),
                        new MoveLearnSetEntry(Move.FELL_STINGER,36),
                        new MoveLearnSetEntry(Move.TAUNT,38),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                        new MoveLearnSetEntry(Move.STICKY_WEB,44),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,46),
                        new MoveLearnSetEntry(Move.PERISH_SONG,50)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Musipede");

    }


}
