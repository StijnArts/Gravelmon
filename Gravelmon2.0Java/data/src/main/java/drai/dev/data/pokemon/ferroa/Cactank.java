package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cactank extends drai.dev.data.pokemon.Pokemon {
    public Cactank() {
        super("Cactank",
                Type.GRASS, Type.WATER,
                new Stats(65,
                        65,
                        130,
                        65,
                        130,
                        35),
                List.of(Ability.WATER_ABSORB,Ability.IRON_BARBS,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                13, 165,
                new Stats(0,0,1,0,1,0), 70,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("It stores cool, fresh water in its body to withstand the intense heat of the desert. Finding a Cactank often means life or death for weary travelers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.GROWTH,15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,18),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,30),
                        new MoveLearnSetEntry(Move.THORN_FALL,35),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.WATERFALL,44),
                        new MoveLearnSetEntry(Move.SEED_BOMB,47),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,57),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.FELL_STINGER,"tm"),
                        new MoveLearnSetEntry(Move.ROTOTILLER,"tm"),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(25)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cactank");

    }


}
