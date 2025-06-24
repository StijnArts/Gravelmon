package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chainect extends drai.dev.data.pokemon.Pokemon {
    public Chainect() {
        super("Chainect",
                Type.ELECTRIC,
                new Stats(40,
                        30,
                        30,
                        70,
                        65,
                        60),
                List.of(Ability.PLUS,Ability.MINUS), Ability.BATTERY,
                6, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These Pokemon are being used to run small facilities and are used in tests regarding space-flight products. They feed on electricity by draining them from many sources. Chainect connect with other Chainect to transfer electricity."),
                List.of(new EvolutionEntry("chainector", EvolutionType.TRADE, List.of(),
                        List.of())),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Chainect");

    }


}
