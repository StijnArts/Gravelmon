package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Herokolus extends drai.dev.data.pokemon.Pokemon {
    public Herokolus() {
        super("Herokolus",
                Type.FIGHTING,
                new Stats(60,
                        84,
                        62,
                        20,
                        30,
                        45),
                List.of(Ability.SHEER_FORCE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 110,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Herokolus train everyday so they can throw at their targets accurately. Its headpiece has special properties that help it to concentrate."),
                List.of(new EvolutionEntry("diskobolus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.BULK_UP,16),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,20),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,32),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,44),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,48)
                ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Herokolus");

    }


}
