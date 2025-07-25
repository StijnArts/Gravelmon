package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochNosepassOne extends drai.dev.data.pokemon.Pokemon {
    public EpochNosepassOne(String name, Aspect aspect) {
        super(name, aspect, "EpochNosepassOne",
                Type.ELECTRIC,
                new Stats(65,
                        85,
                        70,
                        50,
                        85,
                        70),
                List.of(Ability.BATTERY,Ability.SURGE_SURFER), Ability.ELECTRIC_SURGE,
                10, 370,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is often used as a portable light source but its stubby legs means it often needs to be carried around since it can't usually keep up with walking speed."),
                List.of(new EvolutionEntry("epochtwoprobopass", EvolutionType.ITEM_INTERACT, false, List.of(), 
 List.of(), List.of(), "cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.LOCKON,53),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,8),
                        new MoveLearnSetEntry(Move.STATICSHOCK,1),
                        new MoveLearnSetEntry(Move.RECYCLE,27),
                        new MoveLearnSetEntry(Move.STROBELIGHT,39),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,30),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,14),
                        new MoveLearnSetEntry(Move.SPARK,23),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,43),
                        new MoveLearnSetEntry(Move.FLASH,20),
                        new MoveLearnSetEntry(Move.CHAINLIGHTNING,34),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,11),
                        new MoveLearnSetEntry(Move.PULSE,17),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,48),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,61),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,57),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,53),
                        new MoveLearnSetEntry(Move.CHARGE,4),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTERYACID,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MINERALWAVE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OVERCLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"egg"),
                        new MoveLearnSetEntry(Move.SHORTFUSE,"egg"),
                        new MoveLearnSetEntry(Move.BATTERYACID,"egg"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.RECOVER,"egg"),
                        new MoveLearnSetEntry(Move.ION_DELUGE,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"egg"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .isThundering()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nosepass");

    }


}
