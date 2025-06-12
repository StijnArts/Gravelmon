package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Durtwurm extends Pokemon {
    public Durtwurm() {
        super("Durtwurm",
                Type.BUG, Type.GROUND,
                new Stats(50,
                        60,
                        75,
                        40,
                        75,
                        40),
                List.of(Ability.WEAK_ARMOR, Ability.DRY_SKIN), Ability.DRY_SKIN,
                5, 82,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                125, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("It secretes a sticky substance that it uses to attach clods of dirt to its body as protection. It rolls its body like a wheel to get around quickly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.WRIGGLE,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .setAntiBiomes(Biome.IS_COLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
