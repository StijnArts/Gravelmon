package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Graplarock extends drai.dev.data.pokemon.Pokemon {
    public Graplarock() {
        super("Graplarock",
                Type.ROCK,Type.FIGHTING,
                new Stats(55,
                        85,
                        130,
                        50,
                        120,
                        60),
                List.of(Ability.RECKLESS,Ability.BATTLE_ARMOR), Ability.POWERLIFTER,
                15, 1460,
                new Stats(0,0,2,0,1,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("It flings and smashes heavy boulders to rubble to show off the strength of its rock-arms. Graplarock can utilize a variety of brutal grabs, swings and throws to take down its opponents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,1),
                        new MoveLearnSetEntry(Move.GROUNDBREAK,1),
                        new MoveLearnSetEntry(Move.UPPERHAND,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Graplarock");

    }


}
