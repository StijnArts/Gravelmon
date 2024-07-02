package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianWobbuffet extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianWobbuffet(String name, Aspect aspect) {
        super(name, aspect, "Wobbuffet",
                Type.DARK,
                new Stats(190,
                        33,
                        58,
                        33,
                        58,
                        33),
                List.of(Ability.INTIMIDATE), Ability.SHADOW_TAG,
                13, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It cannot attack on its own, yet its glaring tail intimidates others into doing what it says. The main body seems to be unaware of this and simply thinks it's tougher than it actually is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COUNTER,1),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.INSTRUCT,1),
                        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm")
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 15, 40, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wobbuffet");
        addAdditionalEvolution("wynaut", new EvolutionEntry("wobbuffet varitasian", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15"))));

    }


}
