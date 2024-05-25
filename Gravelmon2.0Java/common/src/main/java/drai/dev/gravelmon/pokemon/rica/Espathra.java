package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Espathra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Espathra() {
        super("Espathra",
                Type.PSYCHIC,
                new Stats(95,
                        60,
                        60,
                        101,
                        60,
                        105),
                List.of(Ability.OPPORTUNIST,Ability.FRISK,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                169, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It immobilizes opponents by bathing them in psychic power from its large eyes. Despite its appearance, it has a vicious temperament."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,8),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,19),
                        new MoveLearnSetEntry(Move.PLUCK,24),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.UPROAR,34),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,43),
                        new MoveLearnSetEntry(Move.PSYCHIC,49),
                        new MoveLearnSetEntry(Move.LAST_RESORT,54),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Espathra");

    }


}
