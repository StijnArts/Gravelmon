package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Predageist extends drai.dev.data.pokemon.Pokemon {
    public Predageist() {
        super("Predageist",
                Type.GRASS, Type.GHOST,
                new Stats(75,
                        90,
                        65,
                        55,
                        50,
                        80),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                12, 417,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("A dark force revived a poor Spritten caught in a trap, and now this 'Mon seeks out those that would do harm to others relentlessly."),
                List.of(new EvolutionEntry("phanther", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Predageist");

    }


}
