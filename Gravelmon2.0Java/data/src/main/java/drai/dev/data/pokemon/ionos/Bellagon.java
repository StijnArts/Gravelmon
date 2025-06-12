package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bellagon extends drai.dev.data.pokemon.Pokemon {
    public Bellagon() {
        super("Bellagon",
                Type.GRASS, Type.DRAGON,
                new Stats(100,
                        80,
                        50,
                        90,
                        90,
                        90),
                List.of(Ability.DANCER), Ability.DANCER,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.12,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- AbsorbSTAB Grass - Agility Psychic - Gust Flying - Grassy Terrain Grass 8 Quick Attack Normal 16 Teeter Dance Normal 20 Air Cutter Flying 25 Feather Dance Flying 35 Wing Attack Flying 43 Petal DanceSTAB Grass 48 Dragon Dance Dragon 54 Dragon RushSTAB Dragon 59 Acrobatics Flying 68 Extreme Speed Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,20),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,25),
                        new MoveLearnSetEntry(Move.WING_ATTACK,35),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,43),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,48),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,54),
                        new MoveLearnSetEntry(Move.ACROBATICS,59),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,68),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Bellagon");

    }


}
