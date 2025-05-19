package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Banksund extends drai.dev.data.pokemon.Pokemon {
    public Banksund() {
        super("Banksund",
                Type.DARK,
                new Stats(85,
                        67,
                        68,
                        70,
                        80,
                        95),
                List.of(Ability.OWN_TEMPO,Ability.INFILTRATOR), Ability.MOODY,
                17, 720,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Seeing a Banksund is a rare occurance, as such, art done by these master painters are considered high value and are to be protected. It wraps its own tail around its mouth to protect itself from fumes and being identified."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.FACADE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,1),
                        new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.IMPRISON,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,26),
                        new MoveLearnSetEntry(Move.PAYBACK,28),
                        new MoveLearnSetEntry(Move.EMBARGO,30),
                        new MoveLearnSetEntry(Move.POISON_JAB,33),
                        new MoveLearnSetEntry(Move.DARK_PULSE,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,39),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,42)                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Banksund");

    }


}
