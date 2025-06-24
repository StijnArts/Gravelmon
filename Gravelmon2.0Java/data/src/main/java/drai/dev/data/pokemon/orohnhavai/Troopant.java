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
                List.of(Ability.GUTS,Ability.STEADFAST), Ability.SHARPSHOOTER,
                3, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colonies of Troopant can be found almost anywhere. They will go on raids in search for food especially for fruits and berries because of their sweetness and for the seeds, which they store in their abdomen. They shoot them out like bullets to harm its foes. They are most aggressive in huge numbers."),
                List.of(new EvolutionEntry("antzooka", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Troopant");

    }


}
