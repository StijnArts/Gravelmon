package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Euthiscus extends drai.dev.data.pokemon.Pokemon {
    public Euthiscus() {
        super("Euthiscus",
                Type.GRASS,
                new Stats(50,
                        45,
                        50,
                        30,
                        70,
                        50),
                List.of(Ability.PICKUP,Ability.LEAF_GUARD), Ability.KLUTZ,
                3, 24,
                new Stats(0,0,0,0,1,0), 255,
                0.0,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Euthiscus are very sensitive Pokémon, so they tend to avoid interacting with others. If they find a berry they really like, they'll cling to it like it is the only thing they care about."),
                List.of(new EvolutionEntry("hibidali", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,3),
                        new MoveLearnSetEntry(Move.LEAFAGE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,48)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Euthiscus");

    }


}
