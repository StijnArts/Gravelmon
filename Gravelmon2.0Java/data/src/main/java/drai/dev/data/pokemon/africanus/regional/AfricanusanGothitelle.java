package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanGothitelle extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanGothitelle(String name, Aspect aspect) {
        super(name, aspect, "Gothitelle",
                Type.WATER,Type.ROCK,
                new Stats(90,
                        40,
                        115,
                        75,
                        120,
                        115),
                List.of(Ability.OJOSPETREOS), null,
                15, 440,
                new Stats(0,0,0,0,0,3), 50,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("En su fase de mayor poder, es capaz de utilizar el poder petrificante de su madre, la Gorgona."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53),
                        new MoveLearnSetEntry(Move.ROCK_THROW,28),
                        new MoveLearnSetEntry(Move.CHARM,50),
                        new MoveLearnSetEntry(Move.STONE_EDGE,39),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,10),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,24),
                        new MoveLearnSetEntry(Move.WATER_GUN,3),
                        new MoveLearnSetEntry(Move.ACCELEROCK,14),
                        new MoveLearnSetEntry(Move.TICKLE,7),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,31),
                        new MoveLearnSetEntry(Move.WATER_SPORT,16),
                        new MoveLearnSetEntry(Move.TELEKINESIS,43),
                        new MoveLearnSetEntry(Move.POWER_GEM,34),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.MIRADAPETREA,60)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL_ISLAND, Biome.IS_ARID)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Gothitelle");

    }


}
