package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Furiousc extends drai.dev.data.pokemon.Pokemon {
    public Furiousc() {
        super("Furiousc",
                Type.WATER, Type.FIRE,
                new Stats(95,
                        60,
                        110,
                        145,
                        100,
                        45),
                List.of(Ability.ANGER_POINT), Ability.HUGE_POWER,
                18, 165,
                new Stats(0,0,2,0,0,0), 65,
                0.6,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MINERAL),
                List.of("Its blood is so hot it begins to boil, heating the water around it. So much steam builds up in its shell that it creates a violent explosion when it releases it all."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,25),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,28),
                        new MoveLearnSetEntry(Move.GLARE,31),
                        new MoveLearnSetEntry(Move.SCALD,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,48),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,52),
                        new MoveLearnSetEntry(Move.EXPLOSION,56),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
