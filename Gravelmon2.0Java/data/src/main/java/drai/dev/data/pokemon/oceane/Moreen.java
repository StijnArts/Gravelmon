package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Moreen extends drai.dev.data.pokemon.Pokemon {
    public Moreen() {
        super("Moreen",
                Type.DARK,
                new Stats(64,
                        93,
                        62,
                        94,
                        68,
                        84),
                List.of(Ability.DEFIANT), Ability.MARVEL_SCALE,
                15, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.0,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Moreen are always competing for who has the biggest front and back fins - the bigger they are the more beautiful they consider them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.CAPTIVATE,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,1),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.FLATTER,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
