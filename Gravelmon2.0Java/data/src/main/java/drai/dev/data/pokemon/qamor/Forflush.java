package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Forflush extends drai.dev.data.pokemon.Pokemon {
    public Forflush() {
        super("Forflush",
                Type.POISON, Type.PSYCHIC,
                new Stats(54,
                        26,
                        52,
                        60,
                        66,
                        32),
                List.of(Ability.PERPLEXING), Ability.PERPLEXING,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Forflush spend most of their life in a confused yet relaxed state due to the gasses that they release often at times of extreme stress. Not only can the gasses ward off predators and is completely harmless to this pokemon, but it also acts as a sort of stress reliever to them."),
                List.of(new EvolutionEntry("sycelium", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,5),
                        new MoveLearnSetEntry(Move.SMOG,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,15),
                        new MoveLearnSetEntry(Move.REFLECT,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,22),
                        new MoveLearnSetEntry(Move.SPORE,25),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,28),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,36),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,40),
                        new MoveLearnSetEntry(Move.RECOVER,43),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,47),
                        new MoveLearnSetEntry(Move.POISONBURST,51),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,56)                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MUSHROOM, Biome.IS_JUNGLE)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Forflush");

    }


}
