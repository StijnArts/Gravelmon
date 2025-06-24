package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cricky extends drai.dev.data.pokemon.Pokemon {
    public Cricky() {
        super("Cricky",
                Type.BUG,
                new Stats(30,
                        60,
                        50,
                        35,
                        40,
                        60),
                List.of(Ability.SWARM), Ability.RATTLED,
                4, 6,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                55, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cricky can jump very high and far, causing them to often get carried by the wind. Their legs are extremely quick, able to kick an average of 10 times per second."),
                List.of(new EvolutionEntry("crickick", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cricky");

    }


}
