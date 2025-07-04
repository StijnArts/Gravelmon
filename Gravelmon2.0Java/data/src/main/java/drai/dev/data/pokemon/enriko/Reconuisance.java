package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Reconuisance extends drai.dev.data.pokemon.Pokemon {
    public Reconuisance() {
        super("Reconuisance",
                Type.STEEL, Type.FLYING,
                new Stats(65,
                        95,
                        115,
                        35,
                        95,
                        105),
                List.of(Ability.MOTOR_DRIVE,Ability.LIGHTNING_ROD,Ability.FOREWARN), Ability.FOREWARN,
                15, 165,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                180, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Its lens can zoom in extremely far, allowing it to watch a single person from a mile away. It can relay what it has seen like a projector to its trainer, should it trust them."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LOCKON,1)                   ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        setCanFly(true);

    }


}
