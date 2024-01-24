package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Reavler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reavler() {
        super("Reavler",
                Type.DARK,Type.FLYING,
                new Stats(65,
                        95,
                        55,
                        95,
                        85,
                        115),
                List.of(Ability.JUMPIN,Ability.KEEN_EYE,Ability.PICKPOCKET), Ability.PICKPOCKET,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Reavler travels with the Northern Wind yet it can't stand the cold. Its scythe like limbs can cut through diamonds, even from a distance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_WIND,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reavler");

    }


}
