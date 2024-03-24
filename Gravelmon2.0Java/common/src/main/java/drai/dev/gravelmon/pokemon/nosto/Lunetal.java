package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lunetal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lunetal() {
        super("Lunetal",
                Type.STEEL,Type.NORMAL,
                new Stats(58,
                        75,
                        50,
                        55,
                        62,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 165,
                new Stats(0,1,0,0,0,1), 90,
                0.5,
                140, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("galextrial", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(              new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,8),
                        new MoveLearnSetEntry(Move.STEEL_WING,16),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,26),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58),
                        new MoveLearnSetEntry(Move.EXPLOSION,68),
                        new MoveLearnSetEntry(Move.METEOR_MASH,78),
                        new MoveLearnSetEntry(Move.DOOM_DESIRE,88),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,98)           ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
