package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hedodan extends drai.dev.data.pokemon.Pokemon {
    public Hedodan() {
        super("Hedodan",
                Type.BUG, Type.POISON,
                new Stats(35,
                        60,
                        70,
                        50,
                        60,
                        35),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.BULLETPROOF,
                5, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("noxisekt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Hedodan");

    }


}
