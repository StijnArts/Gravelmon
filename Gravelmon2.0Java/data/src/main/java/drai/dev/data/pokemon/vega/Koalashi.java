package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Koalashi extends Pokemon {
    public Koalashi() {
        super( "Koalashi",
                Type.GRASS, Type.ROCK,
                new Stats(110	,
                        116	,
                        92	,
                        53	,
                        87,
                        28),
                List.of(Ability.GRASS_PELT), Ability.ROCK_HEAD,
                19, 927,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BEATDOWN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.HUG,1),
                        new MoveLearnSetEntry(Move.SLACK_OFF,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,27),
                        new MoveLearnSetEntry(Move.IMPACT_SITE,39),
                        new MoveLearnSetEntry(Move.ROCK_COLUMN,43),
                        new MoveLearnSetEntry(Move.REST,47),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,47),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,49),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,55),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,59),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SCRATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tutor"),
                        new MoveLearnSetEntry(Move.YAWN,"tutor"),
                        new MoveLearnSetEntry(Move.WILD_GROWTH,"tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tutor"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TREE_TOP)
    .build(), List.of());
	
    }
}
