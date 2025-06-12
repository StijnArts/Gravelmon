package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Elfini extends drai.dev.data.pokemon.Pokemon {
    public Elfini() {
        super("Elfini",
                Type.GRASS, Type.FAIRY,
                new Stats(40,
                        19,
                        37,
                        54,
                        62,
                        60),
                List.of(Ability.LEAF_GUARD,Ability.DANCER,Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                2, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                68, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Elfini and Flabebe live in a colony somewhere deep in Umbropine Woods. Elfini and Flabebe like to dance at night in secret. Rings of flowers sprout unnaturally fast where they dance."),
                List.of(new EvolutionEntry("aidelf", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,9),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,14),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.WISH,21),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,28),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,31),
                        new MoveLearnSetEntry(Move.MOONLIGHT,34),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,37),
                        new MoveLearnSetEntry(Move.MOONBLAST,42),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,45),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Elfini");

    }


}
