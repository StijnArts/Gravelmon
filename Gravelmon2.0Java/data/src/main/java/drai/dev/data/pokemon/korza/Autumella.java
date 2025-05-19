package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Autumella extends drai.dev.data.pokemon.Pokemon {
    public Autumella() {
        super("Autumella",
                Type.BUG,Type.POISON,
                new Stats(82,
                        94,
                        58,
                        92,
                        68,
                        76),
                List.of(Ability.SHIELD_DUST), Ability.LEAF_GUARD,
                11, 259,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                212, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("At the start of Fall, a mass evolution of Automella occurs, making this mon the poster child of the season. Toxic dust is stored in its hair bristles, ready to coat potential threats."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,19),
                        new MoveLearnSetEntry(Move.HAZARDCLOUD,23),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,27),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,31),
                        new MoveLearnSetEntry(Move.SILVER_WIND,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.LEAF_STORM,45),
                        new MoveLearnSetEntry(Move.ROOST,49),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,52),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,57),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Autumella");

    }


}
