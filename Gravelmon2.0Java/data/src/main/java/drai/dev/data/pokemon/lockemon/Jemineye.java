package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jemineye extends Pokemon {
    public Jemineye() {
        super("Jemineye",
                Type.ROCK, Type.PSYCHIC,
                new Stats(75,
                        30,
                        60,
                        120,
                        60,
                        20),
                List.of(Ability.TWO_FACED), Ability.TWO_FACED,
                10, 234,
                new Stats(0,0,0,0,2,0), 90,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.WATER_3),
                List.of("Under the water, nothing is more aware than Jemineye. It always sees through its gem like eyes, even while it rests, it always is ready to escape."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,5),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,10),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,15),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,20),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,25),
                        new MoveLearnSetEntry(Move.PSYCHIC,30),
                        new MoveLearnSetEntry(Move.STONE_EDGE,35),
                        new MoveLearnSetEntry(Move.DIAMOND_STORM,40),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,45),
                        new MoveLearnSetEntry(Move.EXPLOSION,50)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 22, 48, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.MAXY,"0")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FREEZING))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
    }
}
