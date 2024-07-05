package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gueel extends drai.dev.data.pokemon.Pokemon {
    public Gueel() {
        super("Gueel",
                Type.STEEL, Type.LIGHT,
                new Stats(55,
                        91,
                        115,
                        134,
                        115,
                        50),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                4, 47,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                149, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.CHARM,1),
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
                        new MoveLearnSetEntry(Move.ZAP_CANNON,57)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 44, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Gueel");

    }


}
