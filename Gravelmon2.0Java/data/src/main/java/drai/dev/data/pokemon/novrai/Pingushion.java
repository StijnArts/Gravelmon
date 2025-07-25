package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pingushion extends drai.dev.data.pokemon.Pokemon {
    public Pingushion() {
        super("Pingushion",
                Type.ICE, Type.STEEL,
                new Stats(125,
                        87,
                        52,
                        101,
                        81,
                        59),
                List.of(Ability.SNOW_WARNING,Ability.IRON_BARBS,Ability.FLUFFY), Ability.FLUFFY,
                13, 165,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                177, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of("The metal spines that cover its body are actually specialized feathers. In non-polar temperatures, it can easily overheat, so Trainers must stay vigilant."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,10),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,14),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.FREEZEDRY,23),
                        new MoveLearnSetEntry(Move.STEEL_WING,28),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.FROST_BREATH,40),
                        new MoveLearnSetEntry(Move.AQUA_JET,44),
                        new MoveLearnSetEntry(Move.TICKLE,51),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,54),
                        new MoveLearnSetEntry(Move.GYRO_BALL,58),
                        new MoveLearnSetEntry(Move.BLIZZARD,62),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING, Biome.IS_FROZEN_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pingushion");

    }


}
