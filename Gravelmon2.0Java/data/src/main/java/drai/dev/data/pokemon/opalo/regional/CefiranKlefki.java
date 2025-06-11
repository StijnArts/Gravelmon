package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranKlefki extends Pokemon {
    public CefiranKlefki(String name, Aspect aspect) {
        super(name, aspect,"CefiranKlefki",
                Type.GHOST, Type.FAIRY,
                new Stats(57,80,91,75,90,107),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                2, 30,
                new Stats(0,0,1,0,0,0), 60,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.MINERAL),
                List.of("The ultrasonic waves it emits from its ears can reduce a large boulder to pebbles. It swoops out of the dark to attack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 5),
                        new MoveLearnSetEntry(Move.ASTONISH, 8),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 12),
                        new MoveLearnSetEntry(Move.SPIKES, 15),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 18),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 23),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, 27),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 34),
                        new MoveLearnSetEntry(Move.IMPRISON, 36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 43),
                        new MoveLearnSetEntry(Move.HEX, 44),
                        new MoveLearnSetEntry(Move.SPIKES, 50),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "egg"),
                        new MoveLearnSetEntry(Move.LOCKON, "egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO, "egg"),
                        new MoveLearnSetEntry(Move.THIEF, "egg")
                ),
                List.of(Label.OPAL, Label.GEN6),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(20)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Klefki");
    }
}
