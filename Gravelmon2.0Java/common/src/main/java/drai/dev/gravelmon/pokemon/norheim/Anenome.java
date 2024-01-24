package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Anenome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anenome() {
        super("Anenome",
                Type.FAIRY,Type.GRASS,
                new Stats(90,
                        60,
                        60,
                        85,
                        104,
                        71),
                List.of(Ability.COLOR_CHANGE,Ability.ADAPTABILITY,Ability.PROTEAN), Ability.PROTEAN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Present but not seen. Anenome has the ability to turn completely invisible. It may appear during dark winter nights; only to taste the food offered by farmers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Anenome");

    }


}
