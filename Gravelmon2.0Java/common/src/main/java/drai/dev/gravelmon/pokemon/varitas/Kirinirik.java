package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import drai.dev.gravelsextendedbattles.resorting.*;

import java.util.*;


public class Kirinirik extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kirinirik(Stats stats) {
        super("Kirinirik",
                Type.DRAGON, Type.PSYCHIC,
                stats,
                List.of(Ability.INNER_FOCUS,Ability.INTIMIDATE,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                19, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kirinirik's lighter head prefers to approach situations calmly and analytically, while its darker head is much more brash and violent so they don't often get along. However, if Kirinirik's heads both focus their energy in tandem, they are capable of unleashing tremendous mystic power."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXTRASENSORY,1),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,48),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.SCARY_FACE,54)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 65, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kirinirik");
        addAdditionalEvolution("girafarig", new EvolutionEntry("kirinirik", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.OUTRAGE.getName()+"\""))));
        GravelmonMoveSubstitution.registerMoveInsertion("girafarig", new MoveLearnSetEntry(Move.OUTRAGE, 55));

    }


}
