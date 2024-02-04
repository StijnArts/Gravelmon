package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Psyder extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyder() {
        super("Psyder",
                Type.PSYCHIC,Type.BUG,
                new Stats(50,
                        60,
                        45,
                        50,
                        55,
                        50),
                List.of(Ability.KEEN_EYE), Ability.ANALYTIC,
                3, 165,
                new Stats(0,1,0,0,0,0), 160,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It spins its web in a spiral pattern, then twirls it around in a disorienting fashion. It is usually most active under the light of the full moon."),
                List.of(new EvolutionEntry("lunarach", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ACUPRESSURE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,9),
                        new MoveLearnSetEntry(Move.PSYWAVE,12),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,15),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,17),
                        new MoveLearnSetEntry(Move.RESONATE,22),
                        new MoveLearnSetEntry(Move.WEBSLAM,25),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,28),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,32),
                        new MoveLearnSetEntry(Move.MOONLIGHT,35),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,38),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,42),
                        new MoveLearnSetEntry(Move.MOONBLAST,45),
                        new MoveLearnSetEntry(Move.STICKY_WEB,48),
                        new MoveLearnSetEntry(Move.HEALING_WISH,52),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Psyder");

    }


}
