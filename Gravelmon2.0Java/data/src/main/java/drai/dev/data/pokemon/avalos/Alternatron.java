package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Alternatron extends drai.dev.data.pokemon.Pokemon {
    public Alternatron() {
        super("Alternatron",
                Type.STEEL,
                new Stats(90,
                        90,
                        90,
                        90,
                        90,
                        40),
                List.of(Ability.CALCULATE,Ability.DOWNLOAD), Ability.ANALYTIC,
                14, 2041,
                new Stats(1,0,0,0,0,0), 80,
                0.0,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.BOLTIN,7),
                        new MoveLearnSetEntry(Move.CONVERSION,11),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,14),
                        new MoveLearnSetEntry(Move.LOCKON,18),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,21),
                        new MoveLearnSetEntry(Move.CONVERSION_2,25),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,29),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,33),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,36),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,41),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,47),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,52),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,57)
                ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 44, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alternatron");
    }


}
