package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Magnidove extends Pokemon {
    public Magnidove() {
        super("Magnidove",
                Type.FLYING, Type.FAIRY,
                new Stats(85,70,70,80,101,103),
                List.of(Ability.BIG_PECKS), Ability.PIXILATE,
                11, 300,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                122, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING),
                List.of("Eledove show off their pretty feathers to attract all kinds of bird pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HURRICANE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 1),
                        new MoveLearnSetEntry(Move.SONIC_BOOM, 9),
                        new MoveLearnSetEntry(Move.GUST, 13),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 17),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 21),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 26),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, 31),
                        new MoveLearnSetEntry(Move.AGILITY, 36),
                        new MoveLearnSetEntry(Move.MOONLIGHT, 42),
                        new MoveLearnSetEntry(Move.ROOST, 48),
                        new MoveLearnSetEntry(Move.TAILWIND, 54),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 60),
                        new MoveLearnSetEntry(Move.MOONBLAST, 66),
                        new MoveLearnSetEntry(Move.HURRICANE, 72),

                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "egg"),
                        new MoveLearnSetEntry(Move.UPROAR, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_FLORAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        setHasGenderDifferences(true);
    }
}
