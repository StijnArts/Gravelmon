package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Peckussion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peckussion() {
        super("Peckussion",
                Type.FIGHTING, Type.FLYING,
                new Stats(75,
                        120,
                        75,
                        50,
                        60,
                        115),
                List.of(Ability.KEEN_EYE,Ability.RIVALRY), Ability.SNIPER,
                12, 300,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                1060, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Percudart are often taken as a quick detour for mail because they have an extemely keen sense of orientation. On confrontration, they dive towards you like a dart."),
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
           setLangFileName("Peckussion");

    }


}
