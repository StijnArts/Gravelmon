package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochWurmpleOne extends drai.dev.data.pokemon.Pokemon {
    public EpochWurmpleOne(String name, Aspect aspect) {
        super(name, aspect, "EpochWurmpleOne",
                Type.BUG,Type.ICE,
                new Stats(45,
                        45,
                        35,
                        20,
                        20,
                        30),
                List.of(Ability.ICE_BODY,Ability.GLUTTONY), Ability.COMPOUND_EYES,
                3, 36,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its carapace allows it to shelter from cold temperatures so it is often found in snowy forests and tundras."),
                List.of(new EvolutionEntry("epoch cascoon", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,5),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.ICE_BALL,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wurmple");

    }


}
