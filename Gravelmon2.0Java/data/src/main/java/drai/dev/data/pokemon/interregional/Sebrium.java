package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sebrium extends drai.dev.data.pokemon.Pokemon {
    public Sebrium() {
        super("Sebrium",
                Type.DARK, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("kirastrum", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.SING,15),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,25),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,30),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,35),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,45),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,50),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,60)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Sebrium");

    }


}
