package drai.dev.gravelmon.pokemon.blazingemerald;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class Mallarki extends Pokemon {
    public Mallarki() {
        super("Mallarki",
                Type.FIGHTING, Type.FLYING,
                new Stats(60, 110, 65, 58, 70, 110),
                List.of(Ability.HYPER_CUTTER), Ability.RESOLUTE,
                UnitConverter.feetToMeters(3, 7), UnitConverter.lbsToKg(639),
                new Stats(0,1,0,0,0,1), 30,
                0.5,
                220, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("The sprig of green onion it holds with it's beak is it's weapon of choice. It makes short work of most foes with a single, deft strike."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,4),
                        new MoveLearnSetEntry(Move.SLASH,9),
                        new MoveLearnSetEntry(Move.AIR_SLASH,12),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,28),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,31),
                        new MoveLearnSetEntry(Move.DRILL_PECK,34),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,38),
                        new MoveLearnSetEntry(Move.WICKED_LASH,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,49)
                        ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setLangFileName("Mallar'Ki");
        this.setPreEvolution("farfetchd");
    }
}
