package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cachaleen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cachaleen() {
        super("Cachaleen",
                Type.WATER,
                new Stats(76,
                        71,
                        70,
                        54,
                        32,
                        30),
                List.of(Ability.WATER_VEIL), Ability.SIMPLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                67, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("Its head is cushioned by such a large layer of blubber that it cannot feel any impact. It crashes into icebergs and gobbles up the surprised creatures that were taking refuge below."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cachaleen");

    }


}
