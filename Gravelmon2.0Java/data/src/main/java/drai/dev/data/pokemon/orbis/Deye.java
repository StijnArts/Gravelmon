package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deye extends drai.dev.data.pokemon.Pokemon {
    public Deye() {
        super("Deye",
                Type.PSYCHIC,
                new Stats(37,
                        23,
                        59,
                        63,
                        61,
                        41),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                4, 80,
                new Stats(0,0,0,1,0,0), 80,
                0.0,
                94, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Deye hurl themselves like dice to predict future events. Rolling both eyes is said to be bad luck."),
                List.of(new EvolutionEntry("pyroulette", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Deye");

    }


}
