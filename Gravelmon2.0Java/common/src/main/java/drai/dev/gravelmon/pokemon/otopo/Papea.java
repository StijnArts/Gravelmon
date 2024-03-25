package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Papea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Papea() {
        super("Papea",
                Type.GRASS,Type.FAIRY,
                new Stats(150,
                        5,
                        5,
                        95,
                        145,
                        30),
                List.of(Ability.HERBALIST), Ability.HERBALIST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Papea takes great pleasure in their Peaby. While this Pokémon appears to be sleeping, it is really absorbing sunlight. When the Peaby is ready to develop on its own arable soil, it releases the pods from its arms, which regenerate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.INGRAIN,5),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,14),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,17),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,23),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,26),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,29),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,35),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,41),
                        new MoveLearnSetEntry(Move.ROTOTILLER,46),
                        new MoveLearnSetEntry(Move.MOONBLAST,53),
                        new MoveLearnSetEntry(Move.MOONLIGHT,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.SYNTHESIS,62)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Papea");

    }


}
