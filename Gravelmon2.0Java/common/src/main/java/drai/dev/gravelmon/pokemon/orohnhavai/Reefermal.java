package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Reefermal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reefermal() {
        super("Reefermal",
                Type.WATER, Type.FIRE,
                new Stats(60,
                        50,
                        80,
                        100,
                        60,
                        70),
                List.of(Ability.WATER_ABSORB), Ability.FLASH_FIRE,
                9, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Reefermal can be found near hydrothermal vents in the ocean. Their bodies are able to withstand the intense heat of the water around the vents. Their fiery fins will sear anything it touches."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,19),
                        new MoveLearnSetEntry(Move.PROTECT,24),
                        new MoveLearnSetEntry(Move.BEACHTIDE,27),
                        new MoveLearnSetEntry(Move.FLIP_TURN,32),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,39),
                        new MoveLearnSetEntry(Move.BATON_PASS,44),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,49),
                        new MoveLearnSetEntry(Move.RECOVER,54),
                        new MoveLearnSetEntry(Move.BURN_UP,60),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,64)              ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 9, 34, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
