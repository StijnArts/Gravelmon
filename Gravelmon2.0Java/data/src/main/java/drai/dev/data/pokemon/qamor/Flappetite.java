package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Flappetite extends drai.dev.data.pokemon.Pokemon {
    public Flappetite() {
        super("Flappetite",
                Type.NORMAL, Type.DARK,
                new Stats(140,
                        80,
                        100,
                        75,
                        85,
                        15),
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                23, 165,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Flappetite is never satisfied and always want to feed more. It threatens passing by pokemon and trainers into giving it all their food. There are rumors of trainers going into the forest and running into a Flappetite, and- after having nothing to offer it- getting gobbled up whole!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHOVEOFF,1)       ,
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.WHIRLWIND,17),
                        new MoveLearnSetEntry(Move.TWISTER,21),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,25),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.WING_ATTACK,33),
                        new MoveLearnSetEntry(Move.ROOST,37),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,45),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.HURRICANE,53)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ISLAND, Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flappetite");

    }


}
