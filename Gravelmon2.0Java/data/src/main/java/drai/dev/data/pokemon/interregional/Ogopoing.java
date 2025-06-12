package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ogopoing extends drai.dev.data.pokemon.Pokemon {
    public Ogopoing() {
        super("Ogopoing",
                Type.DRAGON, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("ogospiral", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,6),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,18),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,24),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,42),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,48),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,54),
                        new MoveLearnSetEntry(Move.METAL_BURST,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,66)                 ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ogopoing");

    }


}
