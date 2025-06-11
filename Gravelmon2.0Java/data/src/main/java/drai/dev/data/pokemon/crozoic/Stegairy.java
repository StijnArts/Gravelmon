package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stegairy extends drai.dev.data.pokemon.Pokemon {
    public Stegairy() {
        super("Stegairy",
                Type.FAIRY, Type.FLYING,
                new Stats(80,
                        50,
                        140,
                        75,
                        60,
                        65),
                List.of(Ability.SERENE_GRACE), Ability.SYMBIOSIS,
                18, 2210,
                new Stats(0,0,2,0,0,0), 140,
                0.5,
                165, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.DRAGON),
                List.of("It can fly by using its broad plates, even fearlessly leaping from cliffs to evade danger, so it's very rarely seen. It's proven quite easy to tame and ride."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPYSLAP,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.CAPTIVATE,1),
                        new MoveLearnSetEntry(Move.CLOUDCRASH,1),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,1),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Stegairy");

    }


}
