package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Searth extends drai.dev.data.pokemon.Pokemon {
    public Searth() {
        super("Searth",
                Type.GROUND,
                new Stats(30,
                        40,
                        25,
                        35,
                        25,
                        30),
                List.of(Ability.DRY_SKIN,Ability.MOXIE), Ability.MARVEL_SCALE,
                3, 2,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                37, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("titanomaw", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"type=dark")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Searth");

    }


}
