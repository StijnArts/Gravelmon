package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Exploseave extends drai.dev.gravelmon.pokemon.Pokemon {
    public Exploseave() {
        super("Exploseave",
                Type.WATER,Type.STEEL,
                new Stats(50,
                        80,
                        150,
                        30,
                        120,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 65,
                1.0,
                233, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("Exploseave's internal anatomy is designed to trigger a massive explosion when injured. As long as its tail remains, it will regrow its entire body after detonating."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.HARDEN,7),
                        new MoveLearnSetEntry(Move.SPIKES,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.SOAK,23),
                        new MoveLearnSetEntry(Move.FLIP_TURN,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.EXPLOSION,42),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,47),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 37, 56, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.OCEAN_MONUMENT, SpawnPreset.OCEAN_RUINS),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
