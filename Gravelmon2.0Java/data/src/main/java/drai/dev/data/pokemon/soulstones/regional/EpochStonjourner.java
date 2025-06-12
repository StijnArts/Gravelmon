package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochStonjourner extends drai.dev.data.pokemon.Pokemon {
    public EpochStonjourner(String name, Aspect aspect) {
        super(name, aspect, "EpochStonjourner",
                Type.ELECTRIC,Type.SOUND,
                new Stats(100,
                        115,
                        105,
                        50,
                        20,
                        80),
                List.of(Ability.BATTERY,Ability.ANALYTIC), Ability.ANTIGRAVITY,
                25, 5200,
                new Stats(0,0,2,0,0,0), 123,
                0.5,
                165, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It is constantly playing music from its loud speakers. It can be very obnoxious and disruptive for this reason."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SONICNOVA,56),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.SHATTER,28),
                        new MoveLearnSetEntry(Move.FORTISSIMO,60),
                        new MoveLearnSetEntry(Move.STATICSHOCK,4),
                        new MoveLearnSetEntry(Move.ELECTRONCRUSH,52),
                        new MoveLearnSetEntry(Move.SONICBLAST,20),
                        new MoveLearnSetEntry(Move.BOOMBOX,44),
                        new MoveLearnSetEntry(Move.MEGAPHONE,8),
                        new MoveLearnSetEntry(Move.SPARK,24),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.SCREECH,32),
                        new MoveLearnSetEntry(Move.PROTONCRASH,36),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,48),
                        new MoveLearnSetEntry(Move.DEAFEN,12),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,16),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTERYACID,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.ODETOJOY,"tm"),
                        new MoveLearnSetEntry(Move.OVERCLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.REVERB,"egg"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,"egg"),
                        new MoveLearnSetEntry(Move.NOISEPOLLUTION,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(21)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stonjourner");

    }


}
