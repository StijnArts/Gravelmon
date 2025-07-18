package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cooreds extends Pokemon {
    public Cooreds() {
        super("Cooreds",
                Type.BUG, Type.NORMAL,
                new Stats(40,
                        10,
                        50,
                        43,
                        45,
                        25),
                List.of(Ability.SHED_SKIN, Ability.OVERCOAT), Ability.TRUANT,
                7, 99,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                134, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Like its previous evolution, it is pretty immobile. While waiting to evolve again, it practices making noises with its trumpet-like mouth."),
                List.of(new EvolutionEntry("probaska", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
    }
}
