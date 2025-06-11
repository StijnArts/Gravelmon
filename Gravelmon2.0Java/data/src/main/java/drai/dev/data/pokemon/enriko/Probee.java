package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Probee extends drai.dev.data.pokemon.Pokemon {
    public Probee() {
        super("Probee",
                Type.PSYCHIC, Type.BUG,
                new Stats(56,
                        33,
                        37,
                        49,
                        64,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Each individual Probee is nearly identical. They have weak telepathic abilities, mostly used to communicate with eachother."),
                List.of(new EvolutionEntry("dysolony", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.REFLECT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,8),
                        new MoveLearnSetEntry(Move.AGILITY,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,24),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,28),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,44),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,48)
                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Probee");

    }


}
