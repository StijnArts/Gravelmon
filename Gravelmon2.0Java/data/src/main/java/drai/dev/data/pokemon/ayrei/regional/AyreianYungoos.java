package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianYungoos extends Pokemon {
    public AyreianYungoos(String name, Aspect aspect) {
        super(name, aspect,"AyreianYungoos",
                Type.DARK,
                new Stats(48,100,40,45,30,40),
                List.of(Ability.MALEVOLENCE), Ability.ADAPTABILITY,
                4, 60,
                new Stats(0,1,0,0,0,0), 127,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.FIELD),
                List.of("Its stomach takes up most of its long torso. It's a big eater, so the amount Trainers have to spend on its food is no laughing matter."),
                List.of(new EvolutionEntry("ayreiangumshoos", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 3),
                        new MoveLearnSetEntry(Move.BITE, 7),
                        new MoveLearnSetEntry(Move.MUDSLAP, 10),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH, 13),
                        new MoveLearnSetEntry(Move.BIDE, 16),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 19),
                        new MoveLearnSetEntry(Move.MUDSLAP, 23),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 27),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 31),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 35),
                        new MoveLearnSetEntry(Move.CRUNCH, 39),
                        new MoveLearnSetEntry(Move.HYPER_FANG, 43),
                        new MoveLearnSetEntry(Move.YAWN, 47),
                        new MoveLearnSetEntry(Move.THRASH, 51),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 55),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.REVENGE, "egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "egg"),
                        new MoveLearnSetEntry(Move.FIRE_FANG, "egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG, "egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, "egg")
                ),
                List.of(Label.VANGUARD, Label.GEN7),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Yungoos");

    }
}
