package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Breame extends drai.dev.gravelmon.pokemon.Pokemon {
    public Breame() {
        super("Breame",
                Type.NORMAL,
                new Stats(55,
                        75,
                        65,
                        150,
                        65,
                        55),
                List.of(Ability.SNIPER), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("An artificial Pokemon only capable of producing beam-based attacks. Breame are fond of mirrors and will fire them gleefully from it’s snout."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,5),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,10),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,20),
                        new MoveLearnSetEntry(Move.PSYBEAM,30),
                        new MoveLearnSetEntry(Move.ICE_BEAM,40),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,50),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,70)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Breame");

    }


}
