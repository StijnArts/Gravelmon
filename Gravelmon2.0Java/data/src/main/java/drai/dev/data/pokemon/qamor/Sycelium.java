package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Sycelium extends drai.dev.data.pokemon.Pokemon {
    public Sycelium() {
        super("Sycelium",
                Type.POISON, Type.PSYCHIC,
                new Stats(88,
                        44,
                        65,
                        90,
                        75,
                        38),
                List.of(Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                9, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Sycelium are covered with odd with odd tumor-like lumps filled with a peculiar amount of neurological activity that are even capable of sending signals to other parts of the Sycelium’s body. Sycelium are known to act conflicted or confused, as if battling the commands of its multiple minds."),
                List.of(new EvolutionEntry("cerecybim", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"))),
                        new EvolutionEntry("somberscribe", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 36, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sycelium");

    }


}
