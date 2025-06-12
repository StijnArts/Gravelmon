package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Feygon extends drai.dev.data.pokemon.Pokemon {
    public Feygon() {
        super("Feygon",
                Type.DRAGON,
                new Stats(46,
                        57,
                        50,
                        57,
                        50,
                        50),
                List.of(Ability.OUTBURST), Ability.CONTRARY,
                6, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("At night, they search the grasslands and destroy any four-leaf clover they find. It is said they look for lucky people and try to ruin their lives."),
                List.of(new EvolutionEntry("maligon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,5),
                        new MoveLearnSetEntry(Move.RAGE,8),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,10),
                        new MoveLearnSetEntry(Move.SCARY_FACE,14),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,18),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,21),
                        new MoveLearnSetEntry(Move.SHOVEOFF,24),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,27),
                        new MoveLearnSetEntry(Move.PURSUIT,31),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,35),
                        new MoveLearnSetEntry(Move.BERSERKFURY,39),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,43),
                        new MoveLearnSetEntry(Move.OUTRAGE,48),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Feygon");

    }


}
