package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snoel extends drai.dev.data.pokemon.Pokemon {
    public Snoel() {
        super("Snoel",
                Type.ICE,Type.FAIRY,
                new Stats(63,
                        72,
                        55,
                        92,
                        64,
                        103),
                List.of(Ability.ICE_BODY,Ability.PIXILATE), Ability.SNOW_WARNING,
                4, 73,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                157, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("When snow falls, they like to congregate in populated areas and sing to passerby. Snoel are seen as symbols of the winter season."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,4),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,13),
                        new MoveLearnSetEntry(Move.MIST,17),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.FROST_BREATH,28),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,33),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,41),
                        new MoveLearnSetEntry(Move.WISH,46),
                        new MoveLearnSetEntry(Move.BLIZZARD,50),
                        new MoveLearnSetEntry(Move.MOONBLAST,55)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Snoel");

    }


}
