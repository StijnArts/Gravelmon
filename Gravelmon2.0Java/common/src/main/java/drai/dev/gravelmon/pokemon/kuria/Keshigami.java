package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Keshigami extends drai.dev.gravelmon.pokemon.Pokemon {
    public Keshigami() {
        super("Keshigami",
                Type.FAIRY,Type.GHOST,
                new Stats(75,
                        45,
                        106,
                        80,
                        106,
                        75),
                List.of(Ability.RATTLED,Ability.TECHNICIAN), Ability.CURSED_BODY,
                12, 192,
                new Stats(0,0,1,0,1,0), 45,
                1.0,
                192, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Keshigami is extremely shy, and will avoid any confrontation if possible. They are very hard to bond with because of this, but can make a very good partner if you can get them to open up."),
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
           setLangFileName("Keshigami");

    }


}
