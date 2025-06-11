package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanMachoke extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanMachoke(String name, Aspect aspect) {
        super(name, aspect, "Machoke",
                Type.ROCK,Type.GHOST,
                new Stats(80,
                        101,
                        70,
                        45,
                        50,
                        60),
                List.of(Ability.DISGUISE), null,
                15, 705,
                new Stats(0,2,0,0,0,0), 90,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Machoke lleva un cinturón para controlar su abrumadora energía. Como es tan peligroso, nadie se lo ha quitado nunca."),
                List.of(new EvolutionEntry("machamp africanusan", EvolutionType.TRADE, List.of(),
                        List.of())),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,32),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,30),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.ROCK_THROW,19),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55),
                        new MoveLearnSetEntry(Move.ACCELEROCK,15),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,36),
                        new MoveLearnSetEntry(Move.POWER_GEM,44),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,10),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,51)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Machoke");

    }


}
