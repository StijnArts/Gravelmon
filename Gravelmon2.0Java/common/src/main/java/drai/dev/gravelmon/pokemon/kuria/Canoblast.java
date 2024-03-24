package drai.dev.gravelmon.pokemon.kuria;

public class Canoblast extends drai.dev.gravelmon.pokemon.Pokemon {
    public Canoblast() {
        super("Canoblast",
                Type.FIGHTING,Type.STEEL,
                new Stats(85,
                        90,
                        110,
                        130,
                        80,
                        35),
                List.of(Ability.LASTBASTION), Ability.LASTBASTION,
                17, 652,
                new Stats(0,0,1,2,0,0), 95,
                0.0,
                201, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canoblast's wheels have flattened, allowing it large defensive shields in place of its speed. The cannon has been optimized so it may launch long-range blasts."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Canoblast");

    }


}
