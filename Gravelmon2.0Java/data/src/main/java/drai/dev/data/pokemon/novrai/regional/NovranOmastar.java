package drai.dev.data.pokemon.novrai.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class NovranOmastar extends drai.dev.data.pokemon.Pokemon {
    public NovranOmastar(String name, Aspect aspect) {
        super(name, aspect, "Omastar",
                Type.ROCK, Type.DRAGON,
                new Stats(70,
                        60,
                        135,
                        105,
                        70,
                        55),
                List.of(Ability.DAZZLING,Ability.MARVEL_SCALE,Ability.JACKPOT), Ability.JACKPOT,
                10, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("It displayed its collection of gems and jewels on its shell to intimidate its rivals. It's thought that it went extinct because it refused to ever abandon its treasure hoard."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,16),
                        new MoveLearnSetEntry(Move.IMPRISON,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,23),
                        new MoveLearnSetEntry(Move.NUGGETFLING,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.PROTECT,34),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,37),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.TICKLE,45),
                        new MoveLearnSetEntry(Move.POWER_GEM,49),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,54),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ROYALDECREE,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEROAR,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"tm"),
                        new MoveLearnSetEntry(Move.WRING_OUT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,"tm"),
                        new MoveLearnSetEntry(Move.METEORSHOWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(40)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
