package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flossway extends drai.dev.data.pokemon.Pokemon {
    public Flossway() {
        super("Flossway",
                Type.FAIRY,
                new Stats(65,
                        50,
                        60,
                        60,
                        55,
                        50),
                List.of(Ability.SWEET_VEIL), Ability.LINGERING_AROMA,
                4, 35,
                new Stats(1,0,0,0,0,0), 225,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Flossway are kind and gentle Pokémon. Whenever you smell a sweet scent in the air, it's likely that a Flossway is nearby."),
                List.of(new EvolutionEntry("dracopuff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Flossway");

    }


}
