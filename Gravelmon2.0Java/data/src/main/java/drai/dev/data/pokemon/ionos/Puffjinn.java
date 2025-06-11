package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Puffjinn extends drai.dev.data.pokemon.Pokemon {
    public Puffjinn() {
        super("Puffjinn",
                Type.ICE, Type.FAIRY,
                new Stats(140,
                        50,
                        100,
                        80,
                        150,
                        60),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                36, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Puffjin can move the largest of clouds with a single breath. This legendary Pokémon serves one great purpose, to give the Pokémon World a big hug whenever it needs it. Not a warm but a cold one. The temperature is rising and some Pokémon are in danger due to climate change. Puffjin would never hurt another Pokémon unless it has no other choice. It'll only answer to wishes that grants positive changes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SNORE,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,8),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.YAWN,22),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,28),
                        new MoveLearnSetEntry(Move.FROST_BREATH,34),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,41),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,45),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,50),
                        new MoveLearnSetEntry(Move.BODY_SLAM,55),
                        new MoveLearnSetEntry(Move.WISH,61),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,68),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,80),
                        new MoveLearnSetEntry(Move.BLIZZARD,88)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Puffjinn");

    }


}
