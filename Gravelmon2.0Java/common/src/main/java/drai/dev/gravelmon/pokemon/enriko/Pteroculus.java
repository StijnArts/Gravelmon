package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Pteroculus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pteroculus() {
        super("Pteroculus",
                Type.POISON, Type.FLYING,
                new Stats(76,
                        54,
                        34,
                        104,
                        76,
                        112),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("Pteroculus live on mountainsides, not preferring the cramped confines of caves. An energy blast from its eye is enough to reduce rocks to powder."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,19),
                        new MoveLearnSetEntry(Move.POISON_JAB,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,33),
                        new MoveLearnSetEntry(Move.DEFOG,36),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.OUTRAGE,47)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, .06, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Pteroculus");

    }


}
