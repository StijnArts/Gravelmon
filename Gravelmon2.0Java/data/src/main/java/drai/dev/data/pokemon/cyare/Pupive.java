package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupive extends drai.dev.data.pokemon.Pokemon {
    public Pupive() {
        super("Pupive",
                Type.BUG,
                new Stats(45,
                        40,
                        25,
                        30,
                        30,
                        40),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                6, 68,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                75, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Pupive often find themselves rattled around by Pokemon who think there's a tasty treat within it's husk. However, if Pupive are disturbed when they're close to evolving, then-"),
                List.of(new EvolutionEntry("waspen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.FLAIL,20)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pupive");

    }


}
