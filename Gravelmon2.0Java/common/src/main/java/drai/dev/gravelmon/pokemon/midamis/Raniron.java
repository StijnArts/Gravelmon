package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Raniron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raniron() {
        super("Raniron",
                Type.NORMAL,Type.STEEL,
                new Stats(50,
                        55,
                        70,
                        40,
                        40,
                        45),
                List.of(Ability.CUTE_CHARM), Ability.RATTLED,
                8, 165,
                new Stats(0,0,1,0,0,0), 230,
                0.5,
                45, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Cute, dainty Pokemon that are often used by girls because of its pretty and sweet appearence. But don't judge Raniron on its appearance as they put up a fight and can hold their own, even for such small Pokemon. Raniron, despite being the offspring of Steelke are also looked after by Stantler who accompany the group."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.REFLECT,5),
                        new MoveLearnSetEntry(Move.IRON_TAIL,8),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.FORESIGHT,19),
                        new MoveLearnSetEntry(Move.HYPNOSIS,22),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,26),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,29),
                        new MoveLearnSetEntry(Move.METAL_SOUND,33),
                        new MoveLearnSetEntry(Move.IRON_HEAD,36),
                        new MoveLearnSetEntry(Move.METAL_BURST,40),
                        new MoveLearnSetEntry(Move.STOMP,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raniron");

    }


}