package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Conium extends drai.dev.data.pokemon.Pokemon {
    public Conium() {
        super("Conium",
                Type.POISON,
                new Stats(50,
                        45,
                        100,
                        35,
                        70,
                        30),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                5, 236,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("- Poison StingSTAB Poison - Bide Normal 6 Withdraw Water 12 Spike Cannon Normal 17 SludgeSTAB Poison 22 Toxic Spikes Poison 27 Iron Defense Steel 32 Gyro Ball Steel 36 Poison JabSTAB Poison 40 Spikes Ground 44 Toxic Poison 49 Iron Head Steel 54 Sludge WaveSTAB Poison 60 Megahorn Bug 67 Shell Smash Normal"),
                List.of(),
                List.of(
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
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.IRON_HEAD,49),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,54),
                        new MoveLearnSetEntry(Move.MEGAHORN,60),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,67)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Conium");

    }


}
