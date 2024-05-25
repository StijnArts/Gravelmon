package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Litwick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Litwick(int dex) {
        super(dex, "Litwick",
                Type.FIRE, Type.GHOST,
                new Stats(55,
                        35,
                        55,
                        70,
                        55,
                        40),
                List.of(Ability.FLASH_FIRE,Ability.FLAME_BODY), Ability.INFILTRATOR,
                0, 0,
                new Stats(0,0,0,1,0,0), 50,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Litwick guides people around in cities. Litwick are also often seen in churches where they help priests with their praising."),
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
           setLangFileName("Litwick");

    }


}
