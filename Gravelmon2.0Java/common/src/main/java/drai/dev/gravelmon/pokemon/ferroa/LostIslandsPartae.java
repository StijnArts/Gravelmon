package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class LostIslandsPartae extends drai.dev.gravelmon.pokemon.Pokemon {
    public LostIslandsPartae(int dex) {
        super(dex, "Partae",
                Type.FIRE, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FIERYSPIRIT), Ability.DANCER,
                4, 165,
                new Stats(0,0,0,0,0,1), 225,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("On special occasions, a flame lights on the wick on its head, counting down to something. Once the wick is fully burned away, Partae becomes overcome with vigor and it begins to dance all night long."),
                List.of(new EvolutionEntry("lostislandsloftival", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"210")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHEERFUL_SHOUT,1),
                        new MoveLearnSetEntry(Move.STOKE,1),
                        new MoveLearnSetEntry(Move.WORK_UP,1),
                        new MoveLearnSetEntry(Move.ROUND,1),
                        new MoveLearnSetEntry(Move.FIRE_CRACKER,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,1),
                        new MoveLearnSetEntry(Move.FESTIVE_SHOT,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.RAINBOW_GUST,1),
                        new MoveLearnSetEntry(Move.BURN_UP,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.WARM_EMBRACE,1),
                        new MoveLearnSetEntry(Move.LIGHT_UP,1),


                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setLangFileName("Partae");

    }
}
