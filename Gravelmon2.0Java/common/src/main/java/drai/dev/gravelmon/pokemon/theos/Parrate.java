package drai.dev.gravelmon.pokemon.theos;

public class Parrate extends drai.dev.gravelmon.pokemon.Pokemon {
    public Parrate() {
        super("Parrate",
                Type.FLYING,Type.WATER,
                new Stats(80,
                        100,
                        60,
                        100,
                        60,
                        95),
                List.of(Ability.PICKPOCKET), Ability.WIND_RIDER,
                15, 600,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A single Parrate often leads a crew of a dozen Gulling. They patrol beaches and boardwalks snatching anything shiny they can find."),
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
           setLangFileName("Parrate");

    }


}
