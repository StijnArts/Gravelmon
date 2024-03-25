package drai.dev.gravelmon.pokemon.cyare;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Conchorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conchorn() {
        super("Conchorn",
                Type.POISON,Type.STEEL,
                new Stats(75,
                        70,
                        150,
                        55,
                        105,
                        45),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                20, 2812,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("- Poison StingSTAB Poison - Bide Normal - Razor Shell Water 6 Withdraw Water 12 Spike Cannon Normal 17 SludgeSTAB Poison 22 Toxic Spikes Poison 27 Iron Defense Steel 32 Gyro BallSTAB Steel 36 Poison JabSTAB Poison 40 Spikes Ground 47 Toxic Poison 52 Iron HeadSTAB Steel 57 Sludge WaveSTAB Poison 63 Megahorn Bug 70 Shell Smash Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,6),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,12),
                        new MoveLearnSetEntry(Move.SLUDGE,17),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,22),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.TOXIC,47),
                        new MoveLearnSetEntry(Move.IRON_HEAD,52),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,57),
                        new MoveLearnSetEntry(Move.MEGAHORN,63),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,70)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conchorn");

    }


}
