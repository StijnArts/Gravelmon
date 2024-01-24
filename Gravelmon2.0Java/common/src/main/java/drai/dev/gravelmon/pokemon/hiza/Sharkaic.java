package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sharkaic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sharkaic() {
        super("Sharkaic",
                Type.WATER,Type.ROCK,
                new Stats(90,
                        100,
                        50,
                        50,
                        30,
                        40),
                List.of(Ability.DRIZZLE), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,1,0,0,0,0), 70,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Revived from the Teeth Fossil, a Pokemon that is surprisingly large for its age. It can eat over 90 pounds of food in a single day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,15),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,18),
                        new MoveLearnSetEntry(Move.ICE_FANG,21),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,25),
                        new MoveLearnSetEntry(Move.AQUA_JET,28),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,31),
                        new MoveLearnSetEntry(Move.CURSE,35),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,57)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sharkaic");

    }


}
