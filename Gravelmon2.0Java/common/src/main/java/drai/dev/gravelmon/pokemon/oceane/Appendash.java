package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Appendash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Appendash() {
        super("Appendash",
                Type.WATER,
                new Stats(75,
                        105,
                        75,
                        55,
                        65,
                        85),
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It travels for miles across the ocean seeking beautiful fish to attach to its body. If it loses its group of followers it will grow incredibly weak and die out of vanity. The followers will put their lives on the line to defend Appendash."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWAGGER,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Appendash");

    }


}
