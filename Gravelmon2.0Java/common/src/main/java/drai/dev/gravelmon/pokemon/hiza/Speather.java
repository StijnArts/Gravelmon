package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Speather extends drai.dev.gravelmon.pokemon.Pokemon {
    public Speather() {
        super("Speather",
                Type.FLYING,Type.WATER,
                new Stats(80,
                        90,
                        70,
                        100,
                        70,
                        90),
                List.of(Ability.WATER_VEIL), Ability.GALE_WINGS,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Being able to pierce the water, they can drop down from high altitudes and dive up to 15 meters deep to catch their prey."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.SUPERSONIC,10),
                        new MoveLearnSetEntry(Move.WING_ATTACK,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.AGILITY,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.MIST,35),
                        new MoveLearnSetEntry(Move.ROOST,40),
                        new MoveLearnSetEntry(Move.HURRICANE,45)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SPRING, Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
