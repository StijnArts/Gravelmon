package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Cerecybim extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cerecybim() {
        super("Cerecybim",
                Type.POISON, Type.PSYCHIC,
                new Stats(122,
                        60,
                        90,
                        125,
                        98,
                        35),
                List.of(Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                15, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Each Cerecybin has a collection of fully functional brains peppered throughout its body, working in a sort of hive mind where they work with each other and share their thoughts throughout the whole cluster. Cerecybin's gas is toxic, and breathing in too much is said to cause mutations in an organism's body."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.GROWTH,1),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cerecybim");

    }


}
