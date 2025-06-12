package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Sharmor extends drai.dev.data.pokemon.Pokemon {
    public Sharmor() {
        super("Sharmor",
                Type.STEEL, Type.WATER,
                new Stats(35,
                        55,
                        85,
                        55,
                        45,
                        40),
                List.of(Ability.STURDY), Ability.STURDY,
                5, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("sharmaul", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(    new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.WATER_SPORT,9),
                        new MoveLearnSetEntry(Move.BOLTIN,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,15),
                        new MoveLearnSetEntry(Move.PURIFY,19),
                        new MoveLearnSetEntry(Move.MUD_SHOT,21),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.SOAK,29),
                        new MoveLearnSetEntry(Move.LIQUIDMETAL,32),
                        new MoveLearnSetEntry(Move.RECYCLE,35),
                        new MoveLearnSetEntry(Move.METAL_SOUND,39),
                        new MoveLearnSetEntry(Move.METAL_BURST,42),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,45),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,56)                    ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
