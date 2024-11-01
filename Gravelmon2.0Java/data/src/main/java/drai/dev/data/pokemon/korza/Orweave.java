package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orweave extends drai.dev.data.pokemon.Pokemon {
    public Orweave() {
        super("Orweave",
                Type.BUG,
                new Stats(60,
                        85,
                        85,
                        75,
                        90,
                        65),
                List.of(Ability.PRANKSTER), Ability.LIMBER,
                12, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Female Orweaves have a bigger thorax than their male counterparts, making them slower and hardier. Orweaves are viewed as meticulous artisans because each web they make is unique and elaborately woven. The web is destroyed at the end of the night and remade the next day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIDER_WEB,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BUG_BITE,9),
                        new MoveLearnSetEntry(Move.STRING_SHOT,15),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,20),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,24),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,28),
                        new MoveLearnSetEntry(Move.THREADLASH,33),
                        new MoveLearnSetEntry(Move.PINCH,37),
                        new MoveLearnSetEntry(Move.LUNGE,41),
                        new MoveLearnSetEntry(Move.INFESTATION,46),
                        new MoveLearnSetEntry(Move.STICKY_WEB,50)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Orweave");

    }


}
