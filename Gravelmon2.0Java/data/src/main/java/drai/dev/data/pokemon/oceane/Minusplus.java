package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Minusplus extends drai.dev.data.pokemon.Pokemon {
    public Minusplus() {
        super("Minusplus",
                Type.PSYCHIC,
                new Stats(30,
                        50,
                        35,
                        55,
                        50,
                        35),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                4, 165,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                51, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Whilst drifting on warm currents they will often bump into others, their psychic power drawing them together and getting stuck. The longest chain ever found had over 100 individuals!"),
                List.of(new EvolutionEntry("siphonowar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.CALM_MIND,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
