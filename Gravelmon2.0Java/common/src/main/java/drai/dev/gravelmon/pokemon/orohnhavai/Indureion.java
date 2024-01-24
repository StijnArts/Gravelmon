package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Indureion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Indureion() {
        super("Indureion",
                Type.FAIRY,Type.GRASS,
                new Stats(90,
                        100,
                        80,
                        100,
                        90,
                        120),
                List.of(Ability.WHITEVIRTUE), Ability.WHITEVIRTUE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("A mystical Pokémon that taught the people patience and kindness. Many farmers and gardeners believe that with patience, Indureion will bless them with bountiful crops and successful planting. Many believe eating the crops blessed by Indureion will purify them of their envy and impatience."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Indureion");

    }


}
