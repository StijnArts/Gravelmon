package drai.dev.gravelmon.pokemon.theos;

public class Moleer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moleer() {
        super("Moleer",
                Type.GROUND,
                new Stats(60,
                        65,
                        60,
                        30,
                        45,
                        70),
                List.of(Ability.INSOMNIA), Ability.SAND_FORCE,
                5, 85,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moleer have very poor eye sight and rely on their sense of smell to know their surroundings. Their tough claws allow them to break through rock with ease."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moleer");

    }


}
