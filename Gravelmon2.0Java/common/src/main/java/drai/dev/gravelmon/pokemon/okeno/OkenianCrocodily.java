package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class OkenianCrocodily extends drai.dev.gravelmon.pokemon.Pokemon {
    public OkenianCrocodily(String name, Aspect aspect) {
        super(name, aspect, "Crocodily",
                Type.DARK, Type.WATER,
                new Stats(45,
                        81,
                        53,
                        44,
                        38,
                        38),
                List.of(Ability.STAKEOUT,Ability.MOXIE,Ability.STRONG_JAW), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crocodily");

    }


}
