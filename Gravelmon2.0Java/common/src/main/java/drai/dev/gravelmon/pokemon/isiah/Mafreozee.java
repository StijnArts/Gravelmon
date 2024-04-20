package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mafreozee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mafreozee() {
        super("Mafreozee",
                Type.ICE, Type.PSYCHIC,
                new Stats(71,
                        61,
                        80,
                        106,
                        132,
                        85),
                List.of(Ability.FOREWARN,Ability.SNOW_WARNING,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,2,0), 40,
                0.0,
                187, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.HUMAN_LIKE),
                List.of("Mafreozee can bend even the thickest ice with their mind, creating intricate and beautiful statues from them. They often accompany sculptors and love to express their thoughts through their art rather than their 'words.'"),
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
           setLangFileName("Mafreozee");

    }


}
