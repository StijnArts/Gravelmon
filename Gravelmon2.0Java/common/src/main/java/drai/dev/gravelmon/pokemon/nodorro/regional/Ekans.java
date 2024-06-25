package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ekans extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ekans(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Ekans",
                Type.FIRE, Type.POISON,
                new Stats(35,
                        45,
                        40,
                        60,
                        58,
                        50),
                List.of(Ability.INTIMIDATE,Ability.SHED_SKIN), Ability.FLASH_FIRE,
                20, 70,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Ekans are short tempered and can quickly lash out to unsuspecting foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.EMBER,9),
                        new MoveLearnSetEntry(Move.ACID,11),
                        new MoveLearnSetEntry(Move.FIRE_FANG,13),
                        new MoveLearnSetEntry(Move.POISON_GAS,15),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.GLARE,21),
                        new MoveLearnSetEntry(Move.WILLOWISP,26),
                        new MoveLearnSetEntry(Move.COIL,29),
                        new MoveLearnSetEntry(Move.SLUDGE,33),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,37),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ekans");

    }


}
