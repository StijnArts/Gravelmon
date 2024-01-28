package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Surchin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Surchin() {
        super("Surchin",
                Type.DARK,Type.WATER,
                new Stats(65,
                        35,
                        65,
                        35,
                        95,
                        30),
                List.of(Ability.AFTERMATH), Ability.IRON_BARBS,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("At night, it scavenges the seafloor for discarded shells to fortify its armor. Its eyes allow it to see in the murky darkness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.PROTECT,9),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,13),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,23),
                        new MoveLearnSetEntry(Move.BRINE,28),
                        new MoveLearnSetEntry(Move.SPIKES,32),
                        new MoveLearnSetEntry(Move.GYRO_BALL,37),
                        new MoveLearnSetEntry(Move.PUNISHMENT,43),
                        new MoveLearnSetEntry(Move.COUNTER,49),
                        new MoveLearnSetEntry(Move.QUASH,56),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,61)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Surchin");

    }


}