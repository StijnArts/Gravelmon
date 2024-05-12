package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shepatrol extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shepatrol() {
        super("Shepatrol",
                Type.NORMAL,
                new Stats(65,
                        85,
                        80,
                        85,
                        75,
                        95),
                List.of(Ability.FRISK), Ability.INTIMIDATE,
                11, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                87, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Shepatrol are stubborn but loyal, and will only ever listen to one person. Bandits used to train shepatrol to guard their treasure."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,16),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,22),
                        new MoveLearnSetEntry(Move.ROAR,27),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.AGILITY,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,44),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,49)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 54, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Shepatrol");

    }


}
