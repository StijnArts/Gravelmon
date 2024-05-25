package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crawjabby extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crawjabby() {
        super("Crawjabby",
                Type.FIGHTING,
                new Stats(55,
                        80,
                        55,
                        35,
                        55,
                        60),
                List.of(Ability.ANTICIPATION,Ability.FOREWARN,Ability.IRON_FIST), Ability.IRON_FIST,
                9, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.8,
                84, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.BUG),
                List.of("Crawjabby are aquatic Pokemon that take pride in their fists. They live in solitude, engaging other Crawjabby in violent boxing matches."),
                List.of(new EvolutionEntry("Lobbercut", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,16),
                        new MoveLearnSetEntry(Move.TWINEEDLE,21),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,26),
                        new MoveLearnSetEntry(Move.MEDITATE,34),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,45),
                        new MoveLearnSetEntry(Move.FEINT,54),
                        new MoveLearnSetEntry(Move.PURSUIT,63),
                        new MoveLearnSetEntry(Move.AGILITY,72),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,90)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crawjabby");

    }


}
