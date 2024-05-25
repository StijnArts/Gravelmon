package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Beetile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beetile() {
        super("Beetile",
                Type.BUG,
                new Stats(50,
                        80,
                        55,
                        25,
                        35,
                        45),
                List.of(Ability.SAP_SIPPER,Ability.HYPER_CUTTER), Ability.OBLIVIOUS,
                4, 55,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Beetile use their horn to chip away at trees, getting to the sap inside. When they're close to evolving, they will stick to the side of an object and not let go until they evolve."),
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
           setLangFileName("Beetile");

    }


}
