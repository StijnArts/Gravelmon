package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pipillar extends drai.dev.data.pokemon.Pokemon {
    public Pipillar() {
        super("Pipillar",
                Type.BUG,
                new Stats(40,
                        40,
                        65,
                        30,
                        20,
                        40),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pipillar is not a bug to be messed with due to tough and stubborn nature. Its pincers can tear other small Pokemon to pieces."),
                List.of(new EvolutionEntry("vicoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.HARDEN,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.TWINEEDLE,13),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,16),
                        new MoveLearnSetEntry(Move.PINCH,20),
                        new MoveLearnSetEntry(Move.LUNGE,30)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pipillar");

    }


}
