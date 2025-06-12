package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ribbidi extends drai.dev.data.pokemon.Pokemon {
    public Ribbidi() {
        super("Ribbidi",
                Type.GHOST, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("froggidi", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.VENOSHOCK,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.POISON_GAS,13),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,26),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,30),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,34),
                        new MoveLearnSetEntry(Move.HEX,38),
                        new MoveLearnSetEntry(Move.WILLOWISP,52),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP, Biome.IS_MUSHROOM)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ribbidi");

    }


}
