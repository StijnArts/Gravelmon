package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Owlminous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Owlminous() {
        super("Owlminous",
                Type.FLYING,Type.GHOST,
                new Stats(66,
                        95,
                        71,
                        85,
                        118,
                        75),
                List.of(Ability.NOCTURNAL), Ability.INSOMNIA,
                18, 165,
                new Stats(0,1,0,0,2,0), 30,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Being caught in the piercing gaze of an Owlminous will leave you paralyzed in fear. They say their soulless glares are them envisioning your demise. Before you can react they disappear into the pitch black sky. They are known as omens of unfortunate events yet to come."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,11),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,14),
                        new MoveLearnSetEntry(Move.SCREECH,19),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,26),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,29),
                        new MoveLearnSetEntry(Move.CURSE,31),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,37),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,40),
                        new MoveLearnSetEntry(Move.PERISH_SONG,45),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,51),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,55),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,61),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,69),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 35, 56, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
