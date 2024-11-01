package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianBudew extends Pokemon {
    public AyreianBudew(String name, Aspect aspect) {
        super(name, aspect,"AyreianBudew",
                Type.STEEL, Type.POISON,
                new Stats(40,50,35,60,30,60),
                List.of(Ability.STEELY_SPIRIT, Ability.POISON_TOUCH), Ability.TECHNICIAN,
                2, 12,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                53, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Rarely seen in the wild, these pokemon remain particularly buried to gain nutrients. What looks like a mask is in reality a hardened shell that gives its soft body protection. When panicked it releases a spore that reduces agression, but can be very poisonous."),
                List.of(new EvolutionEntry("ayreianroselia", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, 1),
                        new MoveLearnSetEntry(Move.POISON_POWDER, 1),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 4),
                        new MoveLearnSetEntry(Move.BIDE, 8),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 12),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "tutor"),

                        new MoveLearnSetEntry(Move.SYNTHESIS, "egg"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, "egg"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "egg"),
                        new MoveLearnSetEntry(Move.LIFE_DEW, "egg")
                ),
                List.of(Label.GEN4,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 28, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Budew");
        this.setPortraitXYZ(0,1.8,0);
    }
}
