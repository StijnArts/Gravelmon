package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Magmead extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magmead() {
        super("Magmead",
                Type.BUG,
                new Stats(80,
                        30,
                        44,
                        30,
                        55,
                        38),
                List.of(Ability.HONEY_GATHER,Ability.SCAVENGE,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Magmead live in cavernous colonies that stretch sometimes miles beneath the sandy surface. They can go days and days without eating as long as their elastic abdomen is filled with a sweet, honey-like substance they produce to ration food."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magmead");

    }


}
