package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Batterode extends drai.dev.gravelmon.pokemon.Pokemon {
    public Batterode() {
        super("Batterode",
                Type.ELECTRIC,Type.POISON,
                new Stats(80,
                        110,
                        50,
                        120,
                        60,
                        60),
                List.of(Ability.POISON_TOUCH,Ability.CORROSION,Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(0,0,0,0,0,0), 95,
                0.5,
                185, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has grown too big for its shell, breaking it apart. The flaky substance making up its body is corrosive enough to burn through lead."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.ACID,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.ROAR,13),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,16),
                        new MoveLearnSetEntry(Move.SLUDGE,20),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,24),
                        new MoveLearnSetEntry(Move.CHARGE,27),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,32),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Batterode");

    }


}
