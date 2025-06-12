package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Macedontus extends Pokemon {
    public Macedontus() {
        super("Macedontus",
                Type.ICE, Type.GROUND,
                new Stats(100,
                        130,
                        90,
                        80,
                        90,
                        40),
                List.of(Ability.GLACIAL_ARMOR, Ability.SAND_RUSH), Ability.SAND_FORCE,
                10, 295,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("As an ancestor to Sandshrew, a Macedontus can resist even the strongest attacks. Using their spiky tail, Macedontus can crush foes while defending itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_BALL,13),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.BLIZZARD,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,41),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
