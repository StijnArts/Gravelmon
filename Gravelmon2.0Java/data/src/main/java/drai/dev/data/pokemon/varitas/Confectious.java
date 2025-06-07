package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Confectious extends drai.dev.data.pokemon.Pokemon {
    public Confectious() {
        super("Confectious",
                Type.FAIRY, Type.POISON,
                new Stats(95,
                        55,
                        70,
                        55,
                        70,
                        10),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD,Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(1,0,0,0,0,0), 225,
                0.0,
                71, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("It is a being of discarded candy that somehow gained sentience and now roams the fairgrounds searching for more sweets to eat. It ensnares opponents in a sticky sugary goo that's nearly impossible to escape by force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.SPIT_UP,17),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,23),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,27),
                        new MoveLearnSetEntry(Move.BELCH,36),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,40),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,44),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Confectious");

    }


}
