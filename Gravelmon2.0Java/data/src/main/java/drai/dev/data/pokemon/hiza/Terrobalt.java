package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Terrobalt extends drai.dev.data.pokemon.Pokemon {
    public Terrobalt() {
        super("Terrobalt",
                Type.STEEL, Type.FLYING,
                new Stats(77,
                        96,
                        113,
                        40,
                        68,
                        101),
                List.of(Ability.UNNERVE), Ability.BIG_PECKS,
                17, 165,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("While being capable of short flights, it spends most of its time on the ground. Its powerful legs allow it to run several miles without taking a rest."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.METAL_CLAW,12),
                        new MoveLearnSetEntry(Move.AGILITY,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.STEEL_WING,28),
                        new MoveLearnSetEntry(Move.PAYBACK,32),
                        new MoveLearnSetEntry(Move.DRILL_PECK,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.SPIKES,44),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,48),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,52)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Terrobalt");

    }


}
