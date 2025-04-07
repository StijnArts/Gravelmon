package drai.dev.data.pokemon.ishiria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cracracha extends drai.dev.data.pokemon.Pokemon {
    public Cracracha() {
        super("Cracracha",
                Type.NORMAL,Type.DARK,
                new Stats(65,
                        80,
                        95,
                        60,
                        65,
                        90),
                List.of(Ability.PICKUP,Ability.TECHNICIAN), Ability.INTIMIDATE,
                15, 410,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                168, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Iron Head Steel - ScratchSTAB Normal - Growl Normal - Fake OutSTAB Normal 7 Tail Whip Normal 10 BiteSTAB Dark 12 Quick AttackSTAB Normal 15 Hone Claws Dark 19 CovetSTAB Normal 25 Poison Fang Poison 29 CrunchSTAB Dark 32 Sudden StrikeSTAB Dark 33 Shadow Punch Ghost 34 Counter Fighting 36 Glare Normal 39 Night SlashSTAB Dark 41 SlashSTAB Normal 43 Parting Shot Dark 46 Iron Defense Steel 48 Body Press (N) Fighting 52 Extreme SpeedSTAB Normal 55 Bulk Up Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,12),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,15),
                        new MoveLearnSetEntry(Move.COVET,19),
                        new MoveLearnSetEntry(Move.POISON_FANG,25),
                        new MoveLearnSetEntry(Move.CRUNCH,29),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,32),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,33),
                        new MoveLearnSetEntry(Move.COUNTER,34),
                        new MoveLearnSetEntry(Move.GLARE,36),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,39),
                        new MoveLearnSetEntry(Move.SLASH,41),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,43),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,46),
                        new MoveLearnSetEntry(Move.BODY_PRESS,48),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,52),
                        new MoveLearnSetEntry(Move.BULK_UP,55),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.STUNJAB,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm")),
                List.of(Label.ISHIRIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cracracha");

    }


}
