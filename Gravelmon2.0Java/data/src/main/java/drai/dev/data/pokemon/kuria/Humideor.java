package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Humideor extends drai.dev.data.pokemon.Pokemon {
    public Humideor() {
        super("Humideor",
                Type.WATER, Type.COSMIC,
                new Stats(90,
                        60,
                        100,
                        100,
                        90,
                        62),
                List.of(Ability.UNAWARE,Ability.HUMIDIFY), Ability.WATER_BUBBLE,
                6, 199,
                new Stats(0,0,1,1,0,0), 45,
                0.5,
                184, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Humideor keeps everything in a kilometer distance humid merely by being there. Due to the water released from its ears, it requires constant absorption of liters of water to survive."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,20),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.LIQUIDATION,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.SAFEGUARD,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN, Biome.IS_END)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Humideor");

    }


}
