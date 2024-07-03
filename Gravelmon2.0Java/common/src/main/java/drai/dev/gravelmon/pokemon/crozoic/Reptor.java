package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Reptor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reptor(Stats stats) {
        super("Reptor",
                Type.DRAGON, Type.ROCK,
                stats,
                List.of(Ability.WEAK_ARMOR,Ability.QUICK_FEET), Ability.OPPORTUNIST,
                13, 608,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("An armored pack hunter that uses speed and cunning to bring down its prey. However, it seems to have mysteriously appeared in its environment very suddenly, suggesting an unnatural origin."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TOMBSTONER,1),
                        new MoveLearnSetEntry(Move.ENDEAVOR,1),
                        new MoveLearnSetEntry(Move.BONE_RUSH,1),
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reptor");

    }


}
