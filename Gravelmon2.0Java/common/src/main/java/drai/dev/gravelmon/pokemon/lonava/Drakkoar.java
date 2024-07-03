package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Drakkoar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drakkoar() {
        super("Drakkoar",
                Type.WATER, Type.DRAGON,
                new Stats(100,
                        85,
                        90,
                        110,
                        75,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                37, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Drakkoar are mean-tempered and prone to violence, especially against others of its species. Invaders rode Drakkoar in ancient times, with its powerful oars allowing for quick and effective ambush."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,10),
                        new MoveLearnSetEntry(Move.AQUA_RING,13),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,20),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,24),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,32),
                        new MoveLearnSetEntry(Move.COIL,38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,44),
                        new MoveLearnSetEntry(Move.THUNDER,50),
                        new MoveLearnSetEntry(Move.GLARE,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,62)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 41, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Drakkoar");

    }


}
