package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochMetapod extends drai.dev.data.pokemon.Pokemon {
    public EpochMetapod(String name, Aspect aspect) {
        super(name, aspect, "EpochMetapod",
                Type.BUG,Type.FAIRY,
                new Stats(50,
                        20,
                        55,
                        20,
                        25,
                        35),
                List.of(Ability.SHIELD_DUST,Ability.TINTED_LENS), Ability.SHED_SKIN,
                7, 99,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is very difficult for this Pokemon to protect itself because its eyes glow. If it opens its eyes, it gives away its location to potential predators."),
                List.of(new EvolutionEntry("epochbutterfree", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.PIXIEWAVE,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 10, 22, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Metapod");

    }


}
