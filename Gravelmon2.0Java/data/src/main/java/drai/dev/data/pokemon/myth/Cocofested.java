package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cocofested extends Pokemon {
    public Cocofested() {
        super("Cocofested",
                Type.GRASS, Type.ROCK,
                new Stats(140,80,120,45,135,45),
                List.of(Ability.THICK_FAT), Ability.RAIN_DISH,
                18, 69,
                new Stats(3,0,0,0,0,0), 45,
                0.875,
                312, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.BUG),
                List.of("By the time Coconab evolves into Cocofested, the thickness of its shell becomes rock solid."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 3),
                        new MoveLearnSetEntry(Move.ROLLOUT, 7),
                        new MoveLearnSetEntry(Move.WATER_GUN, 10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 13),
                        new MoveLearnSetEntry(Move.WITHDRAW, 15),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 17),
                        new MoveLearnSetEntry(Move.TOXIC, 20),
                        new MoveLearnSetEntry(Move.CALM_MIND, 25),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 27),
                        new MoveLearnSetEntry(Move.AQUA_RING, 29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 33),
                        new MoveLearnSetEntry(Move.RECOVER, 36),
                        new MoveLearnSetEntry(Move.PROTECT, 40),
                        new MoveLearnSetEntry(Move.LEAF_STORM, 45),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 49),
                        new MoveLearnSetEntry(Move.SURF, 52),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 55),
                        new MoveLearnSetEntry(Move.STARBOLT, 60),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 63),
                        new MoveLearnSetEntry(Move.GEYSERPULSE, 70)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(36)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
