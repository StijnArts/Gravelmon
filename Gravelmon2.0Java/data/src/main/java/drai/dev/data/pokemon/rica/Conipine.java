package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Conipine extends drai.dev.data.pokemon.Pokemon {
    public Conipine() {
        super("Conipine",
                Type.GRASS,
                new Stats(80,
                        120,
                        120,
                        70,
                        70,
                        70),
                List.of(Ability.FIREPROOF), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Endure Normal - Horn LeechSTAB Grass - Wood HammerSTAB Grass - Stun Spore Grass - Harden Normal - Horn Attack Normal - Horn Drill Normal - Megahorn Bug - Grassy Terrain Grass - Growth Normal - Endeavor Normal - Protect Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1)                        ),
                List.of(Label.RICA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Conipine");

    }


}
