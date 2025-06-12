package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Barbarrage extends drai.dev.data.pokemon.Pokemon {
    public Barbarrage() {
        super("Barbarrage",
                Type.GROUND,
                new Stats(70,
                        120,
                        100,
                        120,
                        50,
                        30),
                List.of(Ability.SKILL_LINK,Ability.MEGA_LAUNCHER,Ability.BOMBARDIER), Ability.BOMBARDIER,
                11, 165,
                new Stats(0,1,0,1,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Barbarrage no longer relies on being attached to others and is free to navigate the ocean. Its cannon-like head is able to rotate a full 360 degrees, which it uses to launch attacks with perfect precision."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.HARDEN,7),
                        new MoveLearnSetEntry(Move.MUD_BOMB,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.BULLET_SEED,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.LOCKON,27),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,34),
                        new MoveLearnSetEntry(Move.SANDSHOT,38),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,51),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,56),
                        new MoveLearnSetEntry(Move.SNIPE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
