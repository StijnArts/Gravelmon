package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class CofagrigusX extends Pokemon {
    public CofagrigusX(int dexNo) {
        super(dexNo,"CofagrigusX",
                Type.WATER, Type.ROCK,
                new Stats(58, 50, 145, 105, 95, 30),
                List.of(Ability.STORM_DRAIN), Ability.WEAK_ARMOR,
                15, 660,
                new Stats(0,0,2,1,0,0), 45,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.XENO),
                List.of("Its limbs are made of pure cristalline water. Some people believe that a single sip of that water will give you everlasting life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,28),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,32),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,38),
                        new MoveLearnSetEntry(Move.SOAK,44),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,50),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,56),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,62),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN5),
                1, List.of(
                        new ItemDrop("gravelmon:xenolith",50, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 46, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Cofagrigus");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
