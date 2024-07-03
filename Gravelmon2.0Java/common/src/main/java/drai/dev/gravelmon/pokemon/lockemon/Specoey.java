package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Specoey extends Pokemon {
    public Specoey() {
        super("Specoey",
                Type.NORMAL, Type.GHOST,
                new Stats(35,
                        55,
                        40,
                        60,
                        40,
                        70),
                List.of(Ability.TRACE, Ability.TO_BE), Ability.NOT_TO_BE,
                4, 52,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Specoey are trained in acting from a young age. Due to this lifelong ability, they often " +
                        "partake in stage plays alongside young children. In some cases, the audience is unable to tell the difference."),
                List.of(new EvolutionEntry("opakespiel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.ROLE_PLAY.getName()+"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TORMENT,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,20),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,24),
                        new MoveLearnSetEntry(Move.TAUNT,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,40),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,44),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,48),
                        new MoveLearnSetEntry(Move.COMEUPPANCE,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
