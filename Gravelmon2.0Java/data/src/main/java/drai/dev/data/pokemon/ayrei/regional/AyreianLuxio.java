package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianLuxio extends Pokemon {
    public AyreianLuxio(String name, Aspect aspect) {
        super(name, aspect,"AyreianLuxio",
                Type.ELECTRIC, Type.FIGHTING,
                new Stats(60,85,49,70,85,49),
                List.of(Ability.GALVANIZE, Ability.INTIMIDATE), Ability.GUTS,
                9, 305,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                53, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Strong electricity courses through the tips of its sharp claws. A light scratch causes fainting in foes."),
                List.of(new EvolutionEntry("ayreianluxray", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 6),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 12),
                        new MoveLearnSetEntry(Move.SNARL, 16),
                        new MoveLearnSetEntry(Move.SPARK, 18),
                        new MoveLearnSetEntry(Move.ROLLING_KICK, 21),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, 25),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 29),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW, 32),
                        new MoveLearnSetEntry(Move.JUMP_KICK, 37),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, 40),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 45),
                        new MoveLearnSetEntry(Move.CRUNCH, 56),
                        new MoveLearnSetEntry(Move.THUNDER, 64),

                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNARL, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),

                        new MoveLearnSetEntry(Move.ICE_FANG, "egg"),
                        new MoveLearnSetEntry(Move.FIRE_FANG, "egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.HOWL, "egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "egg"),
                        new MoveLearnSetEntry(Move.SWIFT, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "egg"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg")
                ),
                List.of(Label.GEN4,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Luxio");
    }
}
