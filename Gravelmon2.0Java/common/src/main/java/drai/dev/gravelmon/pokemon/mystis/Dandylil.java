package drai.dev.gravelmon.pokemon.mystis;

public class Dandylil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dandylil() {
        super("Dandylil",
                Type.GRASS,
                new Stats(50,
                        30,
                        40,
                        70,
                        55,
                        70),
                List.of(Ability.COTTON_DOWN), Ability.RUN_AWAY,
                9, 100,
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
           setLangFileName("Dandylil");

    }


}
