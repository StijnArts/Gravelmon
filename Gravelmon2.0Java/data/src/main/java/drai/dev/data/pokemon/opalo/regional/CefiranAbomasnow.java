package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranAbomasnow extends Pokemon {
    public CefiranAbomasnow(String name, Aspect aspect) {
        super(name, aspect,"CefiranAbomasnow",
                Type.GRASS, Type.WATER,
                new Stats(85,82,70,60,82,80),
                List.of(Ability.POISON_HEAL), Ability.SOUNDPROOF,
                22, 1355,
                new Stats(0,1,0,0,1,0), 60,
                0.5,
                173, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_PUNCH, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 5),
                        new MoveLearnSetEntry(Move.WATER_GUN, 9),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, 13),
                        new MoveLearnSetEntry(Move.SWAGGER, 17),
                        new MoveLearnSetEntry(Move.MIST, 21),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 26),
                        new MoveLearnSetEntry(Move.INGRAIN, 31),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER, 36),
                        new MoveLearnSetEntry(Move.BRINE, 47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 58),
                        new MoveLearnSetEntry(Move.AVALANCHE, "egg"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.GROWTH, "egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.STOMP, "egg")
                ),
                List.of(Label.GEN4,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 65, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Abomasnow");
    }
}
