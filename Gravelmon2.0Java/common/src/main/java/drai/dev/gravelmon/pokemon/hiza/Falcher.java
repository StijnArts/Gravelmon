package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Falcher extends drai.dev.gravelmon.pokemon.Pokemon {
    public Falcher() {
        super("Falcher",
                Type.BUG,Type.FAIRY,
                new Stats(85,
                        130,
                        80,
                        55,
                        85,
                        65),
                List.of(Ability.DAZZLING,Ability.RIVALRY,Ability.DANCER), Ability.DANCER,
                8, 165,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When enraged it will swiftly spin with its sharp blade arms, becoming completely unapproachable."),
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
           setLangFileName("Falcher");

    }


}
