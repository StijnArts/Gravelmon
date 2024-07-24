package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Fortibal extends drai.dev.data.pokemon.Pokemon {
    public Fortibal() {
        super("Fortibal",
                Type.STEEL,
                new Stats(50,
                        50,
                        120,
                        30,
                        75,
                        25),
                List.of(Ability.STURDY,Ability.HEATPROOF,Ability.IRON_BARBS), Ability.IRON_BARBS,
                10, 165,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                92, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Fortibal can use both defense and offense at the same time by rolling up in a spiked ball and charging at its enemies."),
                List.of(new EvolutionEntry("armodieval", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.HARDEN,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,15),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.BLOCK,30),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,35),
                        new MoveLearnSetEntry(Move.DETECT,40),
                        new MoveLearnSetEntry(Move.METAL_SOUND,46),
                        new MoveLearnSetEntry(Move.METAL_BURST,52),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,58),
                        new MoveLearnSetEntry(Move.GYRO_BALL,64)                        ),
                List.of(Label.OROHNHAVAI
                ),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 32, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fortibal");

    }


}
