package drai.dev.gravelmon.pokemon.mystis;

public class Magitate extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magitate() {
        super("Magitate",
                Type.PSYCHIC,Type.DARK,
                new Stats(80,
                        110,
                        70,
                        110,
                        80,
                        60),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magitate");

    }


}
