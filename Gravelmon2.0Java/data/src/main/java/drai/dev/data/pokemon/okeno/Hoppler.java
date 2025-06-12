package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hoppler extends drai.dev.data.pokemon.Pokemon {
    public Hoppler() {
        super("Juggaloo",
                Type.BUG, Type.NORMAL,
                new Stats(80,
                        75,
                        55,
                        55,
                        85,
                        108),
                List.of(Ability.LIMBER,Ability.UNBURDEN,Ability.PRANKSTER), Ability.PRANKSTER,
                16, 165,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                160, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("Its nimble movements make it almost impossible to hit."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,3),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,6),
                        new MoveLearnSetEntry(Move.ROLLOUT,9),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,12),
                        new MoveLearnSetEntry(Move.ENCORE,15),
                        new MoveLearnSetEntry(Move.HELPING_HAND,18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,21),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,24),
                        new MoveLearnSetEntry(Move.FLATTER,27),
                        new MoveLearnSetEntry(Move.BATON_PASS,30),
                        new MoveLearnSetEntry(Move.UTURN,33),
                        new MoveLearnSetEntry(Move.ACROBATICS,36),
                        new MoveLearnSetEntry(Move.TRICK,39),
                        new MoveLearnSetEntry(Move.BOUNCE,41),
                        new MoveLearnSetEntry(Move.LUNGE,48),
                        new MoveLearnSetEntry(Move.ME_FIRST,54),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.BESTOW,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Juggaloo");

    }


}
