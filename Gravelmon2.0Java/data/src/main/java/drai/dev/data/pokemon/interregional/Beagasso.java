package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beagasso extends drai.dev.data.pokemon.Pokemon {
    public Beagasso() {
        super("Beagasso",
                Type.NORMAL,
                new Stats(75,
                        60,
                        85,
                        60,
                        95,
                        105),
                List.of(Ability.OWN_TEMPO,Ability.TECHNICIAN,Ability.MOODY), Ability.MOODY,
                15, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                       new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.SKETCH,11),
                        new MoveLearnSetEntry(Move.SKETCH,21),
                        new MoveLearnSetEntry(Move.SKETCH,31),
                        new MoveLearnSetEntry(Move.SKETCH,41),
                        new MoveLearnSetEntry(Move.SKETCH,51),
                        new MoveLearnSetEntry(Move.SKETCH,61),
                        new MoveLearnSetEntry(Move.SKETCH,71),
                        new MoveLearnSetEntry(Move.SKETCH,81),
                        new MoveLearnSetEntry(Move.SKETCH,91)             ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(39)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Beagasso");
        addAdditionalEvolution("smeargle", new EvolutionEntry("beagasso", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39"))));

    }


}
