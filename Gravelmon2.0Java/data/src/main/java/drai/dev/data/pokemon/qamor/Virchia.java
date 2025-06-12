package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Virchia extends drai.dev.data.pokemon.Pokemon {
    public Virchia() {
        super("Virchia",
                Type.FAIRY,
                new Stats(86,
                        52,
                        50,
                        48,
                        58,
                        36),
                List.of(Ability.FLOWER_VEIL), Ability.FLOWER_VEIL,
                4, 165,
                new Stats(0,0,0,1,0,0), 36,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("It is generally known to be very friendly in its early days, and will seek out injured Pokemon to help even if it puts itself in danger."),
                List.of(new EvolutionEntry("impetal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,15),
                        new MoveLearnSetEntry(Move.CURSE,19),
                        new MoveLearnSetEntry(Move.TRICK,22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,29),
                        new MoveLearnSetEntry(Move.SEED_BOMB,34),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,38),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,41),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,65)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Virchia");

    }


}
