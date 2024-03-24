package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fribitad extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fribitad() {
        super("Fribitad",
                Type.GRASS,
                new Stats(41,
                        44,
                        36,
                        37,
                        42,
                        76),
                List.of(Ability.GLUTTONY,Ability.LEAF_GUARD,Ability.PICKUP), Ability.PICKUP,
                3, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With their vine tail, they swing from branch to branch to traverse through places. Because of their short arms, it uses its tail to grab and pickup items from out of reach."),
                List.of(new EvolutionEntry("ribivine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.PLUCK,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FEINT,15),
                        new MoveLearnSetEntry(Move.BOUNCE,20),
                        new MoveLearnSetEntry(Move.BULLET_SEED,24),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,32),
                        new MoveLearnSetEntry(Move.VINESWING,40),
                        new MoveLearnSetEntry(Move.POWER_WHIP,45),
                        new MoveLearnSetEntry(Move.AGILITY,50)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fribitad");

    }


}
