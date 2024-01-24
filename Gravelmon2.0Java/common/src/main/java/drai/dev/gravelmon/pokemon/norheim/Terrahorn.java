package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Terrahorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terrahorn() {
        super("Terrahorn",
                Type.ROCK,Type.GRASS,
                new Stats(85,
                        105,
                        121,
                        90,
                        80,
                        60),
                List.of(Ability.BATTLE_ARMOR,Ability.BERSERK,Ability.HUSTLE), Ability.HUSTLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The massive lungs of this relic can produce an incredible amount of air, bursting out of its hollow horn, the stumps on its back and its nostrils. The horn itself along the stumps on its back may break over time as they clash into other Terrahorn, fighting over territory."),
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
           setLangFileName("Terrahorn");

    }


}
