package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phonemon extends drai.dev.data.pokemon.Pokemon {
    public Phonemon() {
        super("Phonemon",
                Type.NORMAL, Type.GHOST,
                new Stats(60,
                        85,
                        100,
                        100,
                        100,
                        35),
                List.of(Ability.SOUNDPROOF,Ability.SCRAPPY,Ability.CACOPHONY), Ability.CACOPHONY,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Locking an inmate in the same room as a loudmouthed Phonemon used to be a widespread method of interrogation. Its bite is just as strong as its bark."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.UPROAR,4),
                        new MoveLearnSetEntry(Move.CONFIDE,7),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,11),
                        new MoveLearnSetEntry(Move.SUPERSONIC,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.CHATTER,21),
                        new MoveLearnSetEntry(Move.TAUNT,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,31),
                        new MoveLearnSetEntry(Move.METRONOME,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,39),
                        new MoveLearnSetEntry(Move.RELIC_SONG,43),
                        new MoveLearnSetEntry(Move.PERISH_SONG,47),
                        new MoveLearnSetEntry(Move.BATON_PASS,53),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.BOOMBURST,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Phonemon");

    }


}
