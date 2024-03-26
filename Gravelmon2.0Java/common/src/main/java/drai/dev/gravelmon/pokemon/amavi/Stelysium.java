package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Stelysium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stelysium() {
        super("Stelysium",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(118,
                        60,
                        75,
                        150,
                        120,
                        85),
                List.of(Ability.ILLUMINATE,Ability.TELEPATHY), Ability.WONDER_SKIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The counterpart of Bohemolock.Stelysium clandestinely travels village to village search for those who perform beneficent deeds for others to ascend with her to another world after they have passed in this one."),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stelysium");

    }


}
