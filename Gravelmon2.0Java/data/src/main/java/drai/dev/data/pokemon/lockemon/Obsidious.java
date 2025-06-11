package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Obsidious extends Pokemon {
    public Obsidious() {
        super("Obsidious",
                Type.ROCK, Type.DARK,
                new Stats(70, 105, 75, 90, 80, 60),
                List.of(Ability.STURDY, Ability.MALICE), Ability.ROUGH_SKIN,
                12, 3180,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,15),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,18),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,24),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,33),
                        new MoveLearnSetEntry(Move.STONE_EDGE,37),
                        new MoveLearnSetEntry(Move.THRASH,42),
                        new MoveLearnSetEntry(Move.SANDSTORM,47),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,52),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,59),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 39, 9, List.of(
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA, SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL),
                List.of());
    }
}
