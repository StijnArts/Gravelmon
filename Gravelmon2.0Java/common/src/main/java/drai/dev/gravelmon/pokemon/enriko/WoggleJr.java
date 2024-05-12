package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class WoggleJr extends drai.dev.gravelmon.pokemon.Pokemon {
    public WoggleJr() {
        super("WoggleJr",
                Type.FIGHTING,
                new Stats(125,
                        75,
                        70,
                        25,
                        60,
                        65),
                List.of(Ability.THICK_FAT), Ability.HUGE_POWER,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.85,
                80, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("(Grease type.) Woggle Jr. communities live a secluded life away from all other Pokemon. It is difficult to find one away from its family."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.DETECT,5),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,9),
                        new MoveLearnSetEntry(Move.GLARE,14),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,17),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,24),
                        new MoveLearnSetEntry(Move.AMNESIA,29),
                        new MoveLearnSetEntry(Move.BOUNCE,34),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Woggle Jr.");

    }


}
