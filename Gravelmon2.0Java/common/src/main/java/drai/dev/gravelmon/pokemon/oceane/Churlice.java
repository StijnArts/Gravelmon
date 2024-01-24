package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Churlice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Churlice() {
        super("Churlice",
                Type.FIRE,Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STICKY_HOLD,Ability.PRESSURE,Ability.GOLDRUSH), Ability.GOLDRUSH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("Churlice's Limbtacles were a bright red-orange when heat coursed through them. When it wasn't feeding, this ancient Pokémon would hide amongst the rocks hoping to be left alone."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Churlice");

    }


}
