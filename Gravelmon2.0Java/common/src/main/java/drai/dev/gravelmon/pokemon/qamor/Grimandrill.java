package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grimandrill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimandrill() {
        super("Grimandrill",
                Type.DARK,
                new Stats(68,
                        110,
                        104,
                        93,
                        58,
                        72),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.GORILLA_TACTICS), Ability.GORILLA_TACTICS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Grimandril stalk their prey for hours, silently staring them down from behind thickets of trees and bushes. The more agitated they become, the bigger the smile gets. This Pokemon's cry is known to sound uncannily human-like."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimandrill");

    }


}
