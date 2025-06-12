package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Slanbolos extends drai.dev.data.pokemon.Pokemon {
    public Slanbolos() {
        super("Slanbolos",
                Type.DARK,
                new Stats(90,
                        130,
                        80,
                        70,
                        170,
                        140),
                List.of(Ability.BAD_DREAMS), Ability.BAD_DREAMS,
                21, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Capable of infesting the deepest reaches of the subconscious, Salanbolos corrupts the mind of those it torments, leaving anger and depression wherever it goes. Though fearsome, it prefers to hide away and remain undetected."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,29),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,38),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,47),
                        new MoveLearnSetEntry(Move.HAZE,57),
                        new MoveLearnSetEntry(Move.DARK_VOID,66),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,75),
                        new MoveLearnSetEntry(Move.DREAM_EATER,84),
                        new MoveLearnSetEntry(Move.DARK_PULSE,93)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slanbolos");
        setCanFly(true);

    }


}
