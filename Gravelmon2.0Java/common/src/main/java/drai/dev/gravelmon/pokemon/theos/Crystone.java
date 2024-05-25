package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Crystone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crystone() {
        super("Crystone",
                Type.ROCK,
                new Stats(45,
                        80,
                        60,
                        30,
                        60,
                        40),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                9, 300,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In ancient times, it was seen as a sign of wealth to have a Crystone at your side. Their gemstone horn's are often sought out by poachers."),
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
           setLangFileName("Crystone");

    }


}
