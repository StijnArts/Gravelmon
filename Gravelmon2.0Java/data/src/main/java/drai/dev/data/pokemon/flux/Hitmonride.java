package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hitmonride extends drai.dev.data.pokemon.Pokemon {
    public Hitmonride() {
        super("Hitmonride",
                Type.FIGHTING,Type.STEEL,
                new Stats(70,
                        70,
                        105,
                        35,
                        70,
                        105),
                List.of(Ability.SPEED_BOOST,Ability.STAMINA), Ability.CONTRARY,
                0, 0,
                new Stats(0,0,1,0,0,1), 45,
                1.0,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Evo U-turn Bug - U-turn Bug - Tackle Normal - Coaching Fighting - Feint Normal - Baton Pass (N) Normal 4 Rapid Spin Normal 8 Trailblaze Grass 12 Defense Curl Normal 16 Bullet PunchSTAB Steel 21 Quick Guard Fighting 24 Rollout Rock 28 Agility Psychic 32 Spin OutSTAB Steel 36 SuperpowerSTAB Fighting 40 Bulk Up Fighting 44 Steel RollerSTAB Steel 50 Shift Gear Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COACHING,1),
                        new MoveLearnSetEntry(Move.UTURN,1),
                        new MoveLearnSetEntry(Move.BATON_PASS,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,4),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,8),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,12),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,16),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,21),
                        new MoveLearnSetEntry(Move.ROLLOUT,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.SPIN_OUT,32),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36),
                        new MoveLearnSetEntry(Move.BULK_UP,40),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,44),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,50),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
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
           setLangFileName("Hitmonride");

    }


}
