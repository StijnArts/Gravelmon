package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pupage extends drai.dev.data.pokemon.Pokemon {
    public Pupage() {
        super("Pupage",
                Type.BUG, Type.FAIRY,
                new Stats(40,
                        30,
                        60,
                        30,
                        40,
                        20),
                List.of(Ability.SHIELD_DUST), Ability.PLOTTWIST,
                4, 165,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("beetome", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.REST,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.NEAR_BOOKSHELVES)
    .build(), List.of());
	
           setLangFileName("Pupage");

    }


}
