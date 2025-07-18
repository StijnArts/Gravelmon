package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochCarvanha extends drai.dev.data.pokemon.Pokemon {
    public EpochCarvanha(String name, Aspect aspect) {
        super(name, aspect, "EpochCarvanha",
                Type.STEEL,Type.FLYING,
                new Stats(40,
                        55,
                        40,
                        75,
                        55,
                        40),
                List.of(Ability.FLARE_BOOST,Ability.SPEED_BOOST), Ability.SHARPSHOOTER,
                8, 208,
                new Stats(0,0,0,0,0,1), 225,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It is capable of breaking the speed of sound quite easily. It is able to dodge and evade enemy missiles easily."),
                List.of(new EvolutionEntry("epochsharpedo", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.STEEL_WING,32),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,23),
                        new MoveLearnSetEntry(Move.RAPID_STRIKE,44),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,20),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,13),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.CLUSTERROCKETS,41),
                        new MoveLearnSetEntry(Move.JETDIVE,1),
                        new MoveLearnSetEntry(Move.BOMBARDMENT,55),
                        new MoveLearnSetEntry(Move.SUPERSONIC,4),
                        new MoveLearnSetEntry(Move.BOOMBURST,59),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.METAL_SOUND,9),
                        new MoveLearnSetEntry(Move.BARRAGE,26),
                        new MoveLearnSetEntry(Move.AEROBLAST,47),
                        new MoveLearnSetEntry(Move.PLASMAFORGE,51),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,64),
                        new MoveLearnSetEntry(Move.PULSE,11),
                        new MoveLearnSetEntry(Move.MISSILESHOT,16),
                        new MoveLearnSetEntry(Move.STREAMRUSH,29),
                        new MoveLearnSetEntry(Move.SCREECH,36),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOMBARDMENT,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CLUSTERROCKETS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GOLDENBULLET,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MISSILESHOT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OVERCLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.DEATHVORTEX,"egg"),
                        new MoveLearnSetEntry(Move.SHATTER,"egg"),
                        new MoveLearnSetEntry(Move.SONICBLAST,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.POWERDRILL,"egg"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"egg"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Carvanha");

    }


}
