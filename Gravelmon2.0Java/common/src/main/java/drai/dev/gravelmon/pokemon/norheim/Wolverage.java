package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wolverage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wolverage() {
        super("Wolverage",
                Type.NORMAL,
                new Stats(95,
                        110,
                        80,
                        65,
                        75,
                        80),
                List.of(Ability.OVERCOAT,Ability.GLUTTONY,Ability.HUNGER_SWITCH), Ability.HUNGER_SWITCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A rare sight to behold in the forests of Migard; often mistaken for other Pokemon. When hungry, it may tear down large trees with its clumsy body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wolverage");

    }


}
