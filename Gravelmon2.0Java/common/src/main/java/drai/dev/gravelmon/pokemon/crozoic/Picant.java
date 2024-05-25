package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Picant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Picant() {
        super("Picant",
                Type.BUG, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SWARM,Ability.ILLUMINATE), Ability.FLASH_FIRE,
                3, 60,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("Surveilant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.SINGE,4),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.EMBER,10)
                ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 1, 19, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Picant");

    }


}
