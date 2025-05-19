package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Weavault extends drai.dev.data.pokemon.Pokemon {
    public Weavault() {
        super("Weavault",
                Type.NORMAL,Type.DARK,
                new Stats(52,
                        93,
                        46,
                        52,
                        58,
                        114),
                List.of(Ability.JUMPIN), Ability.PICKPOCKET,
                9, 54,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                145, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Weavault aggressively defends its territory and conquers others. It can jump so high that some believe it's capable of flight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,4),
                        new MoveLearnSetEntry(Move.SCREECH,9),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,17),
                        new MoveLearnSetEntry(Move.TRICK,21),
                        new MoveLearnSetEntry(Move.BOUNCE,26),
                        new MoveLearnSetEntry(Move.THIEF,31),
                        new MoveLearnSetEntry(Move.COIL,35),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.DIG,46),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,51),
                        new MoveLearnSetEntry(Move.ME_FIRST,55),
                        new MoveLearnSetEntry(Move.TAUNT,59),
                        new MoveLearnSetEntry(Move.SKULL_BASH,63),
                        new MoveLearnSetEntry(Move.SPLASH,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Weavault");

    }


}
