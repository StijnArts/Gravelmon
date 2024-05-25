package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Peckster extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peckster() {
        super("Peckster",
                Type.NORMAL, Type.FLYING,
                new Stats(50,
                        35,
                        30,
                        30,
                        50,
                        30),
                List.of(Ability.KEEN_EYE,Ability.RIVALRY), Ability.SNIPER,
                7, 10,
                new Stats(0,0,0,0,1,0), 250,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They take Pidgeot as an idol and want to be like them. They practise their speed each day to get as fast as they are."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peckster");

    }


}
