package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rewt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rewt() {
        super("Rewt",
                Type.WATER, Type.FIRE,
                new Stats(35,
                        35,
                        65,
                        65,
                        55,
                        50),
                List.of(Ability.LIQUID_OOZE), Ability.LIQUID_OOZE,
                3, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("salrander", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")
                ),
                List.of(                       new MoveLearnSetEntry(Move.ENDURE,1),
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
                        new MoveLearnSetEntry(Move.BELLY_DRUM,64) ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
