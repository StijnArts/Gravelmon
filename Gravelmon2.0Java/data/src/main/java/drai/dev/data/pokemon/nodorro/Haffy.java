package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Haffy extends drai.dev.data.pokemon.Pokemon {
    public Haffy() {
        super("Haffy",
                Type.NORMAL, Type.FLYING,
                new Stats(52,
                        55,
                        53,
                        46,
                        46,
                        44),
                List.of(Ability.KEEN_EYE,Ability.FLUFFY), Ability.DEFIANT,
                5, 160,
                new Stats(1,0,0,0,0,0), 255,
                0.6,
                49, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Haffy spend most of their time of the day up high in the trees where they stay in their nests. They only leave their nest to eat."),
                List.of(new EvolutionEntry("baldawk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.CHIRP,3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,11),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,14),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.ROOST,23),
                        new MoveLearnSetEntry(Move.DEFOG,28),
                        new MoveLearnSetEntry(Move.TAILWIND,35)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_PLAINS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Haffy");

    }


}
