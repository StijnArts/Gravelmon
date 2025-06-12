package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cocoward extends drai.dev.data.pokemon.Pokemon {
    public Cocoward() {
        super("Cocoward",
                Type.GRASS,
                new Stats(60,
                        75,
                        50,
                        20,
                        50,
                        75),
                List.of(Ability.RATTLED), Ability.CHLOROPHYLL,
                9, 163,
                new Stats(0,1,0,0,0,0), 160,
                0.5,
                116, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("Cocoward spend their days resting under palm trees. They're not very good fighters, so they often just run for the hills when they sense danger."),
                List.of(new EvolutionEntry("cocombat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,3),
                        new MoveLearnSetEntry(Move.GROWTH,6),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.KNOCKBACK,11),
                        new MoveLearnSetEntry(Move.DETECT,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,19),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,20),
                        new MoveLearnSetEntry(Move.FACEPLANT,21),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,22),
                        new MoveLearnSetEntry(Move.SEED_BOMB,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,27),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,30),
                        new MoveLearnSetEntry(Move.TROP_KICK,31),
                        new MoveLearnSetEntry(Move.SOLIDKICK,32),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,33),
                        new MoveLearnSetEntry(Move.SUBMISSION,36),
                        new MoveLearnSetEntry(Move.JUMP_KICK,37),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,40),
                        new MoveLearnSetEntry(Move.REVERSAL,42),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,43),
                        new MoveLearnSetEntry(Move.COUNTER,44),
                        new MoveLearnSetEntry(Move.WARDANCE,46),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,48),
                        new MoveLearnSetEntry(Move.SUPERPOWER,51),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,52),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,54),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,60),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,63),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,66),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm")
                ),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL_ISLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cocoward");

    }


}
