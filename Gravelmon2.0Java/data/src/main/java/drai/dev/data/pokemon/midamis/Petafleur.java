package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Petafleur extends drai.dev.data.pokemon.Pokemon {
    public Petafleur() {
        super("Petafleur",
                Type.GRASS, Type.PSYCHIC,
                new Stats(55,
                        55,
                        55,
                        95,
                        75,
                        65),
                List.of(Ability.EFFECT_SPORE), Ability.MAGIC_BOUNCE,
                6, 165,
                new Stats(0,0,0,2,1,0), 45,
                0.125,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Upon evolution, Petafleur are confident in its new awakened power and trusts itself more than it did as a Cloflower. Petafleur has attacks that most Pokemon of the same type wouldn't and this gives it a great advantage in battle."),
                List.of(new EvolutionEntry("florown", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.TRICK,30),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,36),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,42),
                        new MoveLearnSetEntry(Move.GRAVITY,54),
                        new MoveLearnSetEntry(Move.PSYCHIC,60),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,66),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Petafleur");

    }


}
