package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wolfum extends Pokemon {
    public Wolfum() {
        super("Wolfum",
                Type.NORMAL, Type.GHOST,
                new Stats(45,75,40,60,40,75),
                List.of(Ability.SHED_SKIN, Ability.FUR_COAT), Ability.SNIPER,
                7, 125,
                new Stats(0,1,0,0,0,0), 75,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It collects the fallen hairs and sheddings of other Pokemon to build a wolflike body, allowing it to blend in with other Pokemon."),
                List.of(new EvolutionEntry("Supiritto", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, 8),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 12),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 16),
                        new MoveLearnSetEntry(Move.ROLLOUT, 20),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, 24),
                        new MoveLearnSetEntry(Move.SPITE, 28),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EMBARGO, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.HEX, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.IMPRISON, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.LASH_OUT, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.REVENGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SNARL, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),

                        new MoveLearnSetEntry(Move.COPYCAT, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "egg"),
                        new MoveLearnSetEntry(Move.MEMENTO, "egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, "egg")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
