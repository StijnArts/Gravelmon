package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Finjoy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Finjoy() {
        super("Finjoy",
                Type.WATER,
                new Stats(45,
                        45,
                        35,
                        70,
                        54,
                        61),
                List.of(Ability.TORRENT), Ability.MAGICIAN,
                4, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("They like to go where people are, and are often found on busy beaches. To entertain, they love doing tricks with beachballs and creating bubble shows."),
                List.of(new EvolutionEntry("finlock", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.SUPERSONIC,9),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,12),
                        new MoveLearnSetEntry(Move.ENCORE,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.AQUA_JET,22),
                        new MoveLearnSetEntry(Move.TRICK,27),
                        new MoveLearnSetEntry(Move.BRINE,31),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,34),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,38),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,41),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,46),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,50),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,59),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSIBULLET,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Finjoy");
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
