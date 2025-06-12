package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pouffy extends drai.dev.data.pokemon.Pokemon {
    public Pouffy() {
        super("Pouffy",
                Type.WATER, Type.FLYING,
                new Stats(45,
                        45,
                        35,
                        55,
                        45,
                        50),
                List.of(Ability.TORRENT,Ability.BIG_PECKS,Ability.STORMSTREAM), Ability.STORMSTREAM,
                4, 165,
                new Stats(0,0,0,0,0,0), 240,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("There's no bad weather, only poor coats of feathers. When practicing the skill of flight, Pouffy launches itself out of steep cliffs and before doing so this Pokemon waits patiently in line for its turn."),
                List.of(new EvolutionEntry("puffard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(            new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,33),
                        new MoveLearnSetEntry(Move.GLARE,37),
                        new MoveLearnSetEntry(Move.CRUNCH,42)            ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
