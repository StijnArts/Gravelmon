package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hitmonflip extends drai.dev.data.pokemon.Pokemon {
    public Hitmonflip() {
        super("Hitmonflip",
                Type.FIGHTING,Type.WATER,
                new Stats(70,
                        100,
                        100,
                        35,
                        70,
                        80),
                List.of(Ability.SWIFT_SWIM,Ability.HYDRATION), Ability.PRESSURE,
                0, 0,
                new Stats(0,1,1,0,0,0), 45,
                1.0,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Evo Flip TurnSTAB Water - Flip TurnSTAB Water - Tackle Normal - Coaching Fighting - Feint Normal - Baton Pass (N) Normal 4 Double Kick (N)STAB Fighting 8 Rain Dance Water 12 Endure Normal 16 Aqua JetSTAB Water 21 Quick Guard Fighting 24 DiveSTAB Water 28 Agility Psychic 32 WaterfallSTAB Water 36 SuperpowerSTAB Fighting 40 Bulk Up Fighting 44 Wave CrashSTAB Water 50 First Impression Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COACHING,1),
                        new MoveLearnSetEntry(Move.BATON_PASS,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,4),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,8),
                        new MoveLearnSetEntry(Move.ENDURE,12),
                        new MoveLearnSetEntry(Move.AQUA_JET,16),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,21),
                        new MoveLearnSetEntry(Move.DIVE,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.WATERFALL,32),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36),
                        new MoveLearnSetEntry(Move.BULK_UP,40),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,44),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,50),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
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
           setLangFileName("Hitmonflip");

    }


}
