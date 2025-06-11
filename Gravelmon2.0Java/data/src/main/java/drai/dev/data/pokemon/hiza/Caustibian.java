package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Caustibian extends drai.dev.data.pokemon.Pokemon {
    public Caustibian() {
        super("Caustibian",
                Type.POISON,
                new Stats(50,
                        75,
                        60,
                        120,
                        70,
                        95),
                List.of(Ability.POISON_TOUCH,Ability.STICKY_HOLD,Ability.CORROSION), Ability.CORROSION,
                7, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("They mark their territory by leaving toxic slime puddles behind. This slime dries out over a short time and becomes safe to touch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SLUDGE,10),
                        new MoveLearnSetEntry(Move.AMNESIA,12),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,17),
                        new MoveLearnSetEntry(Move.ENCORE,20),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.SPIT_UP,28),
                        new MoveLearnSetEntry(Move.STOCKPILE,28),
                        new MoveLearnSetEntry(Move.SWALLOW,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,33),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,36),
                        new MoveLearnSetEntry(Move.BELCH,41),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,49)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
