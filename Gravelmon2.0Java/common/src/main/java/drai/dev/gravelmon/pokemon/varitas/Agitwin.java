package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Agitwin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Agitwin() {
        super("Agitwin",
                Type.POISON,Type.PSYCHIC,
                new Stats(70,
                        20,
                        60,
                        75,
                        85,
                        40),
                List.of(Ability.MOODY), Ability.MOODY,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is made up of two separate entities that share a psychic link. Despite this, they oddly constantly act against each other in a struggle for dominance."),
                List.of(new EvolutionEntry("naeglerium", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,5),
                        new MoveLearnSetEntry(Move.SLUDGE,8),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,10),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,14),
                        new MoveLearnSetEntry(Move.TOXIC,20),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,33),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,38),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,45),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,47)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 25, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Agitwin");

    }


}
