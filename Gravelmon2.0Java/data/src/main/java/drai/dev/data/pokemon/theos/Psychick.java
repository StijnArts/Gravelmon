package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psychick extends drai.dev.data.pokemon.Pokemon {
    public Psychick() {
        super("Psychick",
                Type.PSYCHIC, Type.FLYING,
                new Stats(40,
                        50,
                        55,
                        70,
                        55,
                        50),
                List.of(Ability.FOREWARN), Ability.DAZZLING,
                10, 20,
                new Stats(0,0,0,1,0,0), 240,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Psychick's mind is 2 seconds into the future while it's body is in the present. This often causes it to act out before anything happens, giving it a head start to get away."),
                List.of(new EvolutionEntry("psyfan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Psychick");

    }


}
