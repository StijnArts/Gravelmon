package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nafugu extends drai.dev.data.pokemon.Pokemon {
    public Nafugu() {
        super("Nafugu",
                Type.WATER, Type.STEEL,
                new Stats(35,
                        60,
                        90,
                        20,
                        60,
                        15),
                List.of(Ability.IRON_BARBS), Ability.AFTERMATH,
                4, 165,
                new Stats(0,0,0,0,0,0), 180,
                1.0,
                84, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("Nafugu live floating in the open sea, usually in inconvenient locations. When touched, they spontaneously combust, flinging spikes all over."),
                List.of(new EvolutionEntry("exploseave", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.HARDEN,7),
                        new MoveLearnSetEntry(Move.SPIKES,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.SOAK,23),
                        new MoveLearnSetEntry(Move.FLIP_TURN,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.EXPLOSION,42),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,47),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(9)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.OCEAN_RUINS)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
