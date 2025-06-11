package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dreadtyde extends drai.dev.data.pokemon.Pokemon {
    public Dreadtyde() {
        super("Dreadtyde",
                Type.POISON, Type.GHOST,
                new Stats(105,
                        90,
                        100,
                        125,
                        160,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Feared throughout history as the cause for all mass extinctions, it seeps a red algae from its spines that dyes entire oceans red and deprives everything of life. It slumbers, biding its time until the next extinction."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,1),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.SPITE,16),
                        new MoveLearnSetEntry(Move.CURSE,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,36),
                        new MoveLearnSetEntry(Move.DARK_PULSE,42),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,48),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,54),
                        new MoveLearnSetEntry(Move.DREAM_EATER,60),
                        new MoveLearnSetEntry(Move.FATALTIDE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.OCEAN_RUINS)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setCanFly(true);

    }


}
