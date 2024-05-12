package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Seroseed extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seroseed() {
        super("Seroseed",
                Type.GRASS,
                new Stats(60,
                        80,
                        80,
                        35,
                        40,
                        50),
                List.of(Ability.FIREPROOF), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                69, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Leech Seed Grass - Grass Whistle Grass - Wood HammerSTAB Grass - Harden Normal - Retaliate Normal - Stun Spore Grass - Sleep Powder Grass - Horn LeechSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_LEECH,1)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Seroseed");

    }


}
