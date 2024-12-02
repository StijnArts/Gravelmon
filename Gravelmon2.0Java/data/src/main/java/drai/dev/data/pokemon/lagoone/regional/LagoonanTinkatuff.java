package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanTinkatuff extends drai.dev.data.pokemon.Pokemon {
    public LagoonanTinkatuff(String name, Aspect aspect) {
        super(name, aspect, "LAGOONEnianTinkatuff",
                Type.GRASS,Type.STEEL,
                new Stats(65,
                        55,
                        55,
                        45,
                        82,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 591,
                new Stats(0,0,0,0,2,0), 90,
                0.0,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("They will tie scrap metal together with seaweed to make a huge hammer. Since the rusty metal is not durable, they are always looking for more."),
                List.of(new EvolutionEntry("tinkaton", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 44, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH, Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
           setLangFileName("Tinkatuff");

    }


}
