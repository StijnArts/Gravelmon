package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Foramini extends drai.dev.gravelmon.pokemon.Pokemon {
    public Foramini() {
        super("Foramini",
                Type.ICE,
                new Stats(60,
                        15,
                        75,
                        50,
                        75,
                        10),
                List.of(Ability.SHELL_ARMOR,Ability.MULTISCALE,Ability.PRISM_ARMOR), Ability.PRISM_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It draws in slush and sediment from the frigid seafloor to build its icy carapace. When it dies, this shell returns to the seafloor, and the cycle continues."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,7),
                        new MoveLearnSetEntry(Move.ICE_BALL,11),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.GRUDGE,26),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,31),
                        new MoveLearnSetEntry(Move.FLIP_TURN,36),
                        new MoveLearnSetEntry(Move.SELFREPAIR,42),
                        new MoveLearnSetEntry(Move.BLIZZARD,46),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,52)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Foramini");

    }


}
