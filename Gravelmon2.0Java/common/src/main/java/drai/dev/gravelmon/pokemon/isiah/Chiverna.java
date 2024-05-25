package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chiverna extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chiverna() {
        super("Chiverna",
                Type.POISON, Type.DRAGON,
                new Stats(76,
                        102,
                        75,
                        87,
                        69,
                        89),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,19),
                        new MoveLearnSetEntry(Move.POISON_JAB,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,34),
                        new MoveLearnSetEntry(Move.DEFOG,37),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,46),
                        new MoveLearnSetEntry(Move.OUTRAGE,50)              ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 39, 52, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chiverna");

    }


}
