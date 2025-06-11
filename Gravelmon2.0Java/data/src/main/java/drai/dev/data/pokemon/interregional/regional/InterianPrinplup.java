package drai.dev.data.pokemon.interregional.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class InterianPrinplup extends drai.dev.data.pokemon.Pokemon {
    public InterianPrinplup(String name, Aspect aspect) {
        super(name, aspect,"Prinplup",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("interianempoleon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.HAIL,1),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.HAIL,7),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,13),
                        new MoveLearnSetEntry(Move.CHARM,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,19),
                        new MoveLearnSetEntry(Move.SAFEGUARD,25),
                        new MoveLearnSetEntry(Move.ICY_KISS,28),
                        new MoveLearnSetEntry(Move.ATTRACT,33),
                        new MoveLearnSetEntry(Move.ANGRY_SWARM,41),
                        new MoveLearnSetEntry(Move.AGILITY,46),
                        new MoveLearnSetEntry(Move.ICE_BEAM,51),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,59),
                        new MoveLearnSetEntry(Move.BLIZZARD,64)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Prinplup");

    }


}
