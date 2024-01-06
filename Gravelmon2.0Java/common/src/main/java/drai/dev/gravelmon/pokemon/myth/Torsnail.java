package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Torsnail extends Pokemon {
    public Torsnail() {
        super("Torsnail",
                Type.WATER, Type.FAIRY,
                new Stats(75,75,85,60,80,60),
                List.of(Ability.STORM_DRAIN), Ability.CONTRARY,
                8, 169,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Once Torsnail become more comfortable, they decide to extend out of their shell a little more."),
                List.of(new EvolutionEntry("wavstisnail", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.CUTE_SHOT, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 15),
                        new MoveLearnSetEntry(Move.AQUA_JET, 18),
                        new MoveLearnSetEntry(Move.SCREECH, 20),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 21),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 24),
                        new MoveLearnSetEntry(Move.SONAR_PULSE, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),

                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.TICKLE, "egg"),
                        new MoveLearnSetEntry(Move.WISH, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.COVET, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 43, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
