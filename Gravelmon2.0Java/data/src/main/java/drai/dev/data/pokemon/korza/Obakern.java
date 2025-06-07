package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Obakern extends drai.dev.data.pokemon.Pokemon {
    public Obakern() {
        super("Obakern",
                Type.GHOST,
                new Stats(72,
                        69,
                        60,
                        70,
                        50,
                        92),
                List.of(Ability.CURSED_BODY), Ability.INFILTRATOR,
                9, 76,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Wild Rosarei often evolve after becoming a century old, their power reflected in how many souls they were able to consume. Often found along roads, making ignorant travelers stray from the path and get lost or disappear."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCREECH,4),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,10),
                        new MoveLearnSetEntry(Move.WILLOWISP,15),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,21),
                        new MoveLearnSetEntry(Move.GRUDGE,25),
                        new MoveLearnSetEntry(Move.DISABLE,29),
                        new MoveLearnSetEntry(Move.SPIRITFLAME,32),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,37),
                        new MoveLearnSetEntry(Move.CURSE,41),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,46),
                        new MoveLearnSetEntry(Move.PERISH_SONG,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,53)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Obakern");

    }


}
