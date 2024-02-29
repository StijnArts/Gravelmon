package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Enlune extends drai.dev.gravelmon.pokemon.Pokemon {
    public Enlune() {
        super("Enlune",
                Type.ELECTRIC,
                new Stats(65,
                        65,
                        55,
                        80,
                        85,
                        75),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                15, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Enlune is a clawed Pokemon that enjoys fireworks and anything related to light. They have a fascination with mirrors and whenever one is near, they are seen gazing into it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,11),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,14),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,19),
                        new MoveLearnSetEntry(Move.AGILITY,22),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,27),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,30),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,35),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,38),
                        new MoveLearnSetEntry(Move.DISCHARGE,41),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Enlune");

    }


}
