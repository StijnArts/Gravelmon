package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nosfernal extends drai.dev.data.pokemon.Pokemon {
    public Nosfernal() {
        super("Nosfernal",
                Type.DRAGON, Type.DARK,
                new Stats(89,
                        65,
                        70,
                        101,
                        65,
                        120),
                List.of(Ability.POWERLEECH,Ability.NOCTURNAL), Ability.DEVIATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                186, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite it's incredibly ominous demeanour, it acts incredibly polite as long as there are no hostilities in the area. It can summon swarms of Drakuleech to aid it in a tough battle."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(40).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nosfernal");

    }


}
