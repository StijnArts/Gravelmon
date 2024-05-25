package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Cervantrier extends Pokemon {
    public Cervantrier() {
        super("Cervantrier",
                Type.GRASS, Type.FAIRY,
                new Stats(95,115,70,90,80,80),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                18, 1590,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.VINE_WHIP, 5),
                        new MoveLearnSetEntry(Move.ROLLOUT, 8),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 11),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 18),
                        new MoveLearnSetEntry(Move.STOMP, 23),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 26),
                        new MoveLearnSetEntry(Move.LEAF_BLADE, 29),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 34),
                        new MoveLearnSetEntry(Move.BULK_UP, 38),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 42),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 46),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 50),
                        new MoveLearnSetEntry(Move.SACRED_SWORD, 56),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, 64),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER, 70),
                        new MoveLearnSetEntry(Move.POISON_JAB, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN, "egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
