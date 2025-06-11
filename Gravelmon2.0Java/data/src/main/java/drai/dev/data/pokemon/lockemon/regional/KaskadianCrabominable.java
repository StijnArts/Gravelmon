package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class KaskadianCrabominable  extends Pokemon {
    public KaskadianCrabominable(String name, Aspect aspect) {
        super(name, aspect,"KaskadianCrabominable",
                Type.POISON, Type.ICE,
                new Stats(97, 132, 77, 62, 67, 43),
                List.of(Ability.ABSOLUTE_ZERO, Ability.IRON_FIST), Ability.GORILLA_TACTICS,
                15, 920,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON, Label.GEN7),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Golett");
        this.addAdditionalEvolution("crawbrawler", new EvolutionEntry(this.getCleanName(), EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_SNOWY_FOREST.getId() + ":" + Biome.IS_SNOWY_FOREST.getName()))));

    }
}
