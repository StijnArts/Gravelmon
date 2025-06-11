package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Aidelf extends drai.dev.data.pokemon.Pokemon {
    public Aidelf() {
        super("Aidelf",
                Type.GRASS, Type.FAIRY,
                new Stats(55,
                        34,
                        57,
                        94,
                        112,
                        90),
                List.of(Ability.LEAF_GUARD,Ability.DANCER,Ability.FLOWER_VEIL), Ability.FLOWER_VEIL,
                8, 165,
                new Stats(0,0,0,0,2,0), 140,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Many colonies of Aidelf can be found in different sections of the same forest living in harmony, helping it grow along with nurturing their young."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,9),
                        new MoveLearnSetEntry(Move.HELPING_HAND,14),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.WISH,22),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,27),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,31),
                        new MoveLearnSetEntry(Move.MOONLIGHT,36),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,40),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,43),
                        new MoveLearnSetEntry(Move.SYNTHESIS,45),
                        new MoveLearnSetEntry(Move.MOONBLAST,47),
                        new MoveLearnSetEntry(Move.MOONBLAST,49),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,57),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Aidelf");

    }


}
