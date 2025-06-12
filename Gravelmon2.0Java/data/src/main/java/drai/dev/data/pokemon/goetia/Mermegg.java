package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mermegg extends drai.dev.data.pokemon.Pokemon {
    public Mermegg() {
        super("Mermegg",
                Type.WATER, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WONDER_SKIN,Ability.HYDRATION), Ability.SHELL_ARMOR,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In the summer, many will gather on the beach to create rainbows with the lustrous nacre of their shells. If you witness this, you are sure to have good luck."),
                List.of(new EvolutionEntry("wermaid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.CUTE_SHOT, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 15),
                        new MoveLearnSetEntry(Move.AQUA_JET, 18),
                        new MoveLearnSetEntry(Move.SCREECH, 20),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 21),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 24),
                        new MoveLearnSetEntry(Move.SONAR_PULSE, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29)
                ),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
           setLangFileName("Mermegg");

    }


}
