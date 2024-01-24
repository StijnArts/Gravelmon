package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Karakoron extends Pokemon {
    public Karakoron() {
        super( "Karakoron",
                Type.PSYCHIC,
                new Stats(80	,55	,90	,125	,100,	85),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                10, 160,
                new Stats(0,0,0,2,1,0), 45,
                0.5,
                197, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHIC,1),
                        new MoveLearnSetEntry(Move.HYPER_JINGLE,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.YAWN,13),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,22),
                        new MoveLearnSetEntry(Move.HEAL_BELL,27),
                        new MoveLearnSetEntry(Move.UPROAR,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,42),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,47),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,52),
                        new MoveLearnSetEntry(Move.WISH,57),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.SING,"tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tutor"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"tutor"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 62, 0.06, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL, Biome.IS_MOUNTAIN, Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
    }
}
