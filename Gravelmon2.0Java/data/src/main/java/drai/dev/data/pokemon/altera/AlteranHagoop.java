package drai.dev.data.pokemon.altera;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AlteranHagoop extends drai.dev.data.pokemon.Pokemon {
    public AlteranHagoop(String name, Aspect aspect) {
        super(name, aspect,"Hagoop",
                Type.POISON,Type.FIRE,
                new Stats(60,
                        45,
                        45,
                        85,
                        105,
                        50),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD), Ability.FLAME_BODY,
                8, 473,
                new Stats(0,0,0,0,1,0), 190,
                0.125,
                78, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of("Its soft, fleshy body is coated in highly corrosive, high-temperature slime that ignites on contact with the air. It thrives in volcanic areas."),
                List.of(new EvolutionEntry("haagmaa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.SMOG,7),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,10),
                        new MoveLearnSetEntry(Move.RECOVER,14),
                        new MoveLearnSetEntry(Move.BODY_SLAM,18),
                        new MoveLearnSetEntry(Move.INCINERATE,22),
                        new MoveLearnSetEntry(Move.TOXIC,26),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,35),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,40),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,50),
                        new MoveLearnSetEntry(Move.ERUPTION,55),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hagoop");

    }


}
