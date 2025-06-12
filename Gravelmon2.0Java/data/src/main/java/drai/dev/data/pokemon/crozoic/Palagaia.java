package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Palagaia extends drai.dev.data.pokemon.Pokemon {
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
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Palagaia");

    }


}
