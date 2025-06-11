package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Voidevour extends drai.dev.data.pokemon.Pokemon {
    public Voidevour() {
        super("Voidevour",
                Type.GHOST, Type.WATER,
                new Stats(123,
                        121,
                        113,
                        59,
                        64,
                        40),
                List.of(Ability.SWIFT_SWIM), Ability.SOULABSORB,
                18, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Typically scouring the depths of the ocean, Voidevour lure in it's prey with it's eerie bulb, quickly snapping it's boney jaws around it's meal when they get too close."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,8),
                        new MoveLearnSetEntry(Move.ENDURE,11),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.GLARE,18),
                        new MoveLearnSetEntry(Move.LIQUIDATION,21),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,24),
                        new MoveLearnSetEntry(Move.AQUA_RING,28),
                        new MoveLearnSetEntry(Move.SOULCHOMP,31),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,35),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,43),
                        new MoveLearnSetEntry(Move.CRUNCH,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .belowY(40)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
