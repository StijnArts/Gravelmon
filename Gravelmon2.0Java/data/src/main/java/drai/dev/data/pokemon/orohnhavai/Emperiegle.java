package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Emperiegle extends drai.dev.data.pokemon.Pokemon {
    public Emperiegle() {
        super("Emperiegle",
                Type.NORMAL, Type.FLYING,
                new Stats(90,
                        125,
                        72,
                        50,
                        68,
                        90),
                List.of(Ability.KEEN_EYE,Ability.INTIMIDATE,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                216, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("With their fatal talons and razor sharp beaks, Emperiegle patrol the skies protecting their territory and young. If anyone dares to come too close, there's the possibility they may lose their life."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Emperiegle");

    }


}
