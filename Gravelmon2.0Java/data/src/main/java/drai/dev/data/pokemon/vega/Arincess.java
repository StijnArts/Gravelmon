package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Arincess extends Pokemon {
    public Arincess() {
        super( "Arincess",
                Type.BUG, Type.PSYCHIC,
                new Stats(96	,
                        52	,
                        86	,
                        111,
                        61	,
                        68),
                List.of(Ability.COMPOUND_EYES), Ability.ARENA_TRAP,
                6, 152,
                new Stats(0,0,0,2,0,0), 190,
                0,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.FIELD),
                List.of("Usually as hard of a worker as Combant. However, some have rotten attitudes and force Combant to do all the work."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_SWIPES,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.ENCORE,11),
                        new MoveLearnSetEntry(Move.CONFUSION,13),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,17),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,23),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,29),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,29),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,29),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,35),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,37),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,41),
                        new MoveLearnSetEntry(Move.CALM_MIND,47),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,49),
                        new MoveLearnSetEntry(Move.BUG_NOISE,53),
                        new MoveLearnSetEntry(Move.SWAGGER,59),
                        new MoveLearnSetEntry(Move.PSYBURN,61),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.ATTRACT,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.DIG,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.HEART_STAMP,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,"egg"),
                        new MoveLearnSetEntry(Move.LATENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.LIFE_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"egg"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg"),
                        new MoveLearnSetEntry(Move.TOXIN_SPRAY,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
