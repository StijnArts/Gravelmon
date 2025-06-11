package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hogspur extends drai.dev.data.pokemon.Pokemon {
    public Hogspur() {
        super("Hogspur",
                Type.GROUND,
                new Stats(50,
                        50,
                        45,
                        20,
                        25,
                        55),
                List.of(Ability.SAND_VEIL,Ability.PICKUP,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                5, 165,
                new Stats(0,0,1,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The fur on its back condenses into thick spikes that it uses for protection. When in danger, it curls up to become a spiked ball and rolls into the attacker."),
                List.of(new EvolutionEntry("knucquill", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.ROCK_THROW,13),
                        new MoveLearnSetEntry(Move.ASSIST,16),
                        new MoveLearnSetEntry(Move.DIG,21),
                        new MoveLearnSetEntry(Move.HELPING_HAND,25)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND, Biome.IS_JUNGLE)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hogspur");

    }


}
