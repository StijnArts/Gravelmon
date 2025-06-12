package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dodonut extends drai.dev.data.pokemon.Pokemon {
    public Dodonut() {
        super("Dodonut",
                Type.GRASS, Type.FLYING,
                new Stats(41,
                        40,
                        55,
                        55,
                        40,
                        74),
                List.of(Ability.NATURAL_CURE), Ability.SOLAR_POWER,
                5, 53,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They migrate to remote islands after reaching a certain age. Since they are poor fliers to soar over the sea, they use their shells to float across the water."),
                List.of(new EvolutionEntry("palmfiend", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.GROWTH,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.ACROBATICS,26),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,30),
                        new MoveLearnSetEntry(Move.WING_ATTACK,34),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,48)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL_ISLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dodonut");

    }


}
