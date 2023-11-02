package drai.dev.gravelmon.pokemon.blazingemerald;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Drilladin extends Pokemon {
    public Drilladin() {
        super("Drilladin",
                Type.BUG, Type.POISON,
                new Stats(110, 130, 130, 65, 80, 50),
                List.of(Ability.BATTLE_ARMOR), Ability.SHIELD_DUST,
                (int) (((3)*12+(5))*2.54), (int) (1000*0.4),
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,15),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,20),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,26),
                        new MoveLearnSetEntry(Move.POISON_JAB,31),
                        new MoveLearnSetEntry(Move.MEGAHORN,38),
                        new MoveLearnSetEntry(Move.UTURN,43),
                        new MoveLearnSetEntry(Move.VIRUGAIT,49),
                        new MoveLearnSetEntry(Move.RETURN,56),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,65),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm")
                        ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 10, 40, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(),
                List.of(SpawnPreset.HONEY_TREE),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanFly(true);
        this.setPreEvolution("kakuna");
    }
}
