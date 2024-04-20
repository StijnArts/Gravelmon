package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sedavlin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sedavlin() {
        super("Sedavlin",
                Type.BUG, Type.GRASS,
                new Stats(60,
                        60,
                        90,
                        95,
                        70,
                        60),
                List.of(Ability.SWARM,Ability.CHLOROPHYLL,Ability.SHIELD_DUST), Ability.SHIELD_DUST,
                12, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The more quality nectar it consumes, the finer the quality of the silk it produces. Clothes made from their silk used to be all the rage among kings and queens."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.STUN_SPORE,20),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,24),
                        new MoveLearnSetEntry(Move.AIR_SLASH,26),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.SILVER_WIND,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,50),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,54),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,61)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 31, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sedavlin");

    }


}
