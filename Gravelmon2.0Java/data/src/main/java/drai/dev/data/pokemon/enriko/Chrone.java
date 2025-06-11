package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chrone extends drai.dev.data.pokemon.Pokemon {
    public Chrone() {
        super("Chrone",
                Type.STEEL, Type.FLYING,
                new Stats(40,
                        65,
                        85,
                        20,
                        65,
                        75),
                List.of(Ability.MOTOR_DRIVE,Ability.LIGHTNING_ROD,Ability.FOREWARN), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,0,1), 170,
                1.0,
                87, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A presumably manmade Pokemon that can be seen spying on people. It seems to subsist solely on visual stimulation, as it can only die if its lens is blocked for too long."),
                List.of(new EvolutionEntry("reconuisance", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:upgrade")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LOCKON,1)),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        setCanFly(true);

    }


}
