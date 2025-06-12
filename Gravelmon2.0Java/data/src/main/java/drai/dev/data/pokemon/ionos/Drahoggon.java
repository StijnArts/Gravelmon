package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drahoggon extends drai.dev.data.pokemon.Pokemon {
    public Drahoggon() {
        super("Drahoggon",
                Type.DRAGON, Type.NORMAL,
                new Stats(110,
                        120,
                        90,
                        90,
                        70,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Drahoggon represents the wild nature of every Pokémon. It's always on a rampage and has never been seen standing still."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,7),
                        new MoveLearnSetEntry(Move.TAUNT,11),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,14),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,18),
                        new MoveLearnSetEntry(Move.BITE,23),
                        new MoveLearnSetEntry(Move.UTURN,27),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,36),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,51),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,57)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Drahoggon");

    }


}
