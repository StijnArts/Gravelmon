package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Solacor extends Pokemon {
    public Solacor() {
        super("Solacor",
                Type.WATER, Type.ROCK,
                new Stats(85,55,120,45,95,120),
                List.of(Ability.HUSTLE, Ability.NATURAL_CURE), Ability.REGENERATOR,
                19, 5550,
                new Stats(0,0,1,0,0,2), 60,
                0.25,
                244, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.WATER_3),
                List.of("Its hard as rock skin, and fast firing water from it's head made it the perfect frontline during conflict."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCALD, 1),
                        new MoveLearnSetEntry(Move.PSYCHIC, 1),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 5),
                        new MoveLearnSetEntry(Move.AQUA_RING, 10),
                        new MoveLearnSetEntry(Move.PROTECT, 15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM, 25),
                        new MoveLearnSetEntry(Move.HEX, 30),
                        new MoveLearnSetEntry(Move.LIFE_DEW, 35),
                        new MoveLearnSetEntry(Move.POWER_GEM, 40),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 45),
                        new MoveLearnSetEntry(Move.RECOVER, 50),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, 55),

                        new MoveLearnSetEntry(Move.AMNESIA, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRINE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_GEM, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, "tutor"),

                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(43)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        this.setCanBreathUnderwater(true);
        this.setCanSwim(true);
    }
}
