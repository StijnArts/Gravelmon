package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Proseed extends drai.dev.data.pokemon.Pokemon {
    public Proseed() {
        super("Proseed",
                Type.POISON, Type.PSYCHIC,
                new Stats(35,
                        35,
                        40,
                        35,
                        40,
                        50),
                List.of(Ability.SHIELD_DUST), Ability.LEVITATE,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Proseed are known to let themselves get carried away by light breezes, both out of fear for their lives and trying to find a proper space to grow and develop."),
                List.of(new EvolutionEntry("tulipro", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(            new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,7),
                        new MoveLearnSetEntry(Move.EMBARGO,10),
                        new MoveLearnSetEntry(Move.VENOSHOCK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,18),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,22),
                        new MoveLearnSetEntry(Move.TOXIC,29),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.TORMENT,44),
                        new MoveLearnSetEntry(Move.PSYCHIC,47),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,53),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,55),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,58),
                        new MoveLearnSetEntry(Move.HYPNOSIS,62),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,70)            ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Proseed");

    }


}
