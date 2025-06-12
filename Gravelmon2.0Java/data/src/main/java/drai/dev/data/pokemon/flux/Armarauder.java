package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Armarauder extends Pokemon {
    public Armarauder() {
        super("Armarauder",
                Type.NORMAL, Type.STEEL,
                new Stats(72,
                        80,
                        135,
                        58,
                        58,
                        95),
                List.of(Ability.RECKLESS), Ability.SPEED_BOOST,
                15, 550,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("Aggressively territorial, they claim large stretches of highway as their turf. Known to travel in gangs, they will even run large trucks off the road."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.TAR_SHOT,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,11),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,14),
                        new MoveLearnSetEntry(Move.ENDURE,17),
                        new MoveLearnSetEntry(Move.FLAIL,21),
                        new MoveLearnSetEntry(Move.GYRO_BALL,24),
                        new MoveLearnSetEntry(Move.BODY_PRESS,29),
                        new MoveLearnSetEntry(Move.STEAMROLLER,34),
                        new MoveLearnSetEntry(Move.SUBMISSION,40),
                        new MoveLearnSetEntry(Move.ENDEAVOR,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,55),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,61),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,66),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.SMOG,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
