package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianMuk extends Pokemon {
    public AyreianMuk(String name, Aspect aspect) {
        super(name, aspect,"AyreianMuk",
                Type.WATER, Type.POISON,
                new Stats(100,60,100,45,100,100),
                List.of(Ability.STENCH, Ability.WATER_ABSORB), Ability.TOXIC_DEBRIS,
                12, 300,
                new Stats(1,0,0,0,0,0), 190,
                0.875,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("A toxic fluid seeps from its body. The fluid instantly kills plants and trees on contact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDDY_WATER, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 1),
                        new MoveLearnSetEntry(Move.POISON_GAS, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 4),
                        new MoveLearnSetEntry(Move.MUDSLAP, 7),
                        new MoveLearnSetEntry(Move.DISABLE, 12),
                        new MoveLearnSetEntry(Move.SLUDGE, 15),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 18),
                        new MoveLearnSetEntry(Move.MINIMIZE, 21),
                        new MoveLearnSetEntry(Move.AQUA_RING, 25),
                        new MoveLearnSetEntry(Move.FLING, 26),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 29),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 32),
                        new MoveLearnSetEntry(Move.SCREECH, 37),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, 40),
                        new MoveLearnSetEntry(Move.ACID_ARMOR, 46),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 52),
                        new MoveLearnSetEntry(Move.MEMENTO, 57),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.INFESTATION, "tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),

                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK, "egg"),
                        new MoveLearnSetEntry(Move.LICK, "egg"),
                        new MoveLearnSetEntry(Move.IMPRISON, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, "egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE, "egg"),
                        new MoveLearnSetEntry(Move.SWALLOW, "egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP, "egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "egg"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, "egg"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "egg")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        this.setLangFileName("Muk");
        this.setCanBreathUnderwater(true);
        this.setCanSwim(true);
    }
}
