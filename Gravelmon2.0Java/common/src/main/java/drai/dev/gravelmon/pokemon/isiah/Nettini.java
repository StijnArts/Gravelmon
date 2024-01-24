package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nettini extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nettini() {
        super("Nettini",
                Type.GRASS,Type.DARK,
                new Stats(60,
                        75,
                        50,
                        70,
                        95,
                        80),
                List.of(Ability.POISON_POINT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                151, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Poison Sting Poison 4 Leer Normal 7 Pin Missile Bug 10 Leech Seed Grass 13 Razor LeafSTAB Grass 16 PursuitSTAB Dark 19 Uproar Normal 22 Feint AttackSTAB Dark 26 Toxic Spikes Poison 30 Needle ArmSTAB Grass 34 Sucker PunchSTAB Dark 38 Encore Normal 42 Poison Jab Poison 46 Mind Reader Normal 50 Leaf StormSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.PURSUIT,16),
                        new MoveLearnSetEntry(Move.UPROAR,19),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,22),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,26),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,34),
                        new MoveLearnSetEntry(Move.ENCORE,38),
                        new MoveLearnSetEntry(Move.POISON_JAB,42),
                        new MoveLearnSetEntry(Move.MIND_READER,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,50),
                        new MoveLearnSetEntry(Move.VINE_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HORN_LEECH,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nettini");

    }


}
