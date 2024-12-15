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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 10, 39, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Snover");
    }
}
