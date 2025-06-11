package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranBuneary extends Pokemon {
    public CefiranBuneary(String name, Aspect aspect) {
        super(name, aspect,"CefiranBuneary",
                Type.ICE,
                Stats.empty(),
                List.of(Ability.SLUSH_RUSH), Ability.SNOW_CLOAK,
                9, 505,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("cefiranlopunny", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"210")))
                ),
                List.of(),
                List.of(Label.GEN4,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Snover");
    }
}
