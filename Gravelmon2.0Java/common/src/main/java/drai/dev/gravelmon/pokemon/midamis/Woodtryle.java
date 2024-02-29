package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Woodtryle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Woodtryle() {
        super("Woodtryle",
                Type.STEEL,Type.FLYING,
                new Stats(75,
                        110,
                        105,
                        55,
                        75,
                        75),
                List.of(Ability.EARLY_BIRD), Ability.UNNERVE,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                 new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.METAL_CLAW,12),
                        new MoveLearnSetEntry(Move.AGILITY,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.STEEL_WING,28),
                        new MoveLearnSetEntry(Move.PAYBACK,32),
                        new MoveLearnSetEntry(Move.DRILL_PECK,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.SPIKES,44),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,48),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,52)       ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 29, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
