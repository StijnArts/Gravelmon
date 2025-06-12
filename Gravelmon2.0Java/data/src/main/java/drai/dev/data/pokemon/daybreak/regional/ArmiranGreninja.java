package drai.dev.data.pokemon.daybreak.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmiranGreninja extends Pokemon {
    public ArmiranGreninja(String name, Aspect aspect) {
        super(name, aspect,"ArmiranGreninja",
                Type.DARK, Type.FIRE,
                new Stats(72, 103, 67, 95, 71, 122),
                List.of(Ability.BLAZE, Ability.SKILL_LINK), Ability.PROTEAN,
                15, 400,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It appears and vanishes with a ninja’s grace. It toys with its enemies using swift movements."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PURSUIT,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.EMBER,10),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,14),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,20),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,23),
                        new MoveLearnSetEntry(Move.SPIKES,28),
                        new MoveLearnSetEntry(Move.BLAZING_SHURIKEN,33),
                        new MoveLearnSetEntry(Move.MORNING_SUN,36),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,43),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,49),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,52),
                        new MoveLearnSetEntry(Move.PROTECT,56),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,60),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,70),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,75),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.BESTOW,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.MIND_READER,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"egg")
                        ),
                List.of(Label.GEN6,Label.DAYBREAK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .cantSeeSky()
    .belowY(-20)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Greninja");
    }
}
