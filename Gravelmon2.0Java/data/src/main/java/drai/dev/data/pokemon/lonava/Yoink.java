package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Yoink extends drai.dev.data.pokemon.Pokemon {
    public Yoink() {
        super("Yoink",
                Type.DARK,
                new Stats(50,
                        72,
                        35,
                        35,
                        35,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Yoink hide in orchards, patiently waiting for farmers to take their eyes off the trees. When they do, Yoink steal as much fruit as they can hold, before hightailing it back to their dens."),
                List.of(new EvolutionEntry("hogrump", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THIEF,5),
                        new MoveLearnSetEntry(Move.LEER,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FAKE_OUT,15),
                        new MoveLearnSetEntry(Move.FLING,19),
                        new MoveLearnSetEntry(Move.SNARL,23),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,26),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,30),
                        new MoveLearnSetEntry(Move.TAUNT,34),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.PAYBACK,41),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,48),
                        new MoveLearnSetEntry(Move.TRICK,50)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPRING)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Yoink");

    }


}
