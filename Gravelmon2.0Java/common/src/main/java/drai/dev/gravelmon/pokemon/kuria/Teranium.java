package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Teranium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teranium() {
        super("Teranium",
                Type.WATER, Type.STEEL,
                new Stats(91,
                        119,
                        82,
                        88,
                        105,
                        70),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                55, 1421,
                new Stats(0,1,0,0,1,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,17),
                        new MoveLearnSetEntry(Move.MINIMIZE,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,24),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,28),
                        new MoveLearnSetEntry(Move.ENDURE,32),
                        new MoveLearnSetEntry(Move.METAL_BURST,37),
                        new MoveLearnSetEntry(Move.AQUA_RING,41),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,45),
                        new MoveLearnSetEntry(Move.SOAK,50),
                        new MoveLearnSetEntry(Move.ENDEAVOR,55)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 53, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Teranium");

    }


}
