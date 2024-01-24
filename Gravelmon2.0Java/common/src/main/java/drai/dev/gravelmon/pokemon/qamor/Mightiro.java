package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mightiro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mightiro() {
        super("Mightiro",
                Type.DRAGON,
                new Stats(60,
                        55,
                        65,
                        55,
                        45,
                        50),
                List.of(Ability.SOLAR_POWER), Ability.SOLAR_POWER,
                8, 165,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("Mightiro are always on the hunt for adventure. They often seek out dangerous situations to enact their heroic fantasies. A Mightiro's sword is said to have been crafted by beams of solid sunlight that fell to the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.SLASH,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,25),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,30),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,45),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,50),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mightiro");

    }


}
