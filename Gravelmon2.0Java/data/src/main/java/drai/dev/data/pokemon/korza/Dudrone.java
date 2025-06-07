package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dudrone extends drai.dev.data.pokemon.Pokemon {
    public Dudrone() {
        super("Dudrone",
                Type.BUG,Type.FIGHTING,
                new Stats(65,
                        120,
                        65,
                        60,
                        62,
                        123),
                List.of(Ability.HONEY_GATHER), Ability.IRON_FIST,
                9, 349,
                new Stats(0,0,0,0,0,2), 90,
                1.0,
                166, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Dudrone focus on maintaining and protecting the hive. They battle each other in order to stay in shape for serious fights."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,26),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,28),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,31),
                        new MoveLearnSetEntry(Move.HELPING_HAND,35),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,38),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,41),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,44),
                        new MoveLearnSetEntry(Move.ENDURE,46),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,49),
                        new MoveLearnSetEntry(Move.LUNGE,53),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dudrone");

    }


}
