package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Kellyp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kellyp() {
        super("Kellyp",
                Type.STEEL, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its scales give off a breathtakingly vibrant hue when touched by sunlight. Despite being a highly-coveted artistic resource, the method of incorporating the scales of Kellyp has thus far been a tightly-kept trade secret among only a few distinguished lineages."),
                List.of(new EvolutionEntry("ferrush", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
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
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 32, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Kellyp");

    }


}
