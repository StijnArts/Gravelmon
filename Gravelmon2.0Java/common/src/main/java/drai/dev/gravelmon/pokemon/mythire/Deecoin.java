package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Deecoin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Deecoin() {
        super("Deecoin",
                Type.STEEL,Type.BUG,
                new Stats(40,
                        55,
                        65,
                        45,
                        50,
                        35),
                List.of(Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("When it forages in the dirt for food, its back points up and looks like a coin. When something attracted by the shine comes close, Deecoin becomes startled and attacks."),
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
           setLangFileName("Deecoin");

    }


}
