package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tasticky extends drai.dev.data.pokemon.Pokemon {
    public Tasticky() {
        super("Tasticky",
                Type.NORMAL,
                new Stats(60,
                        40,
                        60,
                        40,
                        60,
                        25),
                List.of(Ability.OWN_TEMPO,Ability.OBLIVIOUS,Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(1,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("lickitung", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"180")))),
                List.of(new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SUPERSONIC,12),
                        new MoveLearnSetEntry(Move.WRAP,18),
                        new MoveLearnSetEntry(Move.DISABLE,24),
                        new MoveLearnSetEntry(Move.STOMP,30),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,36),
                        new MoveLearnSetEntry(Move.SCREECH,42),
                        new MoveLearnSetEntry(Move.SLAM,48),
                        new MoveLearnSetEntry(Move.POWER_WHIP,54),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,60)),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tasticky");

    }


}
