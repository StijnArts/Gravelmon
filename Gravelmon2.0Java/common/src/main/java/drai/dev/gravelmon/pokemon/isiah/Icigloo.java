package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Icigloo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Icigloo() {
        super("Icigloo",
                Type.ICE,
                new Stats(60,
                        70,
                        120,
                        90,
                        100,
                        60),
                List.of(Ability.ICE_BODY,Ability.IRON_BARBS,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                225, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Icigloo");

    }


}
