package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pampurr extends drai.dev.data.pokemon.Pokemon {
    public Pampurr() {
        super("Pampurr",
                Type.PSYCHIC, Type.NORMAL,
                new Stats(45,
                        35,
                        40,
                        60,
                        75,
                        70),
                List.of(Ability.FLUFFY,Ability.KLUTZ), Ability.FUR_COAT,
                4, 0,
                new Stats(0,0,0,0,1,0), 100,
                0.33,
                150, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pampurr have great pride in their white fluffy coats, they keep it immaculate at all costs. They require a great deal of care and pampering to keep them healthy. The orb on their necks contain a mystical power that is said to bring immense luck to those who polish it."),
                List.of(new EvolutionEntry("freyurr", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"210")))),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.RETURN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Pampurr");

    }


}
