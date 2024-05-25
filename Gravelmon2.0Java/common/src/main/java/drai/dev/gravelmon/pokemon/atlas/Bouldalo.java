package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bouldalo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bouldalo() {
        super("Bouldalo",
                Type.NORMAL, Type.ROCK,
                new Stats(70,
                        135,
                        80,
                        55,
                        65,
                        90),
                List.of(Ability.MOLD_BREAKER,Ability.RECKLESS), Ability.MOUNTAINEER,
                19, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Bouldalo are fierce, loving to climb mountain ranges and facing horrible weather conditions. While they dislike the cold, they brave it for the sake of proving themselves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.STOMP,12),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,16),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,20),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,25),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,29),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,37),
                        new MoveLearnSetEntry(Move.TAUNT,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,51),
                        new MoveLearnSetEntry(Move.SUPERPOWER,56),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,61),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,67),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SOLIDKICK,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 43, 58, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bouldalo");

    }


}
