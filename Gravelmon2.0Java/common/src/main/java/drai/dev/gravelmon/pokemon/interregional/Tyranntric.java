package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Tyranntric extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tyranntric() {
        super("Tyranntric",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(70,
                        130,
                        90,
                        140,
                        80,
                        170),
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                25, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(               new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,14),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,21),
                        new MoveLearnSetEntry(Move.DISCHARGE,28),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,35),
                        new MoveLearnSetEntry(Move.CALM_MIND,42),
                        new MoveLearnSetEntry(Move.THUNDERCLAP,49),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,56),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,63),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,70),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,77),
                        new MoveLearnSetEntry(Move.BODY_PRESS,84),
                        new MoveLearnSetEntry(Move.THUNDER,91)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tyranntric");

    }


}
