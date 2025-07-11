package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mermor extends drai.dev.data.pokemon.Pokemon {
    public Mermor() {
        super("Mermor",
                Type.WATER,
                new Stats(40,
                        50,
                        60,
                        35,
                        60,
                        35),
                List.of(Ability.SHELL_ARMOR,Ability.JUSTIFIED,Ability.RUN_AWAY), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                56, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("It's small and picked on by other sea Pokemon, so it hides inside of shells for protection. However, it tends to get stuck and becomes even easier to catch."),
                List.of(new EvolutionEntry("shellance", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_BEACH)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
