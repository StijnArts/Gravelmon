package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nappi extends drai.dev.data.pokemon.Pokemon {
    public Nappi() {
        super("Nappi",
                Type.BUG,
                new Stats(20,
                        10,
                        10,
                        20,
                        20,
                        30),
                List.of(Ability.RATTLED), Ability.RATTLED,
                1, 3,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                38, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Nappi spend their whole early lives living in fear of just about anything. They hide in dumpsters where they feed on old food scraps."),
                List.of(new EvolutionEntry("rubbage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,8)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nappi");

    }


}
