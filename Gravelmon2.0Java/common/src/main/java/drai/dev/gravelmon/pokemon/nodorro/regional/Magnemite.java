package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Magnemite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magnemite(int dex) {
        super(dex, "Magnemite",
                Type.ELECTRIC, Type.STEEL,
                new Stats(25,
                        35,
                        70,
                        95,
                        55,
                        45),
                List.of(Ability.MAGNET_PULL,Ability.STURDY), Ability.ANALYTIC,
                3, 60,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magnemite");

    }


}
