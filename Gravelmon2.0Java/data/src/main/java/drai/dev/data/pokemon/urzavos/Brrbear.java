package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brrbear extends drai.dev.data.pokemon.Pokemon {
    public Brrbear() {
        super("Brrbear",
                Type.ICE, Type.ELECTRIC,
                new Stats(60,
                        40,
                        70,
                        60,
                        70,
                        30),
                List.of(Ability.FLUFFY,Ability.KLUTZ), Ability.RUN_AWAY,
                7, 181,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Young Brrbear have an abundance of fluff to the point where they must roll around. As they grow older they lose their fur, which is highly prized coat stuffing."),
                List.of(new EvolutionEntry("brrzolt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(                  ),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Brrbear");

    }


}
