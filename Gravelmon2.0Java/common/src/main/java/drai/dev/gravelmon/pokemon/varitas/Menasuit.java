package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Menasuit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Menasuit() {
        super("Menasuit",
                Type.GHOST,
                new Stats(60,
                        45,
                        70,
                        85,
                        80,
                        75),
                List.of(Ability.SHADOW_TAG), Ability.OVERCOAT,
                11, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Menasuit often lurk in places like abandoned houses and dark alleys. They never attack, but rather stalk people persistently and feed off of their fear and uncertainty. If you're alone and see a figure out of the corner of your eye, chances are it's a Menasuit."),
                List.of(new EvolutionEntry("dapperition", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(      new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,3),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,6),
                        new MoveLearnSetEntry(Move.NUZZLE,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,14),
                        new MoveLearnSetEntry(Move.SPARK,18),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,23),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,27),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,30),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,35),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,38),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,43),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.LASH_OUT,52)                  ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 37, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Menasuit");

    }


}
