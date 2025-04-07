package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peckster extends drai.dev.data.pokemon.Pokemon {
    public Peckster() {
        super("Peckster",
                Type.NORMAL, Type.FLYING,
                new Stats(50,
                        35,
                        30,
                        30,
                        50,
                        30),
                List.of(Ability.KEEN_EYE,Ability.RIVALRY), Ability.SNIPER,
                7, 10,
                new Stats(0,0,0,0,1,0), 250,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They take Pidgeot as an idol and want to be like them. They practise their speed each day to get as fast as they are."),
                List.of(new EvolutionEntry("peckussion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(16).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Peckster");

    }


}
