package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chrystalis extends drai.dev.data.pokemon.Pokemon {
    public Chrystalis() {
        super("Chrystalis",
                Type.BUG, Type.PSYCHIC,
                new Stats(34,
                        34,
                        29,
                        98,
                        80,
                        34),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                6, 165,
                new Stats(0,0,0,2,0,0), 130,
                0.5,
                125, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Pupentre live high up in the trees of thick canopies and reflect light in a wide variety of colors, resembling a chandelier. Their lights will attract prey for them to eat, and also confuse predators that might want to eat them."),
                List.of(new EvolutionEntry("crysteavenly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_MAGICAL.getId() + ":" + Biome.IS_MAGICAL.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.REFLECT,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.PSYWAVE,14),
                        new MoveLearnSetEntry(Move.POWER_GEM,20),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,26),
                        new MoveLearnSetEntry(Move.PSYCHIC,30),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,36),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_BOOKSHELVES)
    .build(), List.of());
	
           setLangFileName("Chrystalis");

    }


}
