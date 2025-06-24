package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rosepillar extends drai.dev.data.pokemon.Pokemon {
    public Rosepillar() {
        super("Rosepillar",
                Type.BUG,
                new Stats(40,
                        30,
                        20,
                        40,
                        20,
                        50),
                List.of(Ability.SHIELD_DUST,Ability.RUN_AWAY), Ability.COMPOUND_EYES,
                3, 0,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Rosepillars are found in the undergrowth of forests and utilise their red feelers to detect danger. When opponents are detected, they retract, making Rosepillar a smaller prey for predators."),
                List.of(new EvolutionEntry("pupenta", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"7")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.CONFUSION,11),
                        new MoveLearnSetEntry(Move.POISON_POWDER,13),
                        new MoveLearnSetEntry(Move.STUN_SPORE,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.POISON_FANG,21),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,23),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,35),
                        new MoveLearnSetEntry(Move.PSYCHIC,45)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
           setLangFileName("Rosepillar");

    }


}
