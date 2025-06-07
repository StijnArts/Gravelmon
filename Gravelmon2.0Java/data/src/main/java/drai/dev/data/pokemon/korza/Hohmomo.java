package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hohmomo extends drai.dev.data.pokemon.Pokemon {
    public Hohmomo() {
        super("Hohmomo",
                Type.DARK,Type.PSYCHIC,
                new Stats(140,
                        140,
                        60,
                        50,
                        100,
                        90),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                21, 853,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Believed to be an ancient, undead mon living in the Crown Forest and guarding a section of it from prying eyes. It's become a popular subject of fiction for enthusiasts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,11),
                        new MoveLearnSetEntry(Move.PSYWAVE,20),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,29),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,38),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,47),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,57),
                        new MoveLearnSetEntry(Move.BREAKDOWN,66),
                        new MoveLearnSetEntry(Move.BULK_UP,75),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,84),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,93)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hohmomo");

    }


}
