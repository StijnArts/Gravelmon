package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class CefiranSnover extends Pokemon {
    public CefiranSnover(int dexNo) {
        super(dexNo,"CefiranSnover",
                Type.GRASS, Type.WATER,
                new Stats(60,62,50,40,62,60),
                List.of(Ability.POISON_HEAL), Ability.SOUNDPROOF,
                10, 505,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("Cefiranabomasnow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 5),
                        new MoveLearnSetEntry(Move.WATER_GUN, 9),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, 13),
                        new MoveLearnSetEntry(Move.SWAGGER, 17),
                        new MoveLearnSetEntry(Move.MIST, 21),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 26),
                        new MoveLearnSetEntry(Move.INGRAIN, 31),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER, 36),
                        new MoveLearnSetEntry(Move.BRINE, 41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 46),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 10, 39, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Snover");
        this.setPortraitXYZ(0,1.8,0);
    }
}
