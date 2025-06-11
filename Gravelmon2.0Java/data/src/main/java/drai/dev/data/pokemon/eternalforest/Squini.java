package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Squini extends Pokemon {
    public Squini() {
        super("Squini",
                Type.WATER,
                new Stats(45,
                        49,
                        42,
                        60,
                        47,
                        65),
                List.of(Ability.TORRENT, Ability.STICKY_HOLD), Ability.FLARE_BOOST,
                4, 9,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2, EggGroup.HUMAN_LIKE),
                List.of("The harpoon-shaped cap on Squini's head can be illuminated so that it is not lost from sight by its fellows. It emits less and less light as it gets ready to evolve."),
                List.of(new EvolutionEntry("squinja", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 6),
                        new MoveLearnSetEntry(Move.WRAP, 8),
                        new MoveLearnSetEntry(Move.WATER_GUN, 10),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP, 13),
                        new MoveLearnSetEntry(Move.AQUA_JET, 21),
                        new MoveLearnSetEntry(Move.LOW_KICK, 25),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM, 33),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 35),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE, 37),
                        new MoveLearnSetEntry(Move.AQUA_RING, 42),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP, 47),
                        new MoveLearnSetEntry(Move.CHAKRASTRENGTH, 52),
                        new MoveLearnSetEntry(Move.WORK_UP, 56),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 61),
                        new MoveLearnSetEntry(Move.HEADBUTT, 66),
                        new MoveLearnSetEntry(Move.BRINE, 70),
                        new MoveLearnSetEntry(Move.MIST, 75),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW, 80),
                        new MoveLearnSetEntry(Move.SCALD, 86),
                        new MoveLearnSetEntry(Move.AGILITY, 92),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, 96),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 100),

                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.WATERFALL, "tutor"),
                        new MoveLearnSetEntry(Move.DIVE, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.BRINE, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.PERCEPTION, "tutor"),
                        new MoveLearnSetEntry(Move.MEDITATION, "tutor"),
                        new MoveLearnSetEntry(Move.FINSHIT, "tutor"),

                        new MoveLearnSetEntry(Move.WATER_PLEDGE, "egg"),
                        new MoveLearnSetEntry(Move.SACREDAURA, "egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG, "egg"),
                        new MoveLearnSetEntry(Move.AURASTORM, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.MIND_READER, "egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
