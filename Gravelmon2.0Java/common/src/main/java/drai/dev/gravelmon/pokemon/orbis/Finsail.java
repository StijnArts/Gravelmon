package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Finsail extends drai.dev.gravelmon.pokemon.Pokemon {
    public Finsail() {
        super("Finsail",
                Type.WATER,
                new Stats(65,
                        100,
                        60,
                        60,
                        75,
                        128),
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                19, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                187, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Finsail are used by trainers across Orbopolis as means of transportation across the ocean. While not being the smoothest and most reliable ride, Finsail are capable of reaching great speeds that makes them popular choice among fisherman who desire to chase their catches. Their long noses are incredibly sturdy and able to break rocks that may block its path."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,25),
                        new MoveLearnSetEntry(Move.LIQUIDATION,32),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,39),
                        new MoveLearnSetEntry(Move.HORN_DRILL,47)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Finsail");

    }


}
