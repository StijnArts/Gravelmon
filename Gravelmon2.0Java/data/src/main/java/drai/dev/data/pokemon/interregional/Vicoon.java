package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vicoon extends drai.dev.data.pokemon.Pokemon {
    public Vicoon() {
        super("Vicoon",
                Type.BUG,
                new Stats(50,
                        50,
                        130,
                        35,
                        50,
                        20),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                6, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Vicoon enjoy hanging on high tree branches to purposely fall on trainers or Pokemon. Their main objective is to protect the sleeping larvae on its back. evolve: protect"),
                List.of(new EvolutionEntry("arisfly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,18),
                        new MoveLearnSetEntry(Move.BIDE,20)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Vicoon");

    }


}
