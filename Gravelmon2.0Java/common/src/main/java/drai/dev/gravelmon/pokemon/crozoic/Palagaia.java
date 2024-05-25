package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Palagaia extends drai.dev.gravelmon.pokemon.Pokemon {
    public Palagaia(Stats stats) {
        super("Palagaia",
                Type.STEEL,
                stats,
                List.of(Ability.STALWART,Ability.BATTLE_ARMOR), Ability.SHARPNESS,
                17, 2240,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Powerful swipes from its tail can easily fell a tree. In ancient times, its fossils had been used to forge weapons and armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SOLARCHARGER,"tm")                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palagaia");

    }


}
