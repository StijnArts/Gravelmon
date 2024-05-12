package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Conipine extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conipine");

    }


}
