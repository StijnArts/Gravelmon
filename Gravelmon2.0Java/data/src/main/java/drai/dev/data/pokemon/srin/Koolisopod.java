package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koolisopod extends drai.dev.data.pokemon.Pokemon {
    public Koolisopod(Stats stats) {
        super("Koolisopod",
                Type.BUG,Type.ICE,
                stats,
                List.of(Ability.SHELL_ARMOR,Ability.ICE_BODY), Ability.HYPER_CUTTER,
                15, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Koolisopod has adapted to the coldest of environments, as it dwells on deep, frozen seabeds. It can pinch and slash through most obstacles and form brine icicles with ravaging power."),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());

        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Koolisopod");

    }


}
