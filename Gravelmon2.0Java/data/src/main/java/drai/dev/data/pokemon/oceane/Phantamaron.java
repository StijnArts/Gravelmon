package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phantamaron extends drai.dev.data.pokemon.Pokemon {
    public Phantamaron(Stats stats) {
        super("Phantamaron",
                Type.WATER, Type.GHOST,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It moves in an irregular, dance-like manner. As it dances, it phases in and out of view and leaves any potential threats or prey frozen in fear. While distracted, it siphons off their life energy without them even realising."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LICK,2),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,4),
                        new MoveLearnSetEntry(Move.WATER_PULSE,7),
                        new MoveLearnSetEntry(Move.HYPNOSIS,11),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,22),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,29),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,37),
                        new MoveLearnSetEntry(Move.RECOVER,46)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Phantamaron");

    }


}
