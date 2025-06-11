package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kunama extends drai.dev.data.pokemon.Pokemon {
    public Kunama() {
        super("Kunama",
                Type.GROUND, Type.WATER,
                new Stats(85,
                        85,
                        80,
                        90,
                        110,
                        55),
                List.of(Ability.DRY_SKIN,Ability.RAINBOON), Ability.ADAPTABILITY,
                12, 191,
                new Stats(0,0,0,0,2,0), 45,
                0.0,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("When it is properly hydrated, its body is slimey and flexible. It has a level-headed disposition and takes a pragmatic approach to survival."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SNORE,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,9),
                        new MoveLearnSetEntry(Move.WATER_PULSE,13),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.MUD_BOMB,28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,38),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kunama");

    }


}
