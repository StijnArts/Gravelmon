package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dragite extends drai.dev.data.pokemon.Pokemon {
    public Dragite() {
        super("Dragite",
                Type.ROCK, Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It hatches from the toughest of eggs, devouring the shell to build its rough carapace. Dragite is still growing and struggles to keep upright. It still lacks arms."),
                List.of(new EvolutionEntry("crushaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,7),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,13),
                        new MoveLearnSetEntry(Move.HARDEN,16),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,19),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,22),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,31),
                        new MoveLearnSetEntry(Move.STONE_EDGE,34),
                        new MoveLearnSetEntry(Move.REFLECT,37),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,52) ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND, SpawnPreset.GEMSTONES).build(),
                List.of());
           setLangFileName("Dragite");

    }


}
