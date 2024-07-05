package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lushan extends drai.dev.data.pokemon.Pokemon {
    public Lushan() {
        super("Lushan",
                Type.ROCK, Type.LIGHT,
                new Stats(86,
                        70,
                        114,
                        105,
                        94,
                        56),
                List.of(Ability.STURDY), Ability.SAP_SIPPER,
                16, 3000,
                new Stats(0,0,1,1,0,0), 90,
                0.5,
                194, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("Lushan spends all its life eating minerals in hopes of finding rare gems. The more gems it eats, the more power it can hold within. They can use this energy to fire devastating beams of light."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.BLOCK,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.COUNTER,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55)                   ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 56, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.AMETHYST_GEODE),
                0.28, 0.3,
                List.of());
           setLangFileName("Lushan");

    }


}
