package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Eoterra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eoterra() {
        super("Eoterra",
                Type.ROCK,
                new Stats(65,
                        120,
                        80,
                        80,
                        70,
                        100),
                List.of(Ability.SOUNDPROOF,Ability.SAND_STREAM,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                232, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Eoterra's body withers easily and then grows back by regenerating itself. Swiftly they roam the volcanic deserts of Norheim. Their bodies are completely hollow and are covered in different rocks."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eoterra");

    }


}
