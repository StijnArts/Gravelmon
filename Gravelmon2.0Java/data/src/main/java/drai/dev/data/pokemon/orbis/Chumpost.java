package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chumpost extends drai.dev.data.pokemon.Pokemon {
    public Chumpost() {
        super("Chumpost",
                Type.GROUND,
                new Stats(50,
                        65,
                        40,
                        85,
                        60,
                        35),
                List.of(Ability.SAP_SIPPER), Ability.DAMP,
                5, 130,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Chumpost are extremely friendly, they collect green waste like fruit peels and leaves to add to their bodies. Many people in the city keep Chumpost to be more eco-friendly. Despite carrying around decaying waste, they smell closer to grass cuttings than waste."),
                List.of(new EvolutionEntry("chumpost", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.SLUDGE,8),
                        new MoveLearnSetEntry(Move.ABSORB,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,13),
                        new MoveLearnSetEntry(Move.MINIMIZE,17),
                        new MoveLearnSetEntry(Move.MUD_BOMB,21),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,40),
                        new MoveLearnSetEntry(Move.BELCH,46),
                        new MoveLearnSetEntry(Move.MEMENTO,48)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_CROPS).build(),
                List.of());
           setLangFileName("Chumpost");

    }


}
