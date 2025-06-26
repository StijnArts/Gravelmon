package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brrzolt extends drai.dev.data.pokemon.Pokemon {
    public Brrzolt() {
        super("Brrzolt",
                Type.ICE, Type.ELECTRIC,
                new Stats(90,
                        130,
                        70,
                        70,
                        55,
                        85),
                List.of(Ability.TOUGH_CLAWS,Ability.RECKLESS), Ability.UNNERVE,
                18, 1542,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This 'Mon's claws have adapted to be savagely serrated so it can cut through the thick fur and fat of its prey."),
                List.of(),
                List.of(                    ),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(27).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Brrzolt");

    }


}
