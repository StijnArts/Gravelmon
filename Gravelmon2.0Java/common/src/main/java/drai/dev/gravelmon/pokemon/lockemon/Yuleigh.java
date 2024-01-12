package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Yuleigh extends Pokemon {
    public Yuleigh() {
        super("Yuleigh",
                Type.ICE, Type.FAIRY,
                new Stats(70,
                        90,
                        80,
                        40,
                        90,
                        155),
                List.of(Ability.PIXILATE, Ability.SLUSH_RUSH), Ability.SPEED_BOOST,
                11, 199,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                177, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.ENDURE,3),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,6),
                        new MoveLearnSetEntry(Move.ICY_WIND,9),
                        new MoveLearnSetEntry(Move.PLAY_NICE,12),
                        new MoveLearnSetEntry(Move.BRINE,15),
                        new MoveLearnSetEntry(Move.FROST_BREATH,18),
                        new MoveLearnSetEntry(Move.SLASH,21),
                        new MoveLearnSetEntry(Move.FLAIL,24),
                        new MoveLearnSetEntry(Move.CHARM,27),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,30),
                        new MoveLearnSetEntry(Move.THRASH,33),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,39),
                        new MoveLearnSetEntry(Move.SHEER_COLD,42),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 44, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
