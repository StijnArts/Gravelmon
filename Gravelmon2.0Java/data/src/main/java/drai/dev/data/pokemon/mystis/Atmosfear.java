package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Atmosfear extends drai.dev.data.pokemon.Pokemon {
    public Atmosfear() {
        super("Atmosfear",
                Type.FLYING, Type.ELECTRIC,
                new Stats(85,
                        50,
                        60,
                        130,
                        75,
                        115),
                List.of(Ability.CLOUD_NINE,Ability.STORMSTREAM), Ability.SECONDWIND,
                0, 0,
                new Stats(0,0,0,1,0,1), 3,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of("This Pokémon seems to be heavily reclusive, only appearing when it feels like its territory is being threatened. Its cloud-like appearance masks a dangerous amount of energy within its body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,4),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,7),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,10),
                        new MoveLearnSetEntry(Move.TORNADO,11),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,13),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.WHIRLWIND,18),
                        new MoveLearnSetEntry(Move.SPARK,20),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,25),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,26),
                        new MoveLearnSetEntry(Move.SUPERCELL,29),
                        new MoveLearnSetEntry(Move.DEFOG,32),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,33),
                        new MoveLearnSetEntry(Move.THUNDER_CAGE,34),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.TAILWIND,39),
                        new MoveLearnSetEntry(Move.CLOUDCRASH,42),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,47),
                        new MoveLearnSetEntry(Move.WINDBLAST,48),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,49),
                        new MoveLearnSetEntry(Move.HURRICANE,53),
                        new MoveLearnSetEntry(Move.THUNDER,55),
                        new MoveLearnSetEntry(Move.CYCLONE,59),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,66),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SOLARFLARE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.METEORSHOWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.ZING_ZAP,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SOLARCHARGER,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY,Biome.IS_MOUNTAIN).isThundering()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Atmosfear");

    }


}
