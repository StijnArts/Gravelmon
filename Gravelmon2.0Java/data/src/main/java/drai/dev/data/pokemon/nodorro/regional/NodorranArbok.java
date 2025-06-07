package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranArbok extends drai.dev.data.pokemon.Pokemon {
    public NodorranArbok(String name, Aspect aspect) {
        super(name, aspect, "Arbok",
                Type.FIRE, Type.POISON,
                new Stats(60,
                        70,
                        69,
                        90,
                        89,
                        70),
                List.of(Ability.INTIMIDATE,Ability.SHED_SKIN), Ability.FLASH_FIRE,
                22, 726,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                157, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Arbok emits a poisonous gas from its glands that cause a searing pain if made contact with."),
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
                        new MoveLearnSetEntry(Move.GLARE,20),
                        new MoveLearnSetEntry(Move.WILLOWISP,23),
                        new MoveLearnSetEntry(Move.POISON_FANG,25),
                        new MoveLearnSetEntry(Move.COIL,27),
                        new MoveLearnSetEntry(Move.SLUDGE,32),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,41),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_CRIMSON)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Arbok");

    }


}
