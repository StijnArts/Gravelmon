package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Midnaught extends drai.dev.gravelmon.pokemon.Pokemon {
    public Midnaught() {
        super("Midnaught",
                Type.STEEL, Type.GHOST,
                new Stats(66,
                        119,
                        110,
                        87,
                        90,
                        43),
                List.of(Ability.TIMETWIST), Ability.TIMETWIST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Midnaught are allegedly found in graveyards because they absorb energy of spirits leaving this world. 'Hear its call twelve times, and the end is nigh'."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,"tm"),
                        new MoveLearnSetEntry(Move.TEATIME,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Midnaught");

    }


}
