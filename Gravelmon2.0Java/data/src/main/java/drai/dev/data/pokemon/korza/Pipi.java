package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pipi extends drai.dev.data.pokemon.Pokemon {
    public Pipi() {
        super("Pipi",
                Type.PSYCHIC,Type.FIRE,
                new Stats(70,
                        60,
                        70,
                        85,
                        80,
                        105),
                List.of(Ability.WONDER_SKIN), Ability.MAGIC_BOUNCE,
                8, 104,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Pipi originated from a far away region, but came to Korza mistaken as trade goods. They have since gone extinct in their original home, and have flourished in the Korza region. Pipi are able to turn into smoke and recede back into their tail, and stay this way for an unknown length of time."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,21),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,26),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,30),
                        new MoveLearnSetEntry(Move.POWER_SWAP,34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,39),
                        new MoveLearnSetEntry(Move.PSYSHOCK,43),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,47),
                        new MoveLearnSetEntry(Move.OVERHEAT,52),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,56),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pipi");

    }


}
