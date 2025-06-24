package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crystone extends drai.dev.data.pokemon.Pokemon {
    public Crystone() {
        super("Crystone",
                Type.ROCK,
                new Stats(45,
                        80,
                        60,
                        30,
                        60,
                        40),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                9, 300,
                new Stats(0,1,0,0,0,0), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In ancient times, it was seen as a sign of wealth to have a Crystone at your side. Their gemstone horn's are often sought out by poachers."),
                List.of(new EvolutionEntry("crysaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Crystone");

    }


}
