package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Strigori extends drai.dev.data.pokemon.Pokemon {
    public Strigori() {
        super("Strigori",
                Type.DARK, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It resides in abandoned buildings like old castles, where no one can disturb its brooding. It shields itself from the light with its cape-like wings."),
                List.of(new EvolutionEntry("demontor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Strigori");

    }


}
