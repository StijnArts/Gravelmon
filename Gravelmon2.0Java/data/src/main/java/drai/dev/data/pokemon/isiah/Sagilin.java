package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sagilin extends drai.dev.data.pokemon.Pokemon {
    public Sagilin() {
        super("Sagilin",
                Type.WATER,
                new Stats(65,
                        80,
                        65,
                        60,
                        50,
                        120),
                List.of(Ability.SWIFT_SWIM,Ability.INFILTRATOR,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                154, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.AGILITY,18),
                        new MoveLearnSetEntry(Move.DIVE,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,30),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48)),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
