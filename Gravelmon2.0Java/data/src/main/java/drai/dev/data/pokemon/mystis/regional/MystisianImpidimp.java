package drai.dev.data.pokemon.mystis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisianImpidimp extends drai.dev.data.pokemon.Pokemon {
    public MystisianImpidimp(String name, Aspect aspect) {
        super(name, aspect, "Impidimp",
                Type.FIRE,
                new Stats(45,
                        55,
                        30,
                        65,
                        40,
                        30),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                4, 55,
                new Stats(0,0,0,0,0,0), 255,
                0.75,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("mystisianmorgrem", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Impidimp");

    }


}
