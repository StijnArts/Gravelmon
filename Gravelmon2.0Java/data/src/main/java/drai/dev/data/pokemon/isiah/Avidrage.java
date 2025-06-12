package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Avidrage extends drai.dev.data.pokemon.Pokemon {
    public Avidrage() {
        super("Avidrage",
                Type.DRAGON, Type.FLYING,
                new Stats(95,
                        114,
                        98,
                        74,
                        125,
                        94
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                25, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.FLURRYPECK,9),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,14),
                        new MoveLearnSetEntry(Move.PLUCK,19),
                        new MoveLearnSetEntry(Move.SNATCH,22),
                        new MoveLearnSetEntry(Move.DRAGONFANG,26),
                        new MoveLearnSetEntry(Move.SCREECH,29),
                        new MoveLearnSetEntry(Move.DRILL_PECK,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,37),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,41),
                        new MoveLearnSetEntry(Move.LUNGE,43),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,47),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.OUTRAGE,55)                  ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Avidrage");

    }


}
