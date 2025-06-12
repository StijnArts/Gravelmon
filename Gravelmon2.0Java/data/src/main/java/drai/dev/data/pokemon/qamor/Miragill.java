package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Miragill extends drai.dev.data.pokemon.Pokemon {
    public Miragill() {
        super("Miragill",
                Type.WATER,
                new Stats(72,
                        60,
                        73,
                        78,
                        62,
                        78),
                List.of(Ability.MARVEL_SCALE,Ability.RIVALRY,Ability.WATER_VEIL), Ability.WATER_VEIL,
                13, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Miragill are very pompous, flashy Pokemon. They swim through the coral reefs showing off the color pallets of their vivid fins. But when they aren't comparing who's fin colors are more saturated, they are fighting tooth and nail- sometimes to the death."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,7),
                        new MoveLearnSetEntry(Move.TEAMUP,11),
                        new MoveLearnSetEntry(Move.AQUA_JET,15),
                        new MoveLearnSetEntry(Move.CAPTIVATE,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.AQUA_RING,35),
                        new MoveLearnSetEntry(Move.FLAIL,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
