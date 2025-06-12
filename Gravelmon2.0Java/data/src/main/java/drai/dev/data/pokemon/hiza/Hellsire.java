package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hellsire extends drai.dev.data.pokemon.Pokemon {
    public Hellsire() {
        super("Hellsire",
                Type.FIRE, Type.DRAGON,
                new Stats(125,
                        130,
                        95,
                        195,
                        100,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                56, 165,
                new Stats(0,0,0,3,0,0), 3,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A legendary Pokemon that lives deep in the planet's core. A single flap of its wings can burn whole continents to a crisp."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,7),
                        new MoveLearnSetEntry(Move.HOWL,14),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,28),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,35),
                        new MoveLearnSetEntry(Move.MORNING_SUN,42),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,56),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,63),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,70),
                        new MoveLearnSetEntry(Move.OUTRAGE,77),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,84),
                        new MoveLearnSetEntry(Move.RAGING_FURY,91)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_WASTELAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
