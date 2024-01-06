package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianDunsparce extends Pokemon {
    public HoennianDunsparce(int dexNo) {
        super(dexNo,"HoennianDunsparce",
                Type.NORMAL, Type.ELECTRIC,
                new Stats(50, 70, 85, 65, 80, 65),
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                UnitConverter.feetToMeters(4, 7), UnitConverter.lbsToKg(267),
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("This Pokemon's eyesight is so poor that it can barely see objects directly in front of it. It escapes predators by shocking them with its electric tail."),
                List.of(new EvolutionEntry("drasparath", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.YAWN,6),
                        new MoveLearnSetEntry(Move.SPARK,9),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,14),
                        new MoveLearnSetEntry(Move.BODY_SLAM,23),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,33),
                        new MoveLearnSetEntry(Move.SCREECH,37),
                        new MoveLearnSetEntry(Move.THUNDER,42),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,46)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN2),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 41, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "false"),
                        new SpawnCondition(SpawnConditionType.MAXY, "20")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))),
                List.of(SpawnPreset.UNDERGROUND),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Dunsparce");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
