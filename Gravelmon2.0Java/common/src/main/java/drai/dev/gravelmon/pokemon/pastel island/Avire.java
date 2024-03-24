package drai.dev.gravelmon.pokemon.pastel island;

public class Avire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Avire() {
        super("Avire",
                Type.FIRE,
                new Stats(50,
                        70,
                        40,
                        35,
                        45,
                        60),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                18, 32,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Avire can be very air-headed at times, and may sometimes walk into trees or bushes on accident."),
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
           setLangFileName("Avire");

    }


}
