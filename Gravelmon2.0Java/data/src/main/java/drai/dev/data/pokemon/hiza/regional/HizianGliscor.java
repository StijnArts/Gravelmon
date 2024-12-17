package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianGliscor extends drai.dev.data.pokemon.Pokemon {
    public HizianGliscor(String name, Aspect aspect) {
        super(name, aspect, "Gliscor",
                Type.ICE, Type.FLYING,
                new Stats(75,
                        95,
                        125,
                        45,
                        75,
                        95),
                List.of(Ability.ICE_SCALES), Ability.ICE_SCALES,
                20, 165,
                new Stats(0,0,2,0,0,0), 30,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It freezes its food with its icy breath inside cave walls, so other Pokemon are unable to take it. When hungry it uses its sharp claws and fangs to easily break through those fronzen walls."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FROST_BREATH,30),
                        new MoveLearnSetEntry(Move.BITE,35),
                        new MoveLearnSetEntry(Move.ICE_FANG,40),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,47),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,54),
                        new MoveLearnSetEntry(Move.CRUNCH,61),
                        new MoveLearnSetEntry(Move.BLIZZARD,68)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 51, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_PEAK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gliscor");

    }


}
