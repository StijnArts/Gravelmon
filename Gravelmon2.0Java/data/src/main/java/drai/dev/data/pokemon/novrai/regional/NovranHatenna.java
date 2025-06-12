package drai.dev.data.pokemon.novrai.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class NovranHatenna extends drai.dev.data.pokemon.Pokemon {
    public NovranHatenna(String name, Aspect aspect) {
        super(name, aspect, "Hatenna",
                Type.GRASS, Type.FAIRY,
                new Stats(42,
                        30,
                        45,
                        56,
                        53,
                        39),
                List.of(Ability.SYMBIOSIS,Ability.HARVEST,Ability.GRASSY_SURGE), Ability.GRASSY_SURGE,
                4, 165,
                new Stats(0,0,0,1,0,0), 235,
                0.25,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Its wide brim of hair contains cells that absorb sunlight, so it never has to eat. It causes other plants to grow large so it can hide below their leaves when frightened."),
                List.of(new EvolutionEntry("NovranHattrem", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.ROTOTILLER,6),
                        new MoveLearnSetEntry(Move.CUDDLE,9),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,13),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,18),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,22),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,25),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,28),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,34),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,37),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42),
                        new MoveLearnSetEntry(Move.NATURE_POWER,46),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,49),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,"tm"),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(10)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hatenna");

    }


}
