package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranSlugma extends Pokemon {
    public CefiranSlugma(int dexNo) {
        super(dexNo,"CefiranSlugma",
                Type.POISON,
                new Stats(60,40,60,20,70,40),
                List.of(Ability.INFLAMABLE), Ability.WEAK_ARMOR,
                7, 350,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("CefiranMagcargo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.YAWN, 1),
                        new MoveLearnSetEntry(Move.SMOG, 1),
                        new MoveLearnSetEntry(Move.EMBER, 5),
                        new MoveLearnSetEntry(Move.SLUDGE, 10),
                        new MoveLearnSetEntry(Move.HARDEN, 14),
                        new MoveLearnSetEntry(Move.RECOVER, 19),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 23),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 28),
                        new MoveLearnSetEntry(Move.AMNESIA, 32),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 37),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, 41),
                        new MoveLearnSetEntry(Move.BODY_SLAM, 46),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 50),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 55),
                        new MoveLearnSetEntry(Move.ACID_ARMOR, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "egg"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "egg"),
                        new MoveLearnSetEntry(Move.INFERNO, "egg"),
                        new MoveLearnSetEntry(Move.MEMENTO, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, "egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP, "egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE, "egg"),
                        new MoveLearnSetEntry(Move.SWALLOW, "egg")
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 27, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Slugma");
    }
}
