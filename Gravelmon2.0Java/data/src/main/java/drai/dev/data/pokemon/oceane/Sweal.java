package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sweal extends drai.dev.data.pokemon.Pokemon {
    public Sweal() {
        super("Sweal",
                Type.NORMAL,
                new Stats(55,
                        30,
                        20,
                        30,
                        60,
                        50),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                5, 165,
                new Stats(0,0,0,0,1,0), 220,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Sweal spend most of their entire lives sleeping. The coat covering them starts off white but darkens as they age - it is extremely soft and highly sought after."),
                List.of(new EvolutionEntry("fleezer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
