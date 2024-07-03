package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Wanupp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wanupp() {
        super("Wanupp",
                Type.GRASS, Type.POISON,
                new Stats(75,
                        25,
                        35,
                        150,
                        50,
                        150),
                List.of(Ability.POISON_TOUCH,Ability.CORROSION,Ability.PRANKSTER), Ability.PRANKSTER,
                13, 165,
                new Stats(0,0,0,0,0,1), 180,
                0.5,
                120, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its unassuming appearance masks a very malicious personality. Its cap is covered in spore-filled slime that causes necrosis instantly if touched."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.INGRAIN,8),
                        new MoveLearnSetEntry(Move.ACID,12),
                        new MoveLearnSetEntry(Move.VINE_WHIP,16),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,20),
                        new MoveLearnSetEntry(Move.VENOSHOCK,24),
                        new MoveLearnSetEntry(Move.ENDEAVOR,28),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,30),
                        new MoveLearnSetEntry(Move.SPORE,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,38),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,42),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,46),
                        new MoveLearnSetEntry(Move.FISSURE,52)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 12, 39, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wanupp");

    }


}
