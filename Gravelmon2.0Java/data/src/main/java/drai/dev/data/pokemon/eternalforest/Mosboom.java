package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mosboom extends Pokemon {
    public Mosboom() {
        super("Mosboom",
                Type.BUG, Type.POISON,
                new Stats(90,
                        95,
                        50,
                        80,
                        80,
                        50),
                List.of(Ability.AFTERMATH, Ability.AFTERMATH), Ability.AFTERMATH,
                8, 50,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                162, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Mosboom is able to explode in the face of predators to protect its offspring as soon as the need arises. When it stings its preys, it inoculates a very powerful poison capable of making a Ursaring fall in 5 seconds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.ABSORB, 10),
                        new MoveLearnSetEntry(Move.POISON_STING, 10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, 15),
                        new MoveLearnSetEntry(Move.MINIMIZE, 19),
                        new MoveLearnSetEntry(Move.INFESTATION, 26),
                        new MoveLearnSetEntry(Move.ENDURE, 32),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 38),
                        new MoveLearnSetEntry(Move.STEAMROLLER, 44),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, 50),
                        new MoveLearnSetEntry(Move.BUG_BITE, 55),
                        new MoveLearnSetEntry(Move.VENOSHOCK, 61),
                        new MoveLearnSetEntry(Move.ENDEAVOR, 67),
                        new MoveLearnSetEntry(Move.TOXIC, 74),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 79),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, 84),
                        new MoveLearnSetEntry(Move.POISON_JAB, 89),
                        new MoveLearnSetEntry(Move.COIL, 94),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 100),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 106),
                        new MoveLearnSetEntry(Move.BLOODABSORB, 112),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 118),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 124),
                        new MoveLearnSetEntry(Move.EXPLOSION, 130),

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
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.SILVER_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),
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
                        new MoveLearnSetEntry(Move.PERCEPTION, "tutor"),
                        new MoveLearnSetEntry(Move.BLOODABSORB, "tutor"),
                        new MoveLearnSetEntry(Move.TOXICBOUND, "tutor")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
