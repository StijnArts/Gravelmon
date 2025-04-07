package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tentalcyon extends drai.dev.data.pokemon.Pokemon {
    public Tentalcyon(Stats stats) {
        super("Tentalcyon",
                Type.ELECTRIC, Type.FLYING,
                stats,
                List.of(Ability.SUPERCHARGE), Ability.SUPERCHARGE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Tentalcyon tend to be rather aloof and elusive. Though usually solitary, they've been noted to gather during thunderstorms, swooping around and feeding on the electrical energy. Their cloak-like tentacles pulsate with colours in a mesmerising manner, which they use to stun their enemies and escape."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.LIGHT_UP,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm")
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tentalcyon");

    }


}
