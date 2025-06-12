package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wisplode extends Pokemon {
    public Wisplode() {
        super( "Wisplode",
                Type.FIRE,
                new Stats(85,
                        55,
                        65	,
                        95,
                        115,
                        80),
                List.of(Ability.LEVITATE), Ability.FLAME_BODY,
                7, 5,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The bits of fire that surround this Pokemon's body move as if they each had a mind of their own."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.OVERHEAT,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,30),
                        new MoveLearnSetEntry(Move.TAUNT,32),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,39),
                        new MoveLearnSetEntry(Move.WILLOWISP,43),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,48),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,53),
                        new MoveLearnSetEntry(Move.INFERNO,58),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"egg"),
                        new MoveLearnSetEntry(Move.GRAVITY_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.IMPRISON,"egg"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"egg"),
                        new MoveLearnSetEntry(Move.RETURN,"egg"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"egg"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.TONEDEAF,"egg"),
                        new MoveLearnSetEntry(Move.TRICK,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_VOLCANIC)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
