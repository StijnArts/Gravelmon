package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Baburun extends Pokemon {
    public Baburun() {
        super( "Baburun",
                Type.WATER,
                new Stats(40	,
                        35,
                        30	,
                        35,
                        30,
                        40),
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                4, 23,
                new Stats(0,0,0,0,0,1), 225,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It keeps to itself. It uses its HORN to sense and avoid DANGER"),
                List.of(new EvolutionEntry("garakasago", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dusk_stone"),
                        new EvolutionEntry("supaina", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:shiny_stone"),
                        new EvolutionEntry("baretta", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.POUND,6),
                        new MoveLearnSetEntry(Move.MUD_SHOT,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,24),
                        new MoveLearnSetEntry(Move.BODY_SLAM,30),
        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                new MoveLearnSetEntry(Move.THIEF,"tm"),
                new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                new MoveLearnSetEntry(Move.SWIFT,"tm"),
                new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                new MoveLearnSetEntry(Move.ENDURE,"tm"),
                new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                new MoveLearnSetEntry(Move.DIG,"tm"),
                new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                new MoveLearnSetEntry(Move.ENCORE,"tm"),
                new MoveLearnSetEntry(Move.SURF,"tm"),
                new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                new MoveLearnSetEntry(Move.HAZE,"tm"),
                new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.DELUGE,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.DEWDROP,"egg"),
                        new MoveLearnSetEntry(Move.SPLATTER,"egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 19, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
