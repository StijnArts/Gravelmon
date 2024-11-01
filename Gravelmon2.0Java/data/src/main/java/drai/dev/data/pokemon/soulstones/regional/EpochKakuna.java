package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochKakuna extends drai.dev.data.pokemon.Pokemon {
    public EpochKakuna(String name, Aspect aspect) {
        super(name, aspect, "EpochKakuna",
                Type.BUG,Type.STEEL,
                new Stats(45,
                        20,
                        40,
                        25,
                        35,
                        40),
                List.of(Ability.SHED_SKIN,Ability.SHIELD_DUST), Ability.WIMP_OUT,
                6, 100,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is used for surveillance measures and employs an innocuous Kakuna disguise to avoid attracting attention."),
                List.of(new EvolutionEntry("epoch beedrill", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_CAGE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.QUICKSILVER,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 19, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kakuna");

    }


}
