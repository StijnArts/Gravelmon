package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Petrifly extends drai.dev.data.pokemon.Pokemon {
    public Petrifly() {
        super("Petrifly",
                Type.ROCK,Type.BUG,
                new Stats(52,
                        75,
                        36,
                        65,
                        46,
                        86),
                List.of(Ability.CLEAR_BODY,Ability.COMPOUND_EYES), Ability.STATIC,
                5, 72,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("The fossil revival process reawakened the petrified sap that surrounds it, too. The bug and sap act together as one organism."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,9),
                        new MoveLearnSetEntry(Move.SUPERSONIC,13),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,17),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,21),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.SCREECH,33),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,37),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,41),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,45),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,49),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Petrifly");

    }


}
