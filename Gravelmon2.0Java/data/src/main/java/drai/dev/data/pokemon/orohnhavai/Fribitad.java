package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Fribitad extends drai.dev.data.pokemon.Pokemon {
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
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fribitad");

    }


}
