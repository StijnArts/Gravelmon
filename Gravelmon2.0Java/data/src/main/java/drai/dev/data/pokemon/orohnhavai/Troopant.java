package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Troopant extends drai.dev.data.pokemon.Pokemon {
    public Troopant() {
        super("Troopant",
                Type.BUG,
                new Stats(30,
                        55,
                        45,
                        50,
                        45,
                        45),
                List.of(Ability.GUTS,Ability.STEADFAST,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colonies of Troopant can be found almost anywhere. They will go on raids in search for food especially for fruits and berries because of their sweetness and for the seeds, which they store in their abdomen. They shoot them out like bullets to harm its foes. They are most aggressive in huge numbers."),
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
           setLangFileName("Troopant");

    }


}
