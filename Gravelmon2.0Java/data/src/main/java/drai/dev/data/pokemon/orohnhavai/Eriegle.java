package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Eriegle extends drai.dev.data.pokemon.Pokemon {
    public Eriegle() {
        super("Eriegle",
                Type.NORMAL, Type.FLYING,
                new Stats(49,
                        65,
                        38,
                        30,
                        38,
                        45),
                List.of(Ability.KEEN_EYE,Ability.BIG_PECKS,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Born with fairly weak wings, Eriegle love to stay in their nest and be nurtured by their parents until it's strong enough to fly from its roost. They become more hostile as they grow."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Eriegle");

    }


}
