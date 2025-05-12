package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochWeedle extends drai.dev.data.pokemon.Pokemon {
    public EpochWeedle(String name, Aspect aspect) {
        super(name, aspect, "EpochWeedle",
                Type.BUG,Type.STEEL,
                new Stats(40,
                        20,
                        30,
                        50,
                        35,
                        20),
                List.of(Ability.ANALYTIC,Ability.SOUNDPROOF), Ability.WIMP_OUT,
                3, 32,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("No one will ever suspect an innocuous looking Weedle until it is too late to realize that it has been planting remote surveillance spy bots everywhere."),
                List.of(new EvolutionEntry("epochkakuna", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_CAGE,1),
                        new MoveLearnSetEntry(Move.QUICKSILVER,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 11, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weedle");

    }


}
