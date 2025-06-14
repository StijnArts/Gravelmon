package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mosdeng extends Pokemon {
    public Mosdeng() {
        super("Mosdeng",
                Type.BUG, Type.POISON,
                new Stats(80,
                        70,
                        35,
                        55,
                        65,
                        25),
                List.of(Ability.RUN_AWAY, Ability.RUN_AWAY), Ability.RUN_AWAY,
                5, 25,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                94, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Mosdeng lives in wetlands and attacks in packs, which makes it more dangerous. However, it remains very vulnerable to Swellow which make it one of their favorite meals."),
                List.of(new EvolutionEntry("mosboom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.ABSORB, 10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 10),
                        new MoveLearnSetEntry(Move.POISON_STING, 10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, 15),
                        new MoveLearnSetEntry(Move.MINIMIZE, 19),
                        new MoveLearnSetEntry(Move.INFESTATION, 24),
                        new MoveLearnSetEntry(Move.ENDURE, 28),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 32),
                        new MoveLearnSetEntry(Move.STEAMROLLER, 36),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, 40),
                        new MoveLearnSetEntry(Move.BUG_BITE, 44),
                        new MoveLearnSetEntry(Move.VENOSHOCK, 48),
                        new MoveLearnSetEntry(Move.ENDEAVOR, 52),
                        new MoveLearnSetEntry(Move.TOXIC, 56),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 60),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, 65),
                        new MoveLearnSetEntry(Move.POISON_JAB, 70),
                        new MoveLearnSetEntry(Move.COIL, 75),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 86),
                        new MoveLearnSetEntry(Move.BLOODABSORB, 92),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 98),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 104),
                        new MoveLearnSetEntry(Move.EXPLOSION, 110),

                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.SILVER_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.BLOODABSORB, "tutor"),
                        new MoveLearnSetEntry(Move.TOXICBOUND, "tutor")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
