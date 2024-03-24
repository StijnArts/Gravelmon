package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sardiner extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sardiner() {
        super("Sardiner",
                Type.POISON,Type.STEEL,
                new Stats(30,
                        10,
                        80,
                        60,
                        109,
                        68),
                List.of(Ability.STENCH,Ability.CONTAMINATE,Ability.ANALYTIC), Ability.ANALYTIC,
                4, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The stench of a Muk may seem like a gag in comparison to a school of Sardiner. Despite how stinky they are, they make up the majority of a Basshark's diet."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,23),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,34),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,38),
                        new MoveLearnSetEntry(Move.METAL_BURST,41),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.MEMENTO,54),
                        new MoveLearnSetEntry(Move.LIQUIDMETAL,60),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 29, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
