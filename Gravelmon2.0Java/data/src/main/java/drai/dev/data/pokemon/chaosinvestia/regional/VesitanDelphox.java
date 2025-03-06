package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanDelphox extends drai.dev.data.pokemon.Pokemon {
    public VesitanDelphox(String name, Aspect aspect) {
        super(name, aspect, "VesitanDelphox",
                Type.GRASS,Type.GHOST,
                new Stats(75,
                        114,
                        100,
                        104,
                        69,
                        78),
                List.of(Ability.OVERGROW,Ability.CONTRARY), null,
                15, 390,
                new Stats(0,0,0,0,3,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Stolz präsentiert dieses Pokémon die Knochen seiner Gegner, die es als Schweif hinterher zieht."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,18),
                        new MoveLearnSetEntry(Move.LEECH_SEED,22),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,69),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,27),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SPITE,30),
                        new MoveLearnSetEntry(Move.HORN_LEECH,36),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,58),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.WILLOWISP,47),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,75),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,14),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,52),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,57),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.HOWL,11),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,34),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,61),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Delphox");

    }


}
