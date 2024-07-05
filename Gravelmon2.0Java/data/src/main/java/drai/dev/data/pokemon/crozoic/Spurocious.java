package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spurocious extends drai.dev.data.pokemon.Pokemon {
    public Spurocious(Stats stats) {
        super("Spurocious",
                Type.DARK,
                stats,
                List.of(Ability.SAND_FORCE,Ability.INTIMIDATE), Ability.RAZORFINS,
                17, 1324,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("It's largely lost the rowdy nature it had as a Sharpunk, replaced with a ruthless focus. When it smells something that's been injured, it will track it down and finish it off with its sharp claws and quills."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHEDFANGS,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.OBSTRUCT,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
           setLangFileName("Spurocious");

    }


}
