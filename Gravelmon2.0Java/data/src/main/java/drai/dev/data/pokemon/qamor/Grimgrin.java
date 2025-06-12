package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grimgrin extends drai.dev.data.pokemon.Pokemon {
    public Grimgrin() {
        super("Grimgrin",
                Type.DARK,
                new Stats(42,
                        73,
                        67,
                        60,
                        24,
                        34),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Grimgrin are known for large, unblinking eyes and unsettling smile. They tend to stare down anyone who goes near them, with the same unmoving and unwavering expression."),
                List.of(new EvolutionEntry("gibboor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.SWAGGER,15),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.UPROAR,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,24),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,27),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,31),
                        new MoveLearnSetEntry(Move.THRASH,38),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,40),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,50)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grimgrin");

    }


}
