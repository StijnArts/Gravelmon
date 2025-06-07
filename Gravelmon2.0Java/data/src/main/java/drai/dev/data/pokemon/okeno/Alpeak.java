package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Alpeak extends drai.dev.data.pokemon.Pokemon {
    public Alpeak() {
        super("Alpeak",
                Type.NORMAL, Type.ICE,
                new Stats(102,
                        94,
                        90,
                        60,
                        91,
                        94),
                List.of(Ability.FUR_COAT), Ability.MOUNTAINEER,
                8, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                230, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Alpeak's thick fur protects it from the cold of the mountain summits it lives in."),
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
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Alpeak");

    }


}
