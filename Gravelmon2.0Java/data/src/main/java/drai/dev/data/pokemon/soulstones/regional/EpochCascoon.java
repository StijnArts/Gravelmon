package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochCascoon extends drai.dev.data.pokemon.Pokemon {
    public EpochCascoon(String name, Aspect aspect) {
        super(name, aspect, "EpochCascoon",
                Type.BUG,Type.ICE,
                new Stats(40,
                        50,
                        65,
                        15,
                        20,
                        55),
                List.of(Ability.ICE_BODY,Ability.CLEAR_BODY), Ability.OVERCOAT,
                7, 115,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("During its cocoon stage, one of its strategies is to stay perfectly still to blend into snow and avoid predators until it evolves."),
                List.of(new EvolutionEntry("epoch dustox", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,5),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.ICE_BALL,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 26, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cascoon");

    }


}
