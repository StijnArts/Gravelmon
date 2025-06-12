package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kujee extends drai.dev.data.pokemon.Pokemon {
    public Kujee() {
        super("Kujee",
                Type.ROCK, Type.FIGHTING,
                new Stats(80,
                        85,
                        60,
                        20,
                        30,
                        55),
                List.of(Ability.STURDY), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("buarajee", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.HEADBUTT,24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,30),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,36),
                        new MoveLearnSetEntry(Move.SANDSTORM,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,48),
                        new MoveLearnSetEntry(Move.EXPLOSION,54)                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Kujee");

    }


}
