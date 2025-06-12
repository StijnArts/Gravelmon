package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Loomstool extends drai.dev.data.pokemon.Pokemon {
    public Loomstool() {
        super("Loomstool",
                Type.GRASS, Type.PSYCHIC,
                new Stats(50,
                        40,
                        45,
                        75,
                        46,
                        65),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                16, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                112, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Loomstool don't stay around for long, shooting out glowing spores that will grow into new Mycelil."),
                List.of(new EvolutionEntry("smould", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,8),
                        new MoveLearnSetEntry(Move.ASTONISH,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,16),
                        new MoveLearnSetEntry(Move.INGRAIN,20),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,28),
                        new MoveLearnSetEntry(Move.MOONLIGHT,32),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,36),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.SPORE,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.DREAM_EATER,1)),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MUSHROOM, Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Loomstool");

    }


}
