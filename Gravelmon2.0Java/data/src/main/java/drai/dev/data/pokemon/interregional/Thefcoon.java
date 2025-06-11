package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Thefcoon extends drai.dev.data.pokemon.Pokemon {
    public Thefcoon() {
        super("Thefcoon",
                Type.DARK,
                new Stats(40,
                        60,
                        40,
                        45,
                        40,
                        80),
                List.of(Ability.FRISK), Ability.CUTE_CHARM,
                5, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Despite their adorable appearance, Thefcoon are infamous for their incredible thieving ability. Thefcoon are so sly that their schemes are nearly undetectable."),
                List.of(new EvolutionEntry("rascoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAUNT,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.THIEF,15),
                        new MoveLearnSetEntry(Move.ASSIST,19),
                        new MoveLearnSetEntry(Move.SLASH,22),
                        new MoveLearnSetEntry(Move.ACROBATICS,25),
                        new MoveLearnSetEntry(Move.BEAT_UP,29),
                        new MoveLearnSetEntry(Move.TRICK,32),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,37),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,42),
                        new MoveLearnSetEntry(Move.SMOKEBOMB,47),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,53),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Thefcoon");

    }


}
