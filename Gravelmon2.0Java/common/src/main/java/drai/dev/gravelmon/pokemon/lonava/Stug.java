package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stug() {
        super("Stug",
                Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                1, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.BUG),
                List.of("Stug are the ultimate pest, with their metal bodies withstanding even the most concentrated insecticide. They have evolved to be able to eat literally anything organic, ranging from vegetables and plants, to other deceased Pokemon. Whilst this sounds bleak, Stug are essential parts of their local ecosystem."),
                List.of(new EvolutionEntry("chainsnail", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,1),
                        new MoveLearnSetEntry(Move.LOCKON,7),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,16),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,21),
                        new MoveLearnSetEntry(Move.SELFREPAIR,26),
                        new MoveLearnSetEntry(Move.RECYCLE,30),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,38),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,42),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,47),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,52),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,58)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Stug");

    }


}
