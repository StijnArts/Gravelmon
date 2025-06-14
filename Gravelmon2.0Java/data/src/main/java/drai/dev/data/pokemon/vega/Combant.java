package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Combant extends Pokemon {
    public Combant() {
        super( "Combant",
                Type.BUG, Type.FIGHTING,
                new Stats(68	,
                        111	,
                        61	,
                        52,
                        86	,
                        96),
                List.of(Ability.COMPOUND_EYES), Ability.ARENA_TRAP,
                7, 145,
                new Stats(0,2,0,0,0,0), 190,
                1,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.FIELD),
                List.of("A hard worker that is always busy. Arincess have a preference for the Combant that can work the hardest."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COMET_PUNCH,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.ENCORE,11),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,17),
                        new MoveLearnSetEntry(Move.CHARM,23),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,25),
                        new MoveLearnSetEntry(Move.XSCISSOR,29),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.JUMP_KICK,37),
                        new MoveLearnSetEntry(Move.MAGNUM_PUNCH,41),
                        new MoveLearnSetEntry(Move.BULK_UP,47),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,49),
                        new MoveLearnSetEntry(Move.RAID,53),
                        new MoveLearnSetEntry(Move.FLATTER,59),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,61),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.DIG,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.RAGE,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"egg"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,"egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.VITAL_THROW,"egg")
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
