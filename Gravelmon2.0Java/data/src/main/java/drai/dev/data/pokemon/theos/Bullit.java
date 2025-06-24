package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bullit extends drai.dev.data.pokemon.Pokemon {
    public Bullit() {
        super("Bullit",
                Type.FIRE,
                new Stats(60,
                        55,
                        65,
                        50,
                        55,
                        40),
                List.of(Ability.BLAZE), Ability.ANGER_POINT,
                6, 60,
                new Stats(0,0,1,0,0,0), 45,
                0.75,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("bombull", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bullit");

    }


}
