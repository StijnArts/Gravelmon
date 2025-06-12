package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Munsun extends drai.dev.data.pokemon.Pokemon {
    public Munsun() {
        super("Munsun",
                Type.FLYING, Type.ELECTRIC,
                new Stats(70,
                        60,
                        90,
                        70,
                        50,
                        20),
                List.of(Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                11, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Munsun are often seen as symbols of childishness and whimsy, despite their constant pouty face. The orb they carry around is the source of their power, without it they would not be able to generate electricity or create cloud platforms. As they gain experience, their orb grows in size and power."),
                List.of(new EvolutionEntry("thermoni", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(       new MoveLearnSetEntry(Move.AIR_BUBBLE,1),
                        new MoveLearnSetEntry(Move.CLOUD_CRASH,1),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.SUPERCELL,1),
                        new MoveLearnSetEntry(Move.ZING_ZAP,1),
                        new MoveLearnSetEntry(Move.ION_DELUGE,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1)                 ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
