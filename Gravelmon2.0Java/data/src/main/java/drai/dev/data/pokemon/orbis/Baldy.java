package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baldy extends drai.dev.data.pokemon.Pokemon {
    public Baldy() {
        super("Baldy",
                Type.NORMAL,
                new Stats(110,
                        55,
                        40,
                        35,
                        55,
                        28),
                List.of(Ability.LIMBER), Ability.LIMBER,
                6, 76,
                new Stats(2,0,0,0,0,0), 150,
                0.5,
                113, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Baldy's skin are like rubber, giving them superb defenses. They use their round bodies to bounce around like balls. They are kept at pre-schools because of their extremely high tollerance to childish behaviour."),
                List.of(new EvolutionEntry("rubbaldy", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(                       ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Baldy");

    }


}
