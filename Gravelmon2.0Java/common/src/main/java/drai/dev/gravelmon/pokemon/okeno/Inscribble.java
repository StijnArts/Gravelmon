package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Inscribble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inscribble() {
        super("Inscribble",
                Type.BUG,Type.FAIRY,
                new Stats(28,
                        30,
                        30,
                        30,
                        30,
                        62),
                List.of(Ability.SHIELD_DUST), Ability.PLOTTWIST,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Inscribble's diet requires substances found in ink that is produced in Okeno. When it overfeeds, its feet release any excess ink as it skitters around, leaving trails behind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,5)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inscribble");

    }


}
