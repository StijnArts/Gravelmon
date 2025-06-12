package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anedusa extends drai.dev.data.pokemon.Pokemon {
    public Anedusa() {
        super("Anedusa",
                Type.POISON, Type.FIGHTING,
                new Stats(60,
                        100,
                        70,
                        50,
                        80,
                        110),
                List.of(Ability.DRY_SKIN), Ability.TECHNICIAN,
                12, 251,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Instead of using its arms it fights using its snake head like tentacles, the poison on those is powerful enough to paralyze its foes for hours."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.GROWTH,23),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,28),
                        new MoveLearnSetEntry(Move.VENOSHOCK,30),
                        new MoveLearnSetEntry(Move.SLAM,34),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,40),
                        new MoveLearnSetEntry(Move.POISON_JAB,45),
                        new MoveLearnSetEntry(Move.SPORE,50)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Anedusa");

    }


}
