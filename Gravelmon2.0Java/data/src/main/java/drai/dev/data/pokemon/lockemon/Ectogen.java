package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ectogen extends Pokemon {
    public Ectogen() {
        super("Ectogen",
                Type.GHOST,
                new Stats(55,
                        55,
                        65,
                        45,
                        50,
                        55),
                List.of(Ability.SHADOW_TAG, Ability.CURSED_BODY), Ability.SEANCE,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Ectogen evolves into pure spiritual energy as it evolves. It inhabits the husk of its former self, rendering it physically incapable of feeling pain. Ectogen follows Skinka wherever they go. When their skin deteriorates, they can quickly inhabit a new shell and continue to live."),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
