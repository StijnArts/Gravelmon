package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Reefam extends drai.dev.data.pokemon.Pokemon {
    public Reefam() {
        super("Reefam",
                Type.WATER,
                new Stats(40,
                        50,
                        30,
                        45,
                        35,
                        60),
                List.of(Ability.SWIFT_SWIM), Ability.RATTLED,
                5, 165,
                new Stats(0,0,0,0,0,1), 210,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("There is always one leader and two followers. The followers are completely dependant - should they lose their leader, they will wander aimlessly and starve. Two forms have been discovered in the Oceane region."),
                List.of(new EvolutionEntry("appendash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.DRILL_RUN,1),
                        new MoveLearnSetEntry(Move.LIQUIDATION,1),
                        new MoveLearnSetEntry(Move.TEAM_UP,1),
                        new MoveLearnSetEntry(Move.DRAGON_DARTS,1),
                        new MoveLearnSetEntry(Move.RAINBOW_RUSH,1),
                        new MoveLearnSetEntry(Move.INSTRUCT,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
