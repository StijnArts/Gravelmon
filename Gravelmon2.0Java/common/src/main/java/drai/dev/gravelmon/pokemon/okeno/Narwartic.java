package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Narwartic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Narwartic() {
        super("Narwartic",
                Type.ICE,Type.ELECTRIC,
                new Stats(96,
                        95,
                        80,
                        102,
                        75,
                        92),
                List.of(Ability.LIGHTNING_ROD,Ability.SWIFT_SWIM,Ability.OPENSEA), Ability.OPENSEA,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("- Jab Normal 3 Charge Electric 5 Horn Attack Normal 10 Ice ShardSTAB Ice 15 Shock WaveSTAB Electric 18 Ion Deluge Electric 25 Aurora BeamSTAB Ice 28 Charge BeamSTAB Electric 30 Icicle SpearSTAB Ice 33 DischargeSTAB Electric 36 Ice BeamSTAB Ice 40 Megahorn Bug 45 Thunder TailSTAB Electric 48 Ice BreakerSTAB Ice 52 Horn Drill Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.CHARGE,3),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,5),
                        new MoveLearnSetEntry(Move.ICE_SHARD,10),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,15),
                        new MoveLearnSetEntry(Move.ION_DELUGE,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,25),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,28),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,33),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.MEGAHORN,40),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,45),
                        new MoveLearnSetEntry(Move.ICEBREAKER,48),
                        new MoveLearnSetEntry(Move.HORN_DRILL,52),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Narwartic");

    }


}
