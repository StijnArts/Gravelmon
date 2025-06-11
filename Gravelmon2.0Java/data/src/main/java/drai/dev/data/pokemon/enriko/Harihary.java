package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Harihary extends drai.dev.data.pokemon.Pokemon {
    public Harihary() {
        super("Harihary",
                Type.NORMAL,
                new Stats(60,
                        60,
                        75,
                        20,
                        75,
                        50),
                List.of(Ability.DRY_SKIN), Ability.RATTLED,
                9, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.75,
                100, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("An extremely elusive Pokemon that supposedly only lives deep in the darkest woods. Anybody who claims to have seen one also claims it disappeared in a puff of scraggly hairs upon capture."),
                List.of(new EvolutionEntry("wigfoot", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WRAP,5),
                        new MoveLearnSetEntry(Move.HOWL,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,16),
                        new MoveLearnSetEntry(Move.COVET,20),
                        new MoveLearnSetEntry(Move.CHARM,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,32),
                        new MoveLearnSetEntry(Move.SLAM,36)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Harihary");

    }


}
