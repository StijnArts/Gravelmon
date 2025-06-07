package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sapeeko extends drai.dev.data.pokemon.Pokemon {
    public Sapeeko() {
        super("Sapeeko",
                Type.GRASS,
                new Stats(46,
                        45,
                        69,
                        45,
                        46,
                        24),
                List.of(Ability.SAP_SIPPER,Ability.LEAF_GUARD), Ability.LIGHTNING_ROD,
                8, 0,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("grobolt", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(18).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sapeeko");

    }


}
