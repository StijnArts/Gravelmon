package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Steetic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Steetic() {
        super("Steetic",
                Type.NORMAL,Type.ELECTRIC,
                new Stats(40,
                        65,
                        40,
                        65,
                        40,
                        100),
                List.of(Ability.STATIC), Ability.PICKPOCKET,
                6, 147,
                new Stats(0,0,0,0,0,1), 120,
                0.25,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Steetic is a very weak Pokémon that steals and deceives to survive. It uses the immense amounts of static electricity in its mane to stun enemies and escape battles."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Steetic");

    }


}
