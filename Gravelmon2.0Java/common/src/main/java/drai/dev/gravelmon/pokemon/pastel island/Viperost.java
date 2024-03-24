package drai.dev.gravelmon.pokemon.pastel island;

public class Viperost extends drai.dev.gravelmon.pokemon.Pokemon {
    public Viperost() {
        super("Viperost",
                Type.WATER,Type.ICE,
                new Stats(85,
                        60,
                        85,
                        60,
                        70,
                        45),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                12, 168,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Viperost are cold killers, they wait patiently in the waters, then bite into their prey, freezing them instantly."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Viperost");

    }


}
