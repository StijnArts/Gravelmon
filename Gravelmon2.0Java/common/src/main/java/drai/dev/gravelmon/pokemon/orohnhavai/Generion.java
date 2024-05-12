package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Generion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Generion() {
        super("Generion",
                Type.FAIRY, Type.FIRE,
                new Stats(100,
                        90,
                        90,
                        100,
                        100,
                        100),
                List.of(Ability.WHITEVIRTUE), Ability.WHITEVIRTUE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("A mystical Pokemon that taught the people generosity. People believe they will be blessed by Generion with good fortune in return for being generous and unselfish. People believe burning a personal belonging while reciting a prayer about Generion will purify themselves of their greediness and feel renewed."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Generion");

    }


}
