package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cycrush extends drai.dev.data.pokemon.Pokemon {
    public Cycrush() {
        super("Cycrush",
                Type.ROCK, Type.FIGHTING,
                new Stats(68,
                        85,
                        120,
                        30,
                        70,
                        32),
                List.of(Ability.SAND_FORCE,Ability.SOLID_ROCK,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                13, 165,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Cycrush is known for lifting boulders out of roads to help out travelers. As its muscles get bigger its stone armor will crack."),
                List.of(new EvolutionEntry("gargulchan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
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
                        new MoveLearnSetEntry(Move.EXPLOSION,54)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cycrush");

    }


}
