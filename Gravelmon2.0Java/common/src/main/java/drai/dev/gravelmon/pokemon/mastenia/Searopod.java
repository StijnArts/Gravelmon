package drai.dev.gravelmon.pokemon.mastenia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Searopod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Searopod() {
        super("Searopod",
                Type.FIRE,Type.ROCK,
                new Stats(107,
                        86,
                        102,
                        86,
                        84,
                        67),
                List.of(Ability.BLAZE), Ability.DROUGHT,
                30, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Searopod are docile and friendly Pokémon. Don't mistake their kindness for weakness however as they can pack a powerful swing with their long necks along with their beaks. The leaves they gather from the tallest of trees are burnt to a crisp and makes a good meal."),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Searopod");

    }


}
