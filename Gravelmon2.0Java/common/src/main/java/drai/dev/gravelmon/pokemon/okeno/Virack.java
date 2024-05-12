package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Virack extends drai.dev.gravelmon.pokemon.Pokemon {
    public Virack() {
        super("Virack",
                Type.ELECTRIC, Type.POISON,
                new Stats(66,
                        53,
                        63,
                        86,
                        90,
                        76),
                List.of(Ability.DOWNLOAD), Ability.DOWNLOAD,
                8, 165,
                new Stats(0,0,0,2,0,0), 70,
                0.0,
                154, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("These Pokemon live in abandoned laboratories, where they feed from old generators and chemical substances. Gatherings of them can lead computers to malfunction."),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Virack");

    }


}
