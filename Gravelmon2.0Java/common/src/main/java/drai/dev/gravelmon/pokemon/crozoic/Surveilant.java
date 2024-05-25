package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Surveilant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Surveilant() {
        super("Surveilant",
                Type.BUG, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IRON_BARBS,Ability.ILLUMINATE), Ability.FLASH_FIRE,
                6, 90,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Using a string of silk, it hangs from the branches of trees claimed by Hellantern, staking out for potential threats. These trees are considered extremely dangerous to trespass near."),
                List.of(new EvolutionEntry("Hellantern", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)
                ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 15, 25, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Surveilant");

    }


}
