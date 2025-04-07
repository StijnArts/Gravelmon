package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Betterfree extends drai.dev.data.pokemon.Pokemon {
    public Betterfree() {
        super("Betterfree",
                Type.BUG, Type.PSYCHIC,
                new Stats(72,
                        55,
                        65,
                        120,
                        91,
                        81),
                List.of(Ability.COMPOUND_EYES), Ability.TINTED_LENS,
                15, 350,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Betterfree");
        addAdditionalEvolution("metapod", new EvolutionEntry("betterfree", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25"))));
        setCanFly(true);

    }


}
