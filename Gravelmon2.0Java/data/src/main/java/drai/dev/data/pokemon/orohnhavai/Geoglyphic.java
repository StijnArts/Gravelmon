package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Geoglyphic extends drai.dev.data.pokemon.Pokemon {
    public Geoglyphic(Stats stats) {
        super("Geoglyphic",
                Type.ROCK, Type.PSYCHIC,
                stats,
                List.of(Ability.VITAL_SPIRIT,Ability.SPIRITBOUND,Ability.PSYCHIC_SURGE), Ability.PSYCHIC_SURGE,
                20, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An ancient Pokemon known to be found on ancient burial sites. Most of these burial sites date back thousands of years. Scientists believe it guarded the graves from any intruder and protect the area with an unknown ancient energy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.SLASH,14),
                        new MoveLearnSetEntry(Move.AGILITY,21),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,28),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,42),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,49),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,63),
                        new MoveLearnSetEntry(Move.MEGAHORN,70),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,77),
                        new MoveLearnSetEntry(Move.STONE_EDGE,84),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,91)
                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS, SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Geoglyphic");

    }


}
