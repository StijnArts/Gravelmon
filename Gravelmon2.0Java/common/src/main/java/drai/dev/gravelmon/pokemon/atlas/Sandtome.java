package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sandtome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sandtome() {
        super("Sandtome",
                Type.GROUND,
                new Stats(93,
                        96,
                        87,
                        86,
                        79,
                        74),
                List.of(Ability.SAND_VEIL,Ability.SAND_FORCE,Ability.SAND_STREAM), Ability.SAND_STREAM,
                39, 165,
                new Stats(1,0,0,1,0,0), 205,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.HUMAN_LIKE),
                List.of("Their origin unknown, Sandtome are dwellers of the desert. They prefer to isolate from other Pokemon and stay in packs. They dislike water more than anything else."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BIDE,8),
                        new MoveLearnSetEntry(Move.SANDSTORM,12),
                        new MoveLearnSetEntry(Move.MUDSLAP,14),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,19),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.SAND_TOMB,35),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,42),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,47),
                        new MoveLearnSetEntry(Move.SANDSHOT,56),
                        new MoveLearnSetEntry(Move.EXPLOSION,61),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,76),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SOLARFLARE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.SHORE_UP,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 26, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sandtome");

    }


}
