package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Alpacoat extends drai.dev.data.pokemon.Pokemon {
    public Alpacoat() {
        super("Alpacoat",
                Type.NORMAL, Type.ICE,
                new Stats(80,
                        80,
                        74,
                        58,
                        74,
                        88),
                List.of(Ability.FUR_COAT), Ability.MOUNTAINEER,
                8, 165,
                new Stats(0,0,1,0,0,1), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Jump Kick Fighting Lick Ghost Endure Normal Milk Drink Normal Stockpile Normal Spit UpSTAB Normal Swallow Normal Icicle CrashSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MILK_DRINK,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Alpacoat");

    }


}
