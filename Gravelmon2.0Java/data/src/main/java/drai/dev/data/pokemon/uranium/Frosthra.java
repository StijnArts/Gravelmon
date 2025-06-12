package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Frosthra extends Pokemon {
    public Frosthra() {
        super("Frosthra",
                Type.BUG, Type.ICE,
                new Stats(85,
                        55,
                        60,
                        140,
                        95,
                        115),
                List.of(Ability.DEEP_FREEZE), Ability.DEEP_FREEZE,
                16, 459,
                new Stats(0,0,1,2,0,0), 30,
                0.5,
                248, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.BUG),
                List.of("They leave a shimmering trail of ice crystals behind them as they fly. They are prized in many regions for their rarity and beauty."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FROST_BREATH,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.ASTONISH,14),
                        new MoveLearnSetEntry(Move.BUG_BITE,19),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,24),
                        new MoveLearnSetEntry(Move.ICE_BALL,29),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,35),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,42),
                        new MoveLearnSetEntry(Move.HAZE,48),
                        new MoveLearnSetEntry(Move.FREEZEDRY,53),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,57),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,61),
                        new MoveLearnSetEntry(Move.DEFOG,65),
                        new MoveLearnSetEntry(Move.BLIZZARD,69),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,73),
                        new MoveLearnSetEntry(Move.HURRICANE,80),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.SHARPEN,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"egg")
                ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(53)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .setAntiBiomes(Biome.IS_HILLS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
