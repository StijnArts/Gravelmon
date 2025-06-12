package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Snogre extends Pokemon {
    public Snogre() {
        super("Snogre",
                Type.ICE,
                new Stats(95, 130, 55, 80, 90, 60),
                List.of(Ability.PERMAFROST, Ability.SHEER_FORCE), Ability.ICE_BODY,
                18, 1480,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                179, ExperienceGroup.MEDIUM_FAST,
                70,
                61, List.of(EggGroup.HUMAN_LIKE),
                List.of("Snogre is incredibly reclusive, living in remote valleys and cliff-sides. Villages pass down stories of them appearing to save travelers lost in blizzards."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FROST_SLASH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.ICE_BALL,13),
                        new MoveLearnSetEntry(Move.TORMENT,17),
                        new MoveLearnSetEntry(Move.ICE_SHARD,21),
                        new MoveLearnSetEntry(Move.COVET,25),
                        new MoveLearnSetEntry(Move.FLING,29),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,33),
                        new MoveLearnSetEntry(Move.SCARY_FACE,38),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,48),
                        new MoveLearnSetEntry(Move.SNATCH,53),
                        new MoveLearnSetEntry(Move.PAYBACK,58),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,63),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,68),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:ice",100, 1,2)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setHasGenderDifferences(true);

    }
}
