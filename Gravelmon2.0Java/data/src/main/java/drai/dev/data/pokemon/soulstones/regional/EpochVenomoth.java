package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochVenomoth extends drai.dev.data.pokemon.Pokemon {
    public EpochVenomoth(String name, Aspect aspect) {
        super(name, aspect, "EpochVenomoth",
                Type.BUG,Type.GRASS,
                new Stats(100,
                        90,
                        50,
                        90,
                        50,
                        70),
                List.of(Ability.SHIELD_DUST,Ability.PROTEAN), Ability.TINTED_LENS,
                15, 125,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They are considered a pest because they make a habit of eating tree leaves and then masquerading as part of the tree to hide from predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,17),
                        new MoveLearnSetEntry(Move.DRAGONFLYCHARGE,44),
                        new MoveLearnSetEntry(Move.POISON_POWDER,23),
                        new MoveLearnSetEntry(Move.THORNPRISON,1),
                        new MoveLearnSetEntry(Move.FORESTLEAP,11),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,32),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,7),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,48),
                        new MoveLearnSetEntry(Move.BULLET_SEED,26),
                        new MoveLearnSetEntry(Move.CATAPULT,40),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,4),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,20),
                        new MoveLearnSetEntry(Move.FLYTRAP,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,36),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,51),
                        new MoveLearnSetEntry(Move.MIMIC,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,47),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.VEXINGVINES,29),
                        new MoveLearnSetEntry(Move.STUN_SPORE,23),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,23),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.BUTTERFLYKISS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FLUTTER,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIVEMIND,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWSCALES,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Venomoth");

    }


}
