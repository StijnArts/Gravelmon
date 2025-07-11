package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianArchen extends Pokemon {
    public AyreianArchen(String name, Aspect aspect) {
        super(name, aspect,"AyreianArchen",
                Type.DARK, Type.DRAGON,
                new Stats(55,97,45,40,74,45),
                List.of(Ability.LIMBER, Ability.EARLY_BIRD), Ability.PROTOSYNTHESIS,
                5, 95,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                71, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.WATER_3),
                List.of("While its weight prevents it from flying, it can jump up to 30 feet in the air."),
                List.of(new EvolutionEntry("ayreianarcheops", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.PURSUIT, 3),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 6),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 12),
                        new MoveLearnSetEntry(Move.PLUCK, 15),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, 18),
                        new MoveLearnSetEntry(Move.UTURN, 21),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 24),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 27),
                        new MoveLearnSetEntry(Move.CRUNCH, 30),
                        new MoveLearnSetEntry(Move.AGILITY, 33),
                        new MoveLearnSetEntry(Move.TAILWIND, 36),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, 39),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, 42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 45),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 49),
                        new MoveLearnSetEntry(Move.GLAIVE_RUSH, 55),

                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.LASH_OUT, "tutor"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor"),

                        new MoveLearnSetEntry(Move.BITE, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO, "egg")
                ),
                List.of(Label.GEN5,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(9)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Archen");
        setCanFly(true);
    }
}
