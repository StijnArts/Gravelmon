package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coralya extends drai.dev.data.pokemon.Pokemon {
    public Coralya() {
        super("Coralya",
                Type.ROCK, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0, 0, 0, 0, 0, 0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Coralya are only said to appear in water that is completely untainted by human kind. Often, reports of Coralya population booms will arise around the same time as Suicune sightings. When it leaves its home, it carries about a gallon of its home water with it, and is known to regularly spend time ridding the water of any impurities it may come into contact with on its travels."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIST, "tm"),
                        new MoveLearnSetEntry(Move.SCREECH, "tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "tm"),
                        new MoveLearnSetEntry(Move.BARRIER, "tm"),
                        new MoveLearnSetEntry(Move.BIDE, "tm"),
                        new MoveLearnSetEntry(Move.AMNESIA, "tm"),
                        new MoveLearnSetEntry(Move.CURSE, "tm"),
                        new MoveLearnSetEntry(Move.INGRAIN, "tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE, "tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR, "tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "tm")),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setLangFileName("Coralya");
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        addAdditionalEvolution("corsola", new EvolutionEntry("coralya", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "25"))));
    }


}
