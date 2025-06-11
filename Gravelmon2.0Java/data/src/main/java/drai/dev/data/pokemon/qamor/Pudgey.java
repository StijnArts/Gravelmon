package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pudgey extends drai.dev.data.pokemon.Pokemon {
    public Pudgey() {
        super("Pudgey",
                Type.NORMAL, Type.FLYING,
                new Stats(100,
                        45,
                        75,
                        40,
                        50,
                        20),
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                3, 165,
                new Stats(1,0,0,0,0,0), 33,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Pudgey mimic the appearance of Pidgey because their lazy parents- who don't want to raise them- instead lay their eggs in Pidgeot nests. Newly hatched Pudgey will hog all of the food from its nest-mates, often starving its 'siblings' in the process. Once the Pokemon has mooched all the food from it's host nest and feels satisfied, it will evolve."),
                List.of(new EvolutionEntry("flappetite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHOVEOFF,1)       ,
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.WHIRLWIND,17),
                        new MoveLearnSetEntry(Move.TWISTER,21),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,25),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.WING_ATTACK,33),
                        new MoveLearnSetEntry(Move.ROOST,37),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,45),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.HURRICANE,53)
                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ISLAND, Biome.IS_TROPICAL_ISLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pudgey");

    }


}
