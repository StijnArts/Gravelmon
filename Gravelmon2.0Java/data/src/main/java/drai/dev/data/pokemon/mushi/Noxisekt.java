package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Noxisekt extends drai.dev.data.pokemon.Pokemon {
    public Noxisekt() {
        super("Noxisekt",
                Type.BUG, Type.POISON,
                new Stats(55,
                        75,
                        100,
                        105,
                        60,
                        55),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.BULLETPROOF,
                15, 0,
                new Stats(0,0,0,2,0,0), 127,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Noxisekt");

    }


}
