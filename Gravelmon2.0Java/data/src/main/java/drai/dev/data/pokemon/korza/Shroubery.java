package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shroubery extends drai.dev.data.pokemon.Pokemon {
    public Shroubery() {
        super("Shroubery",
                Type.GRASS,
                new Stats(148,
                        52,
                        78,
                        103,
                        113,
                        41),
                List.of(Ability.OVERGROW), Ability.NATURAL_CURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                241, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As gentle giants, they allow Naty, Hoole, and other mons to gather around it for protection. Sometimes, groups in the wild will elect an individual to evolve as a safe space for the rest."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.WHIRLWIND,8),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,13),
                        new MoveLearnSetEntry(Move.GROWTH,18),
                        new MoveLearnSetEntry(Move.ASSURANCE,22),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,30),
                        new MoveLearnSetEntry(Move.INGRAIN,33),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.SYNTHESIS,38),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,43),
                        new MoveLearnSetEntry(Move.LEAF_STORM,43),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,54),
                        new MoveLearnSetEntry(Move.SPORE,59)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shroubery");

    }


}
