package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rascat extends drai.dev.data.pokemon.Pokemon {
    public Rascat() {
        super("Rascat",
                Type.DARK,
                new Stats(43,
                        35,
                        30,
                        45,
                        35,
                        95),
                List.of(Ability.LIMBER,Ability.PICKUP), Ability.SUPER_LUCK,
                16, 98,
                new Stats(0,0,0,0,0,0), 220,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These sly Pokémon sneak around, believing themselves to be invisible, when they are actually very much visible and adorable. Some people believe them to be omens of bad luck, but this is just superstition."),
                List.of(new EvolutionEntry("panthevil", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Rascat");

    }


}
