package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Steinfjorir extends drai.dev.data.pokemon.Pokemon {
    public Steinfjorir() {
        super("Steinfjorir",
                Type.ROCK, Type.FLYING,
                new Stats(95,
                        125,
                        110,
                        110,
                        70,
                        70),
                List.of(Ability.PRESSURE,Ability.SAND_RUSH,Ability.SAND_STREAM), Ability.SAND_STREAM,
                15, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Steinfjorir usually attacks from below, raising sharp rocks to trap its foes. The rugged coasts and fjords surrounding and entering Norheim has been shaped by this bird Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,8),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,15),
                        new MoveLearnSetEntry(Move.PLUCK,22),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.SANDSTORM,34),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.WING_ATTACK,43),
                        new MoveLearnSetEntry(Move.STEEL_WING,49),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,62),
                        new MoveLearnSetEntry(Move.EARTH_POWER,71),
                        new MoveLearnSetEntry(Move.HURRICANE,78),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,88)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Steinfjorir");

    }


}
