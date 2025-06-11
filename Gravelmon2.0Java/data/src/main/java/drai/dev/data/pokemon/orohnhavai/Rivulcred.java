package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Rivulcred extends drai.dev.data.pokemon.Pokemon {
    public Rivulcred() {
        super("Rivulcred",
                Type.WATER, Type.DRAGON,
                new Stats(110,
                        70,
                        80,
                        130,
                        90,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is known to be a guardian to a sacred river in the Orohn Division. It kept the waters clean and pure. When it disappeared the river became polluted which killed all the plants and made the Pokemon sick."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,4),
                        new MoveLearnSetEntry(Move.DIVE,8),
                        new MoveLearnSetEntry(Move.THRASH,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,26),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,34),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,44),
                        new MoveLearnSetEntry(Move.GLARE,50),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,56),
                        new MoveLearnSetEntry(Move.OUTRAGE,62),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,70),
                        new MoveLearnSetEntry(Move.ORIGIN_PULSE,78)                     ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rivulcred");

    }


}
