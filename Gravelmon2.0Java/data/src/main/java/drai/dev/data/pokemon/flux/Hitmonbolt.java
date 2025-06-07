package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hitmonbolt extends drai.dev.data.pokemon.Pokemon {
    public Hitmonbolt() {
        super("Hitmonbolt",
                Type.FIGHTING,Type.ELECTRIC,
                new Stats(70,
                        115,
                        70,
                        35,
                        70,
                        95),
                List.of(Ability.MOTOR_DRIVE,Ability.CONTRARY), Ability.RECKLESS,
                0, 0,
                new Stats(0,2,0,0,0,0), 45,
                1.0,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Evo Volt SwitchSTAB Electric - Volt SwitchSTAB Electric - Tackle Normal - Coaching Fighting - Feint Normal - Baton Pass (N) Normal 4 Double Kick (N)STAB Fighting 8 Thunder Wave Electric 12 Charge Electric 16 ElectrowebSTAB Electric 21 Quick Guard Fighting 24 SparkSTAB Electric 28 Agility Psychic 32 Wild ChargeSTAB Electric 36 SuperpowerSTAB Fighting 40 Bulk Up Fighting 44 Supercell SlamSTAB Electric 50 Extreme Speed Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COACHING,1),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,1),
                        new MoveLearnSetEntry(Move.BATON_PASS,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,4),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,8),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.ELECTROWEB,16),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,21),
                        new MoveLearnSetEntry(Move.SPARK,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,32),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36),
                        new MoveLearnSetEntry(Move.BULK_UP,40),
                        new MoveLearnSetEntry(Move.SUPERCELLSLAM,44),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,50),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.UPPERHAND,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hitmonbolt");

    }


}
