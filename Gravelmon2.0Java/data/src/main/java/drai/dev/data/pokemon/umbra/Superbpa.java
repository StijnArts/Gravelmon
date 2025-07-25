package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Superbpa extends Pokemon {
    public Superbpa() {
        super("Superbpa",
                Type.BUG,
                new Stats(30,
                        20,
                        55,
                        35,
                        45,
                        20),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                6, 105,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Superbpa spend long periods of time sleeping. Even when they are awake, they prefer to lay motionless inside flowers."),
                List.of(new EvolutionEntry("regalocera", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.GUST, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HARDEN,7),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor")
                ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
