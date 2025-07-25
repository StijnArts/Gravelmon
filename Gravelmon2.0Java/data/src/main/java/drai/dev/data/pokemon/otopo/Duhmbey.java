package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Duhmbey extends drai.dev.data.pokemon.Pokemon {
    public Duhmbey() {
        super("Duhmbey",
                Type.WATER,
                new Stats(40,
                        10,
                        30,
                        10,
                        15,
                        95),
                List.of(Ability.SWIFT_SWIM), Ability.RATTLED,
                3, 0,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Despite its weakness and helplessness, this Pokemon contributes to keeping Otopo's waterways clean and fresh. It spends several years attempting to reach the depths of the body of water in which it dwells."),
                List.of(new EvolutionEntry("vishuslayk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,15),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,20)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_LUKEWARM_OCEAN).aboveY(50).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Duhmbey");

    }


}
