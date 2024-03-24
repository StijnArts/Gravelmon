package drai.dev.gravelmon.pokemon.mastenia;

public class Kingaskhan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kingaskhan() {
        super("Kingaskhan",
                Type.FIGHTING,Type.NORMAL,
                new Stats(100,
                        120,
                        90,
                        40,
                        65,
                        95),
                List.of(Ability.RECKLESS,Ability.SCRAPPY), Ability.INNER_FOCUS,
                0, 0,
                new Stats(1,2,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Kingaskhan");

    }


}
