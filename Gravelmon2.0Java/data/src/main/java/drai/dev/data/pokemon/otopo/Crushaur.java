package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crushaur extends drai.dev.data.pokemon.Pokemon {
    public Crushaur() {
        super("Crushaur",
                Type.ROCK, Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dragite evolves into Crushaur after eating all the pebbles surrounding its collar. Crushaur's jaw strength is incredible, allowing it to crack open even the toughest mineral deposits. Unfortunately, once they begin eating, they will not stop until they are completely satisfied, resulting in a hefty frame."),
                List.of(new EvolutionEntry("tiamond", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55")))),
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
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND, SpawnPreset.GEMSTONES).build(),
                List.of());
           setLangFileName("Crushaur");

    }


}
