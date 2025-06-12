package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Picocacto extends drai.dev.data.pokemon.Pokemon {
    public Picocacto() {
        super("Picocacto",
                Type.GRASS, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SNIPER,Ability.SAND_VEIL,Ability.STAKEOUT), Ability.STAKEOUT,
                6, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Groups of wild Picocacto guard and protect their territory from invaders. With its perfect aim and timing, it shoots spikes at any threat it sees."),
                List.of(new EvolutionEntry("desperasca", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"))),
                        new EvolutionEntry("desperogue", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")))),
                List.of(           new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.CURSE,17),
                        new MoveLearnSetEntry(Move.BITE,22),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,33),
                        new MoveLearnSetEntry(Move.SYNTHESIS,39),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,57),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,63)             ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Picocacto");

    }


}
