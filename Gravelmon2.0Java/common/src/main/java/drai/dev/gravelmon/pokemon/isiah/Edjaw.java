package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Edjaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Edjaw() {
        super("Edjaw",
                Type.ROCK,
                new Stats(75,
                        130,
                        110,
                        70,
                        65,
                        50),
                List.of(Ability.STRONG_JAW), Ability.SAND_FORCE,
                8, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Edjaw's powerful stone mouth is able to crush the largest of boulders with little effort. It's said that they preserve the minerals they digest in their stomach, refining them over time."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Edjaw");

    }


}
