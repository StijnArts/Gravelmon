package drai.dev.gravelmon.pokemon.fliga;

public class Alternatron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Alternatron() {
        super("Alternatron",
                Type.STEEL,
                new Stats(90,
                        90,
                        90,
                        90,
                        90,
                        40),
                List.of(Ability.CALCULATE,Ability.DOWNLOAD), Ability.ANALYTIC,
                14, 2041,
                new Stats(1,0,0,0,0,0), 80,
                0.0,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alternatron");

    }


}
