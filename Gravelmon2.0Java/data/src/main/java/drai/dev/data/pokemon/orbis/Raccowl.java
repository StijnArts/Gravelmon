package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Raccowl extends drai.dev.data.pokemon.Pokemon {
    public Raccowl() {
        super("Raccowl",
                Type.NORMAL,
                new Stats(87,
                        73,
                        72,
                        43,
                        67,
                        98),
                List.of(Ability.KEEN_EYE,Ability.PICKUP), Ability.LONG_REACH,
                11, 240,
                new Stats(0,0,0,0,0,2), 255,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Thief Dark - TackleSTAB Normal - Growl Normal - Sand Attack Ground - Fling Dark - Odor Sleuth Normal - Tail Whip Normal - Play Rough Fairy - CovetSTAB Normal - Tail SlapSTAB Normal - Double-EdgeSTAB Normal - Belly Drum Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Raccowl");

    }


}
