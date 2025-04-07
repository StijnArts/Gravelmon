package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fididdle extends drai.dev.data.pokemon.Pokemon {
    public Fididdle() {
        super("Fididdle",
                Type.NORMAL,
                new Stats(60,
                        60,
                        70,
                        70,
                        80,
                        100),
                List.of(Ability.CUTE_CHARM,Ability.SOUNDPROOF), Ability.SERENE_GRACE,
                7, 39,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                154, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Fididdle love to play music with the sticks they hide in their bushy tails. It is unknown whether they inspired fiddles, or whether they copied the instruments."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,4),
                        new MoveLearnSetEntry(Move.SING,9),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.COPYCAT,19),
                        new MoveLearnSetEntry(Move.COVET,23),
                        new MoveLearnSetEntry(Move.MIMIC,28),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,33),
                        new MoveLearnSetEntry(Move.PERISH_SONG,37),
                        new MoveLearnSetEntry(Move.ENCORE,42),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,46),
                        new MoveLearnSetEntry(Move.HEAL_BELL,50),
                        new MoveLearnSetEntry(Move.WISH,55),
                        new MoveLearnSetEntry(Move.BOOMBURST,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fididdle");

    }


}
