package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianAlakazam extends Pokemon {
    public AyreianAlakazam(String name, Aspect aspect) {
        super(name, aspect,"AyreianAlakazam",
                Type.DARK, Type.FIGHTING,
                new Stats(55,115,65,100,100,65),
                List.of(Ability.SNIPER, Ability.INNER_FOCUS), Ability.SHEER_FORCE,
                16, 480,
                new Stats(0,3,0,0,0,0), 50,
                0.875,
                225, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Quicker than it looks, it hides in the shade waiting for the perfect moment to strike. Its high intelligence allows it to remember every fighting style."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THROAT_CHOP, 1),
                        new MoveLearnSetEntry(Move.WATER_SHURIKEN, 1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 1),
                        new MoveLearnSetEntry(Move.DISABLE, 1),
                        new MoveLearnSetEntry(Move.COUNTER, 1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP, 5),
                        new MoveLearnSetEntry(Move.WORK_UP, 10),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, 15),
                        new MoveLearnSetEntry(Move.FORCE_PALM, 20),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 25),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 30),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, 35),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 40),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE, 45),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, 50),

                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.EMBARGO, "tutor"),
                        new MoveLearnSetEntry(Move.ENCORE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY, "tutor"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.IMPRISON, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.METRONOME, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.PSYSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.TELEKINESIS, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor"),

                        new MoveLearnSetEntry(Move.CONFUSION, "egg"),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT, "egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "egg")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Alakazam");
    }
}
