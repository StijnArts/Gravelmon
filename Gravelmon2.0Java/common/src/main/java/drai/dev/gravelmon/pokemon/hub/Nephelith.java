package drai.dev.gravelmon.pokemon.hub;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nephelith extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nephelith() {
        super("Nephelith",
                Type.WATER,Type.FLYING,
                new Stats(130,
                        121,
                        70,
                        179,
                        70,
                        110),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                8, 165,
                new Stats(0,0,0,0,3,0), 3,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Nephelith has the ability to create and manipulate clouds into a form of matter strong enough to walk and even build upon. It's believed that the sky region of Cloudia was built on clouds created by Nephelith, along with potentially others."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.MIST,8),
                        new MoveLearnSetEntry(Move.WING_ATTACK,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,29),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,37),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,43),
                        new MoveLearnSetEntry(Move.ICY_WIND,50),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,57),
                        new MoveLearnSetEntry(Move.REFLECT,65),
                        new MoveLearnSetEntry(Move.THUNDER,79),
                        new MoveLearnSetEntry(Move.ROOST,85),
                        new MoveLearnSetEntry(Move.HURRICANE,92),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,99)                        ),
                List.of(Label.HUB),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nephelith");

    }


}
