package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Pipsicle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pipsicle() {
        super("Pipsicle",
                Type.ICE,
                new Stats(70,
                        20,
                        90,
                        70,
                        120,
                        90),
                List.of(Ability.REFRIGERATE,Ability.SNOWPLOW,Ability.PERMAFROST), Ability.PERMAFROST,
                6, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their bodies are made up of a similar substance to Never-Melt Ice. They can withstand harsh temperatures. Their cold bodies help cool the air around themselves, and for that, they are commonly used indoors for those who don't have air conditioning. However, people are warned not to be exposed to them for long periods of time due to fears of getting frostbite."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.AVALANCHE,16),
                        new MoveLearnSetEntry(Move.HAIL,20),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,24),
                        new MoveLearnSetEntry(Move.UPROAR,28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,38),
                        new MoveLearnSetEntry(Move.ICE_BEAM,44),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60)              ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 31, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pipsicle");

    }


}
