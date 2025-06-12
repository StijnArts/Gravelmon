package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranMagcargo extends Pokemon {
    public CefiranMagcargo(String name, Aspect aspect) {
        super(name, aspect,"CefiranMagcargo",
                Type.POISON, Type.STEEL,
                new Stats(70,50,140,30,100,80),
                List.of(Ability.INFLAMABLE), Ability.WEAK_ARMOR,
                8, 550,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                144, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.YAWN, 1),
                        new MoveLearnSetEntry(Move.SMOG, 1),
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.SLUDGE, 1),
                        new MoveLearnSetEntry(Move.EMBER, 5),
                        new MoveLearnSetEntry(Move.SLUDGE, 10),
                        new MoveLearnSetEntry(Move.HARDEN, 14),
                        new MoveLearnSetEntry(Move.RECOVER, 19),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 23),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 28),
                        new MoveLearnSetEntry(Move.AMNESIA, 32),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 37),
                        new MoveLearnSetEntry(Move.SHELL_SMASH, 38),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 44),
                        new MoveLearnSetEntry(Move.BODY_SLAM, 52),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 59),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 67),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 56, 0.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Magcargo");
    }
}
