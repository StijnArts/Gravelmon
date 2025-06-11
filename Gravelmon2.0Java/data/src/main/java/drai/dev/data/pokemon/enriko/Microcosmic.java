package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Microcosmic extends drai.dev.data.pokemon.Pokemon {
    public Microcosmic() {
        super("Microcosmic",
                Type.STEEL, Type.GRASS,
                new Stats(120,
                        80,
                        110,
                        100,
                        100,
                        50),
                List.of(Ability.SYMBIOSIS,Ability.SOLAR_POWER,Ability.STALWART), Ability.STALWART,
                13, 165,
                new Stats(0,0,0,0,0,0), 85,
                0.5,
                273, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Microcosmic obsessively care for the algae that live inside its body, providing it with heat. It is thought that the algae came from another planet, and is dependent on this Pokemon to survive its new environment."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,7),
                        new MoveLearnSetEntry(Move.PROTECT,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,24),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,32),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,36),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,40),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,44),
                        new MoveLearnSetEntry(Move.REST,50),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,56),
                        new MoveLearnSetEntry(Move.METEOR_MASH,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(37)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Microcosmic");

    }


}
