package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Corpossum extends drai.dev.data.pokemon.Pokemon {
    public Corpossum() {
        super("Corpossum",
                Type.GHOST,Type.GROUND,
                new Stats(105,
                        60,
                        60,
                        85,
                        120,
                        65),
                List.of(Ability.CURSED_BODY), Ability.AFTERMATH,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                173, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("This mon comes about from Roadents who fail their roadside journeys. They lose their physical body, but gain immense power. The head is the only part left that's tangible."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.LICK,9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,17),
                        new MoveLearnSetEntry(Move.MUD_BOMB,22),
                        new MoveLearnSetEntry(Move.CURSE,27),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,33),
                        new MoveLearnSetEntry(Move.GRUDGE,38),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,42),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,47),
                        new MoveLearnSetEntry(Move.EARTH_POWER,54),
                        new MoveLearnSetEntry(Move.FISSURE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Corpossum");

    }


}
