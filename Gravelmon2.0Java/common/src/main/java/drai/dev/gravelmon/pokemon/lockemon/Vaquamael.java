package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Vaquamael extends Pokemon {
    public Vaquamael() {
        super("Vaquamael",
                Type.WATER, Type.BUG,
                new Stats(65,
                        90,
                        75,
                        115,
                        75,
                        110),
                List.of(Ability.TORRENT), Ability.BUBBLE_HELM,
                19, 445,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG, EggGroup.WATER_3),
                List.of("Vaquamael are natural leaders and are often seen protecting other Pokémon. When someone is out causing trouble, a Vaquamael will rush to catch them using its powerful water lasso."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.AQUA_RING,16),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.SOAK,28),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,32),
                        new MoveLearnSetEntry(Move.LUNGE,36),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,40),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,44),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,48),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 32, 45, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
