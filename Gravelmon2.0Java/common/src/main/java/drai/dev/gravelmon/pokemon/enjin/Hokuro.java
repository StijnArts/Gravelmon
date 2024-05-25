package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hokuro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hokuro() {
        super("Hokuro",
                Type.GROUND,
                new Stats(45,
                        65,
                        55,
                        35,
                        45,
                        55),
                List.of(Ability.SAND_FORCE), Ability.SAND_FORCE,
                3, 100,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Hokuro roam around grasslands and deserts, often roosting in burrows made by other Pokémon. While they are currently flightless, they are excellent runners, hunting their prey on foot."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.DUST_KICK,7),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,12),
                        new MoveLearnSetEntry(Move.PECK,15),
                        new MoveLearnSetEntry(Move.SAND_TOMB,18),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,22),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,25),
                        new MoveLearnSetEntry(Move.DIG,29),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,34),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,51),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hokuro");

    }


}
