package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Budgeaf extends drai.dev.data.pokemon.Pokemon {
    public Budgeaf() {
        super("Budgeaf",
                Type.GRASS, Type.FLYING,
                new Stats(52,
                        55,
                        40,
                        45,
                        60,
                        68),
                List.of(Ability.OVERGROW), Ability.EARLY_BIRD,
                2, 12,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("One of the starter Pokemon from Orbis, Budgeaf are excellent Pokemon for first time trainers due to their overly friendly and protective personalities. Its leaf-like tail gives off a sweet aroma that people try to replicate in dishes. Budgeaf are very nimble, despite their small size they are more than capable of flying through strong winds with ease."),
                List.of(new EvolutionEntry("gryphoyal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SEED_BOMB,1),
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,1),
                        new MoveLearnSetEntry(Move.PECK,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Budgeaf");

    }


}
