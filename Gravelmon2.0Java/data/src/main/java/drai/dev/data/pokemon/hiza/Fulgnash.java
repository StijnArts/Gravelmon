package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fulgnash extends drai.dev.data.pokemon.Pokemon {
    public Fulgnash() {
        super("Fulgnash",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(75,
                        100,
                        65,
                        100,
                        65,
                        95),
                List.of(Ability.MOTOR_DRIVE), Ability.STATIC,
                19, 165,
                new Stats(0,1,0,1,0,0), 65,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("A pack of tamed Fulgnash were brought into the region of Hiza to protect the fortress from the wild Voyotes, once the fortress was abandoned they made the area their lair."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,10),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.ROAR,24),
                        new MoveLearnSetEntry(Move.CRUNCH,29),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,38),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,43),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,47),
                        new MoveLearnSetEntry(Move.OUTRAGE,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,56),
                        new MoveLearnSetEntry(Move.THUNDER,61)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ARID, Biome.IS_TEMPERATE)
    .atNight()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Fulgnash");

    }


}
