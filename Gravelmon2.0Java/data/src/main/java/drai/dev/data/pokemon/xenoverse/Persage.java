package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Persage extends Pokemon {
    public Persage() {
        super("Persage",
                Type.PSYCHIC,
                new Stats(70, 50, 60, 110, 110, 50),
                List.of(Ability.PICKUP, Ability.ANTICIPATION), Ability.WONDER_SKIN,
                8, 200,
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.AMORPHOUS, EggGroup.MONSTER),
                List.of("It can see the future through its crystal ball. Those who ask it for prediction more than three times will be cursed for life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.POWER_SWAP,1),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,4),
                        new MoveLearnSetEntry(Move.SCRATCH,8),
                        new MoveLearnSetEntry(Move.PAY_DAY,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,20),
                        new MoveLearnSetEntry(Move.FLATTER,24),
                        new MoveLearnSetEntry(Move.POWER_TRICK,28),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,31),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,36),
                        new MoveLearnSetEntry(Move.LUSTER_PURGE,42),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,54),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"egg"),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.FLASH,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                4, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Persage");

    }
}
