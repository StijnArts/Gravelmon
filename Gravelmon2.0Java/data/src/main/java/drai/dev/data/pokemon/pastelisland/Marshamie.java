package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marshamie extends drai.dev.data.pokemon.Pokemon {
    public Marshamie() {
        super("Marshamie",
                Type.NORMAL, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GOOEY), Ability.STICKY_HOLD,
                8, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("mallowisp", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NEAR_CAMPFIRE).build(),
                List.of());
           setLangFileName("Marshamie");

    }


}
