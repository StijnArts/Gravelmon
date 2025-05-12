package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ferrush extends drai.dev.data.pokemon.Pokemon {
    public Ferrush(Stats stats) {
        super("Ferrush",
                Type.STEEL, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ferrush seemingly defy known laws of physics through their ability to run on either side of the ocean surface with unmatched deftness. Though they primarily roam the photic zone, encounters with these fierce Pokemon on land have been documented."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.LEAFTURN,7),
                        new MoveLearnSetEntry(Move.RAGE,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.SCARY_FACE,24),
                        new MoveLearnSetEntry(Move.CRUNCH,31),
                        new MoveLearnSetEntry(Move.XSCISSOR,35),
                        new MoveLearnSetEntry(Move.THRASH,44),
                        new MoveLearnSetEntry(Move.VERDANTTAIL,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,62)
                ),
                List.of(Label.OCEANE),
                0, List.of(
        ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 42, 56, .5, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
        ), List.of(),
                List.of(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Ferrush");

    }


}
