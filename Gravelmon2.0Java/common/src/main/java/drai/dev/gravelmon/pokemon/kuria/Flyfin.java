package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Flyfin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flyfin() {
        super("Flyfin",
                Type.WATER, Type.STEEL,
                new Stats(53,
                        82,
                        52,
                        68,
                        60,
                        65),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                13, 391,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                103, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("teranium", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Flyfin");

    }


}
