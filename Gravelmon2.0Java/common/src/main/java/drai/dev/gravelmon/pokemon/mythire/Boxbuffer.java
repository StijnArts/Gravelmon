package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Boxbuffer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boxbuffer() {
        super("Boxbuffer",
                Type.FIGHTING, Type.POISON,
                new Stats(110,
                        130,
                        40,
                        60,
                        70,
                        90),
                List.of(Ability.IRON_BARBS,Ability.POISON_POINT,Ability.RAIN_DISH), Ability.RAIN_DISH,
                17, 165,
                new Stats(0,2,0,0,0,0), 85,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It's able to swell its fists with water to make them heavier and stronger. By lowering its head and raising its fists, it can easily cushion all damage before rebounding with a brutal counterattack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.COUNTER,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.POISON_TAIL,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.BANEFUL_BUNKER,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,1),
                        new MoveLearnSetEntry(Move.PUFF_UP,1)
                ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 52, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Boxbuffer");

    }


}
