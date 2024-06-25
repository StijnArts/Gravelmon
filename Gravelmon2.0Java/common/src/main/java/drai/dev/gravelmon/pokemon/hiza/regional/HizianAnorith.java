package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianAnorith extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianAnorith(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Anorith",
                Type.BUG, Type.DRAGON,
                new Stats(45,
                        95,
                        50,
                        40,
                        50,
                        75),
                List.of(Ability.OUTBURST), Ability.OUTBURST,
                10, 165,
                new Stats(0,1,0,0,0,0), 90,
                0.5,
                71, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Reanimated from an unusually large Claw Fossil, it has powerful serrated claws capable of crushing even the hardest shell."),
                List.of(new EvolutionEntry("HizianArmaldo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TWINEEDLE,10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,20),
                        new MoveLearnSetEntry(Move.BUG_BITE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,30),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,35),
                        new MoveLearnSetEntry(Move.XSCISSOR,40),
                        new MoveLearnSetEntry(Move.BRACE,45),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm")
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 35, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Anorith");

    }


}
