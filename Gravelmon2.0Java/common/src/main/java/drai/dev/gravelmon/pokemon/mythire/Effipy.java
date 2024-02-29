package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Effipy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Effipy() {
        super("Effipy",
                Type.STEEL,Type.FLYING,
                new Stats(45,
                        45,
                        60,
                        60,
                        50,
                        60),
                List.of(Ability.SERENE_GRACE,Ability.UNBURDEN,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.25,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.HUMAN_LIKE),
                List.of("Its feathers are made of sharp metal fibers that can cut through stone. This Pokemon is very hard to please and will chirp incessantly if it doesn't get its way."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Effipy");

    }


}
