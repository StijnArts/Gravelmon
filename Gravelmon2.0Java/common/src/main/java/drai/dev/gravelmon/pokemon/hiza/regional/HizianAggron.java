package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianAggron extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianAggron() {
        super("Aggron",
                Type.GROUND,Type.ROCK,
                new Stats(70,
                        120,
                        170,
                        60,
                        60,
                        50),
                List.of(Ability.SHEER_FORCE), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                239, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Their large curved horns are used to grab and toss their opponents. Not even the most dense and powerful sandstorm can scratch its rock hard armor."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aggron");

    }


}
