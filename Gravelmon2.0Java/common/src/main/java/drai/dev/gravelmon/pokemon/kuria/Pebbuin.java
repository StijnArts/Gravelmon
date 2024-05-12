package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pebbuin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pebbuin() {
        super("Pebbuin",
                Type.ROCK,
                new Stats(45,
                        54,
                        66,
                        74,
                        66,
                        45),
                List.of(Ability.SOLID_ROCK), Ability.CHLOROPHYLL,
                4, 85,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("Although they aren't capable of long term flight, Pebbuin can lift off the ground just long enough to launch itself at an opponent. They don't hurt much, though."),
                List.of(new EvolutionEntry("pengerupt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(          new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.EMBER,22),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,36),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,50),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,64)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 28, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pebbuin");

    }


}
