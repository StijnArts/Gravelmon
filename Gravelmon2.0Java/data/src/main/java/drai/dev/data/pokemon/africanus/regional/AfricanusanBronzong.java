package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanBronzong extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanBronzong(String name, Aspect aspect) {
        super(name, aspect, "Bronzong",
                Type.STEEL,Type.FIRE,
                new Stats(91,
                        89,
                        116,
                        54,
                        89,
                        116),
                List.of(Ability.LEVITATE,Ability.HEATPROOF), null,
                13, 1870,
                new Stats(0,0,1,0,0,1), 90,
                -1.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Se produjo un gran revuelo cuando encontraron uno en una obra después de 2000 años durmiendo."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,19),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,29),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,33),
                        new MoveLearnSetEntry(Move.INCINERATE,5),
                        new MoveLearnSetEntry(Move.METAL_SOUND,31),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,9),
                        new MoveLearnSetEntry(Move.INFERNO,55),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,46),
                        new MoveLearnSetEntry(Move.FIRE_LASH,39),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.SCALD,2),
                        new MoveLearnSetEntry(Move.FIRE_FANG,11),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,45)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 54, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bronzong");

    }


}
