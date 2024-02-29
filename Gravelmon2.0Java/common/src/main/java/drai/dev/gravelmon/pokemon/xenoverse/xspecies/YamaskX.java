package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class YamaskX extends Pokemon {
    public YamaskX(int dexNo) {
        super(dexNo,"YamaskX",
                Type.WATER, Type.ROCK,
                new Stats(38, 30, 85, 65, 55, 30),
                List.of(Ability.STORM_DRAIN), Ability.WEAK_ARMOR,
                7, 40,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                45, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.XENO),
                List.of("Its calcareous shell resembles an ancient water jar. It is unknown if men's artifacts were inspired by this Pokemon or vice versa."),
                List.of(new EvolutionEntry("cofagrigusx", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,4),
                        new MoveLearnSetEntry(Move.PROTECT,8),
                        new MoveLearnSetEntry(Move.ROCK_THROW,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,28),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,32),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,36),
                        new MoveLearnSetEntry(Move.SOAK,40),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,44),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
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
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN5),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 32, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Yamask");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
