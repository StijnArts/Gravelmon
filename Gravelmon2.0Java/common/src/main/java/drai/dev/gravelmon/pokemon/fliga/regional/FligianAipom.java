package drai.dev.gravelmon.pokemon.fliga.regional;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class FligianAipom extends drai.dev.gravelmon.pokemon.Pokemon {
    public FligianAipom(String name, Aspect aspect) {
        super(name, aspect, "Aipom",
                Type.GHOST,
                new Stats(55,
                        70,
                        85,
                        40,
                        50,
                        60),
                List.of(Ability.PICKUP,Ability.RECEIVER), Ability.SKILL_LINK,
                6, 0,
                new Stats(0,0,2,0,0,0), 80,
                0.5,
                166, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Fligian Aipoms have a particular obsession with bones, and the sound they make when knocked together. Entire bands of Aipom will gather to smack bones on each other's skull helmets to make a grim, yet funky, beat."),
                List.of(new EvolutionEntry("slambizom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"cobblemon:thick_club\""))),
                        new EvolutionEntry("macaqdeath", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"gravelmon:empty_skull\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PHANTOMHAND,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,5),
                        new MoveLearnSetEntry(Move.ASTONISH,9),
                        new MoveLearnSetEntry(Move.DIG,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,16),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,20),
                        new MoveLearnSetEntry(Move.BONEMERANG,24),
                        new MoveLearnSetEntry(Move.SNATCH,28),
                        new MoveLearnSetEntry(Move.SCREECH,32),
                        new MoveLearnSetEntry(Move.BONE_RUSH,36),
                        new MoveLearnSetEntry(Move.POLTERGEIST,40),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,44),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,48),
                        new MoveLearnSetEntry(Move.MOONLIGHT,52),
                        new MoveLearnSetEntry(Move.ENDEAVOR,56),
                        new MoveLearnSetEntry(Move.FLING,60),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aipom");

    }


}
