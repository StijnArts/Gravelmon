package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moscamech extends drai.dev.data.pokemon.Pokemon {
    public Moscamech() {
        super("Moscamech",
                Type.ROCK,Type.BUG,
                new Stats(102,
                        115,
                        56,
                        95,
                        66,
                        86),
                List.of(Ability.CLEAR_BODY,Ability.COMPOUND_EYES), Ability.STATIC,
                18, 2256,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("An ancient power lets it command the petrified amber like an extension of its body. It can choose whether to make it sticky or rock-solid."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,13),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,17),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,21),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.SCREECH,33),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,37),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,43),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,49),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,55),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,61),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Moscamech");

    }


}
