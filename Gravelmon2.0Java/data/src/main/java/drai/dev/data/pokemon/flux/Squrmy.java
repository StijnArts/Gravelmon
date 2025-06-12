package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Squrmy extends Pokemon {
    public Squrmy() {
        super("Squrmy",
                Type.BUG, Type.GROUND,
                new Stats(30,
                        30,
                        25,
                        30,
                        25,
                        50),
                List.of(Ability.LIMBER, Ability.DAMP), Ability.DAMP,
                2, 10,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                38, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("Underestimated by many, this little worm dreams of greatness. However, its body is soft and vulnerable, so it hides underground most of the time."),
                List.of(new EvolutionEntry("durtwurm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.WRIGGLE,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .setAntiBiomes(Biome.IS_COLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
