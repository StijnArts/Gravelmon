package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Porytleg extends drai.dev.data.pokemon.Pokemon {
    public Porytleg() {
        super("Porytleg",
                Type.ELECTRIC,
                new Stats(60,
                        60,
                        60,
                        60,
                        60,
                        60),
                List.of(Ability.INFESTEDDRIVE,Ability.SIMPLE,Ability.DOWNLOAD), Ability.DOWNLOAD,
                5, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("(breed porygon in enriko to hatch porytleg.) The result of an indecent attempt to replicate Porygon's code. They're inferior to Porygon and are infamously vulnerable to diseases and parasites."),
                List.of(new EvolutionEntry("porytlegz", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:dubious_disc")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,4),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,7),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,12),
                        new MoveLearnSetEntry(Move.INFESTATION,15),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,18),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,24),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,28),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,34),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,38),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,42),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,47)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 15, 40, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Porytleg");

    }


}
