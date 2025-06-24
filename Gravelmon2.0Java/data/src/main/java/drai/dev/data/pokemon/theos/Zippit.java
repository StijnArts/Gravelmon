package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zippit extends drai.dev.data.pokemon.Pokemon {
    public Zippit() {
        super("Zippit",
                Type.DARK, Type.ELECTRIC,
                new Stats(40,
                        45,
                        30,
                        45,
                        30,
                        75),
                List.of(Ability.VOLT_ABSORB), Ability.SURGE_SURFER,
                5, 85,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Zippit like to sleep on powerlines at night absorbing electricity. People often wake to find they have no power in their house due to Zippit causing overnight blackouts."),
                List.of(new EvolutionEntry("ampire", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).setAntiBiomes(Biome.IS_ARID, Biome.IS_SNOWY).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Zippit");

    }


}
