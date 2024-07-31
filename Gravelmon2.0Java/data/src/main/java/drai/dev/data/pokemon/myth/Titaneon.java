package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Titaneon extends Pokemon {
    public Titaneon() {
        super("Titaneon",
                Type.STEEL,
                new Stats(100,105,100,65,50,105),
                List.of(Ability.STURDY), Ability.SHIELD_DUST,
                10, 169,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Titaneon are known for their amazing stance, back in war times, Titaneon were used to protect small children."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BITE, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.LICK, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 12),
                        new MoveLearnSetEntry(Move.DIG, 15),
                        new MoveLearnSetEntry(Move.HEADBUTT, 18),
                        new MoveLearnSetEntry(Move.SCREECH, 20),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 21),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 24),
                        new MoveLearnSetEntry(Move.GEAR_GRIND, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 32),
                        new MoveLearnSetEntry(Move.PROTECT, 36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM, 40),
                        new MoveLearnSetEntry(Move.AGILITY, 42),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 51),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, 57),
                        new MoveLearnSetEntry(Move.RECOVER, 61),
                        new MoveLearnSetEntry(Move.IRON_TAIL, 67),

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
                        new MoveLearnSetEntry(Move.SYNCHRONOISE, "egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg")
                ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        addAdditionalEvolution("eevee", new EvolutionEntry("titaneon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:solid_stone"));
    }
}
