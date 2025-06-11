package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Krakacobra extends drai.dev.data.pokemon.Pokemon {
    public Krakacobra() {
        super("Krakacobra",
                Type.GROUND, Type.ELECTRIC,
                new Stats(60,
                        92,
                        60,
                        87,
                        68,
                        128),
                List.of(Ability.VOLT_ABSORB,Ability.SAND_FORCE), Ability.RECKLESS,
                27, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Krakacobra contain high-energy plasma within its translucent body, which it shoots out when slithering at high speeds. It creates a thundercloud on its head that zaps anything that dares to attack it."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.MUD_SHOT,10),
                        new MoveLearnSetEntry(Move.CHARGE,20),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,25),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,30),
                        new MoveLearnSetEntry(Move.BOUNCE,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,45),
                        new MoveLearnSetEntry(Move.FLAIL,50),
                        new MoveLearnSetEntry(Move.FISSURE,55)          ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Krakacobra");

    }


}
