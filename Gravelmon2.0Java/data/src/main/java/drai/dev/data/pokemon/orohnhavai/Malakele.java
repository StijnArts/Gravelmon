package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Malakele extends drai.dev.data.pokemon.Pokemon {
    public Malakele() {
        super("Malakele",
                Type.GHOST, Type.FIGHTING,
                new Stats(55,
                        75,
                        40,
                        70,
                        25,
                        65),
                List.of(Ability.INSOMNIA,Ability.UNAWARE), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Malakel'e gather under the moonlight to practice their chanting. It is said their chants can cause headaches, nausea, and give bad dreams to those who hear it. According to old Havaian legend, these Pokemon represented the spirits of fallen warriors."),
                List.of(new EvolutionEntry("kahukele", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Malakel-e");

    }


}
