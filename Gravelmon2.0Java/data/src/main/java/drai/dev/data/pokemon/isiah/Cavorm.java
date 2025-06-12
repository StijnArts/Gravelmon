package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cavorm extends drai.dev.data.pokemon.Pokemon {
    public Cavorm() {
        super("Cavorm",
                Type.GROUND,
                new Stats(50,
                        50,
                        40,
                        50,
                        60,
                        40),
                List.of(Ability.SAND_RUSH), Ability.SAND_RUSH,
                4, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("lumbrig", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.WRAP,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,15),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.EMBARGO,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,29),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,42),
                        new MoveLearnSetEntry(Move.SANDSTORM,49),
                        new MoveLearnSetEntry(Move.COIL,55),
                        new MoveLearnSetEntry(Move.FISSURE,62)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cavorm");

    }


}
