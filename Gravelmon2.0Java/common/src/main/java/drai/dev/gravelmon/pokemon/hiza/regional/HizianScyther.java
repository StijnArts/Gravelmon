package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianScyther extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianScyther() {
        super("Scyther",
                Type.BUG,Type.FAIRY,
                new Stats(70,
                        110,
                        80,
                        55,
                        80,
                        105),
                List.of(Ability.DAZZLING,Ability.RIVALRY,Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its eyes can see quick movements in slow motion. It is capable of seeing and slicing an arrow in half."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scyther");

    }


}
