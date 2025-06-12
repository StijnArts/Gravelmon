package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class KaskadianSnover extends Pokemon {
    public KaskadianSnover(String name, Aspect aspect) {
        super(name, aspect,"KaskadianSnover",
                Type.GRASS, Type.GROUND,
                new Stats(45, 65,34,40,39,45),
                List.of(Ability.EVERGREEN, Ability.SNOW_WARNING), Ability.SOUNDPROOF,
                10, 505,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of("They gather near footsteps they discover on snowy mountains, having interested about people. They keep a close eye on travelers and drop berries as gifts on the trails."),
                List.of(new EvolutionEntry("kaskadianabomasnow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,20),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.SWAGGER,30),
                        new MoveLearnSetEntry(Move.INGRAIN,35),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,45),
                        new MoveLearnSetEntry(Move.SHEER_COLD,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.STOMP,"egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.GEN4,Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .setAntiBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Snover");
    }
}
