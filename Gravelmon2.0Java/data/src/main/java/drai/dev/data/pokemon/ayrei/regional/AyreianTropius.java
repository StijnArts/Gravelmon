package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianTropius extends drai.dev.data.pokemon.Pokemon {
    public AyreianTropius(String name, Aspect aspect) {
        super(name, aspect,"AyreianTropius",
                Type.GRASS,Type.DRAGON,
                new Stats(109,
                        68,
                        88,
                        71,
                        102,
                        92),
                List.of(Ability.CHLOROPHYLL,Ability.SEED_SOWER), null,
                20, 1000,
                new Stats(2,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("The bunch of fruit around its neck, while delicious, is fiercely guarded by Tropius. They nest in the secluded depths of jungles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,36),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.STOMP,10),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,41),
                        new MoveLearnSetEntry(Move.LEAF_STORM,50),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,21),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,26),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,61),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,6),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,46),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,56),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,30),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.SLAM,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(15)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE, Biome.IS_TROPICAL_ISLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Tropius");

    }


}
