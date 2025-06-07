package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kecleon extends drai.dev.data.pokemon.Pokemon {
    public Kecleon() {
        super("Kecleon",
                Type.NORMAL,
                new Stats(60,
                        90,
                        70,
                        60,
                        120,
                        40),
                List.of(Ability.COLOR_CHANGE), Ability.PROTEAN,
                8, 165,
                new Stats(0,0,0,0,2,0), 200,
                0.5,
                154, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Thief Dark - Tail Whip Normal - Astonish Ghost - Lick Ghost - ScratchSTAB Normal - Scale Shot Dragon - Foul Play Dark 4 BindSTAB Normal 7 Shadow Sneak Ghost 10 FeintSTAB Normal 13 Fury SwipesSTAB Normal 16 Feint Attack Dark 18 Psybeam Psychic 21 Ancient Power Rock 25 SlashSTAB Normal 30 Camouflage Normal 33 Shadow Claw Ghost 38 Screech Normal 42 Substitute Normal 46 Sucker Punch Dark 50 Synchronoise Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.BIND,4),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,7),
                        new MoveLearnSetEntry(Move.FEINT,10),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,18),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,21),
                        new MoveLearnSetEntry(Move.SLASH,25),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,30),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,33),
                        new MoveLearnSetEntry(Move.SCREECH,38),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,46),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kecleon");

    }


}
