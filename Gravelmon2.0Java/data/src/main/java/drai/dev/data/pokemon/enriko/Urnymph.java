package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Urnymph extends drai.dev.data.pokemon.Pokemon {
    public Urnymph() {
        super("Urnymph",
                Type.BUG, Type.ROCK,
                new Stats(30,
                        50,
                        80,
                        40,
                        80,
                        40),
                List.of(Ability.WEAK_ARMOR,Ability.HUSTLE,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They eat rotting flesh from catacombs and burial grounds. Their favorite food is cremated ash - they'll raid an urn and then wear it to protect its squishy body."),
                List.of(new EvolutionEntry("monymph", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.ACCELEROCK,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,9),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,16),
                        new MoveLearnSetEntry(Move.SANDSTORM,20),
                        new MoveLearnSetEntry(Move.SILVER_WIND,24),
                        new MoveLearnSetEntry(Move.AMNESIA,28),
                        new MoveLearnSetEntry(Move.TOMBSTONER,32),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,36),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,40),
                        new MoveLearnSetEntry(Move.MEGAHORN,43),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_SPOOKY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Urnymph");

    }


}
