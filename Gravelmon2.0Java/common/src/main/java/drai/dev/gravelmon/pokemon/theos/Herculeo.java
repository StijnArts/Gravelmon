package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Herculeo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Herculeo() {
        super("Herculeo",
                Type.GRASS,Type.FIGHTING,
                new Stats(75,
                        125,
                        85,
                        75,
                        75,
                        100),
                List.of(Ability.OVERGROW), Ability.DEFIANT,
                20, 1500,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Wild Herculeo have been recorded holding tournament-style battles, where Pokémon compete to become the jungle champion."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Herculeo");

    }


}
