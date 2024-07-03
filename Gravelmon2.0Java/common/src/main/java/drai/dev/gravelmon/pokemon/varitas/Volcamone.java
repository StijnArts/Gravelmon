package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Volcamone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Volcamone(Stats stats) {
        super("Volcamone",
                Type.WATER, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
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
                        new MoveLearnSetEntry(Move.BURN_UP,60)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 32, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Volcamone");

    }


}
