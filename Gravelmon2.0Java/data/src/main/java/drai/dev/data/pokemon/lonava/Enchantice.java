package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Enchantice extends drai.dev.data.pokemon.Pokemon {
    public Enchantice() {
        super("Enchantice",
                Type.GRASS, Type.FAIRY,
                new Stats(77,
                        85,
                        67,
                        116,
                        75,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Enchantice guard sacred wells, disguising themselves as lids covering the entrance. They wrap their vines around opponents, enchanting them in the process."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.GROWTH,18),
                        new MoveLearnSetEntry(Move.POISON_POWDER,21),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.CHARM,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,36),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,39),
                        new MoveLearnSetEntry(Move.ENDEAVOR,42),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,48)),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Enchantice");

    }


}
