package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanGothita extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanGothita(String name, Aspect aspect) {
        super(name, aspect, "Gothita",
                Type.WATER,Type.ROCK,
                new Stats(65,
                        30,
                        75,
                        60,
                        75,
                        75),
                List.of(Ability.OJOSPETREOS), null,
                4, 58,
                new Stats(0,0,0,0,0,1), 200,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Cuando Perseo derrotó a la Gorgona, esta puso varios pequeños huevos de los que salió este Pokémon."),
                List.of(new EvolutionEntry("gothorita africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
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
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,19),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,31),
                        new MoveLearnSetEntry(Move.WATER_SPORT,16),
                        new MoveLearnSetEntry(Move.TELEKINESIS,43),
                        new MoveLearnSetEntry(Move.POWER_GEM,34),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL_ISLAND, Biome.IS_ARID)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setLangFileName("Gothita");

    }


}
