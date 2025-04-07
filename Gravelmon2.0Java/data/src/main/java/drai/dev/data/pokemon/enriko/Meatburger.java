package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Meatburger extends drai.dev.data.pokemon.Pokemon {
    public Meatburger() {
        super("Meatburger",
                Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STENCH,Ability.REGENERATOR,Ability.INTIMIDATE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo type.) Approximately a thousand carcasses could make up a single Meatburger. Despite it's grotesque appearance, it is sympathetic by nature and insists its meat be used in restaurants and fast food restaurants."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Meatburger");

    }


}
