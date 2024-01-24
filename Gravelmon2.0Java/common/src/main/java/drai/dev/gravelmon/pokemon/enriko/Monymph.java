package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Monymph extends drai.dev.gravelmon.pokemon.Pokemon {
    public Monymph() {
        super("Monymph",
                Type.BUG,Type.ROCK,
                new Stats(80,
                        90,
                        120,
                        60,
                        100,
                        50),
                List.of(Ability.BATTLE_ARMOR,Ability.COMPOUND_EYES,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It exhumes graves for food, carrying the headstone on its back for shelter. During the day, they hide underground, so grave keepers will find their yard mysteriously rearranged overnight."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Monymph");

    }


}
