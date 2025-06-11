package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Heaxen extends drai.dev.data.pokemon.Pokemon {
    public Heaxen() {
        super("Heaxen",
                Type.NORMAL,
                new Stats(35,
                        40,
                        20,
                        40,
                        50,
                        60),
                List.of(Ability.SUPER_LUCK), Ability.UNBURDEN,
                6, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their fantastic hearing allow them to never be caught by surprise, they can hear the whole forest even while asleep."),
                List.of(new EvolutionEntry("aurinel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.COVET,12),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,15),
                        new MoveLearnSetEntry(Move.ROUND,17),
                        new MoveLearnSetEntry(Move.SING,20),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.AGILITY,27),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,30),
                        new MoveLearnSetEntry(Move.WISH,35),
                        new MoveLearnSetEntry(Move.BATON_PASS,39),
                        new MoveLearnSetEntry(Move.LAST_RESORT,42)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Heaxen");

    }


}
