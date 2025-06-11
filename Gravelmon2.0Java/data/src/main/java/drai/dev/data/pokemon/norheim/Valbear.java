package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Valbear extends drai.dev.data.pokemon.Pokemon {
    public Valbear() {
        super("Valbear",
                Type.ICE, Type.FIGHTING,
                new Stats(105,
                        140,
                        90,
                        70,
                        80,
                        70),
                List.of(Ability.SNOW_CLOAK,Ability.SLUSH_RUSH), Ability.GUTS,
                21, 0,
                new Stats(0,0,0,0,0,0), 30,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,9),
                        new MoveLearnSetEntry(Move.PLAY_NICE,12),
                        new MoveLearnSetEntry(Move.BRINE,15),
                        new MoveLearnSetEntry(Move.FROST_BREATH,18),
                        new MoveLearnSetEntry(Move.SLASH,21),
                        new MoveLearnSetEntry(Move.FLAIL,24),
                        new MoveLearnSetEntry(Move.SWAGGER,27),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,30),
                        new MoveLearnSetEntry(Move.THRASH,33),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,41),
                        new MoveLearnSetEntry(Move.SHEER_COLD,46),
                        new MoveLearnSetEntry(Move.SUPERPOWER,51),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(52)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Valbear");
        addAdditionalEvolution("beartic", new EvolutionEntry("Valbear", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_SNOWY_FOREST.getId() + ":" + Biome.IS_SNOWY_FOREST.getName()))));

    }


}
