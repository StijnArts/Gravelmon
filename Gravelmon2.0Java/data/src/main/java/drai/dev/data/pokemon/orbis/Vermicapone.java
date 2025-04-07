package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vermicapone extends drai.dev.data.pokemon.Pokemon {
    public Vermicapone() {
        super("Vermicapone",
                Type.DARK, Type.POISON,
                new Stats(95,
                        100,
                        80,
                        45,
                        90,
                        80),
                List.of(Ability.STAKEOUT,Ability.GUTS), Ability.POISON_TOUCH,
                14, 610,
                new Stats(0,3,0,0,0,0), 45,
                0.75,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Poison FangSTAB Poison - Scary Face Normal - BiteSTAB Dark - Swords Dance Normal 4 Quick Attack Normal 10 Hyper Fang Normal 15 Beat UpSTAB Dark 19 CrunchSTAB Dark 23 Parting Shot Dark 28 Super Fang Normal 31 Torment Dark 34 Sucker PunchSTAB Dark 38 Foul PlaySTAB Dark 40 Toxic Poison 43 ComeuppanceSTAB Dark 48 Double-Edge Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.HYPER_FANG,10),
                        new MoveLearnSetEntry(Move.BEAT_UP,15),
                        new MoveLearnSetEntry(Move.CRUNCH,19),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,23),
                        new MoveLearnSetEntry(Move.SUPER_FANG,28),
                        new MoveLearnSetEntry(Move.TORMENT,31),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,34),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,38),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.COMEUPPANCE,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vermicapone");

    }


}
