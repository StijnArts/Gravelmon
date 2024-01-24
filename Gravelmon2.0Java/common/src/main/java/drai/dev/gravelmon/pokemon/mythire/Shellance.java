package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shellance extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shellance() {
        super("Shellance",
                Type.WATER,Type.FIGHTING,
                new Stats(53,
                        80,
                        80,
                        45,
                        75,
                        67),
                List.of(Ability.SHELL_ARMOR,Ability.JUSTIFIED,Ability.LONG_REACH), Ability.LONG_REACH,
                8, 165,
                new Stats(0,1,1,0,0,0), 100,
                0.5,
                140, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("When it evolved, it became intelligent enough to create crude weapons out of seashells. It uses these to scare off anything that enters its territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shellance");

    }


}
