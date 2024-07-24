package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Varingpard extends drai.dev.data.pokemon.Pokemon {
    public Varingpard(Stats stats) {
        super("Varingpard",
                Type.ICE,Type.FIGHTING,
                stats,
                List.of(Ability.SNOW_CLOAK,Ability.GUTS), Ability.ANGER_POINT,
                18, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It leads hordes of Vikottr in raids, searching for food and battle. When faced with a worthy opponent, it stops holding back and fights savagely."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 59, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Varingpard");

    }


}
