package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fungotta extends drai.dev.data.pokemon.Pokemon {
    public Fungotta() {
        super("Fungotta",
                Type.GROUND, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EFFECT_SPORE,Ability.DRY_SKIN,Ability.SPIRITBOUND), Ability.SPIRITBOUND,
                3, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Fungotta usually live underground, but emerge during rainy weather to happily frolic in the downpour. Inhaling the clouds of spores this Pokemon creates induces fear."),
                List.of(new EvolutionEntry("chanterra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPORE,1),
                        new MoveLearnSetEntry(Move.LANDSLIDE,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,1),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.EMBARGO,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1)
                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MUSHROOM, Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fungotta");

    }


}
