package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mambaboo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mambaboo() {
        super("Mambaboo",
                Type.GHOST,Type.POISON,
                new Stats(81,
                        65,
                        67,
                        74,
                        108,
                        92),
                List.of(Ability.PRANKSTER), Ability.POWER_OF_ALCHEMY,
                8, 165,
                new Stats(0,0,0,0,1,1), 60,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Mambaboo channel their Ghost powers through the gem in their rod. Different variations of Mambaboo have been found with different coloured Gems. Their power is so great that they have been known to temporarily revive dead brethen to aid them in battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mambaboo");

    }


}
