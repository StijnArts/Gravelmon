package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianFlaaffy extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianFlaaffy() {
        super("Flaaffy",
                Type.ELECTRIC,
                new Stats(70,
                        55,
                        55,
                        80,
                        60,
                        45),
                List.of(Ability.STATIC), Ability.PLUS,
                8, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                128, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Sand Attack Ground Body Slam Normal Take Down Normal Agility Psychic Screech Normal Flatter Dark Charge Electric Odor Sleuth Normal Eerie Impulse Electric Electric Terrain Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.FLATTER,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"tm"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm")                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flaaffy");

    }


}
