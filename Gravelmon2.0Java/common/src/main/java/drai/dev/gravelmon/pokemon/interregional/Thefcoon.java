package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Thefcoon extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thefcoon");

    }


}
