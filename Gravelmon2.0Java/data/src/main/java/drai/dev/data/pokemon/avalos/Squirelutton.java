package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squirelutton extends drai.dev.data.pokemon.Pokemon {
    public Squirelutton() {
        super("Squirelutton",
                Type.NORMAL,
                new Stats(60,
                        55,
                        60,
                        20,
                        30,
                        50),
                List.of(Ability.PICKUP,Ability.CHEEK_POUCH), Ability.RUN_AWAY,
                5, 291,
                new Stats(1,0,0,0,0,0), 255,
                1.0,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Squireluttons are nutorious for stealing lots of food right before hibernating season. They keep it all in hollowed out trees, and gorge on the food until spring."),
                List.of(new EvolutionEntry("muncheek", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,1),
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.SPIT_UP,15),
                        new MoveLearnSetEntry(Move.SWALLOW,15),
                        new MoveLearnSetEntry(Move.STOCKPILE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.REST,27),
                        new MoveLearnSetEntry(Move.HYPER_FANG,31),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,36),
                        new MoveLearnSetEntry(Move.SLACK_OFF,41),
                        new MoveLearnSetEntry(Move.BODY_PRESS,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,60),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Squirelutton");

    }


}
