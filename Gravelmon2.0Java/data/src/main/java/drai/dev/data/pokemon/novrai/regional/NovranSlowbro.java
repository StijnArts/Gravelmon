package drai.dev.data.pokemon.novrai.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class NovranSlowbro extends drai.dev.data.pokemon.Pokemon {
    public NovranSlowbro(String name, Aspect aspect) {
        super(name, aspect, "Slowbro",
                Type.BUG,
                new Stats(95,
                        100,
                        110,
                        75,
                        80,
                        30),
                List.of(Ability.HONEY_GATHER,Ability.THICK_FAT,Ability.REGENERATOR), Ability.REGENERATOR,
                16, 165,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Sometimes, Combee will build a hive around Novraian Slowpoke's tail, causing it to evolve. Honey produced in these hives is loaded with caffeine so that the Combee stay awake."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.INFESTATION,5),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,9),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.HONEYBOMB,22),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,27),
                        new MoveLearnSetEntry(Move.HONEYPOUR,31),
                        new MoveLearnSetEntry(Move.SLACK_OFF,35),
                        new MoveLearnSetEntry(Move.LUNGE,41),
                        new MoveLearnSetEntry(Move.REST,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,51),
                        new MoveLearnSetEntry(Move.SWEETDECAY,57),
                        new MoveLearnSetEntry(Move.SPIT_UP,62),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.STOMP,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.VIOLENTSWARM,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slowbro");

    }


}
