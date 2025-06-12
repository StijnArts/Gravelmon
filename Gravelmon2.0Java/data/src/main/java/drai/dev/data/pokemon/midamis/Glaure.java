package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Glaure extends drai.dev.data.pokemon.Pokemon {
    public Glaure() {
        super("Glaure",
                Type.GRASS, Type.GHOST,
                new Stats(110,
                        60,
                        115,
                        90,
                        85,
                        65),
                List.of(Ability.INSOMNIA), Ability.ANALYTIC,
                22, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,4),
                        new MoveLearnSetEntry(Move.LEECH_SEED,8),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,12),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.HEX,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.HORN_LEECH,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,36),
                        new MoveLearnSetEntry(Move.INGRAIN,40),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,44),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,48),
                        new MoveLearnSetEntry(Move.FORESTS_CURSE,52)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_TAIGA)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Glaure");

    }


}
