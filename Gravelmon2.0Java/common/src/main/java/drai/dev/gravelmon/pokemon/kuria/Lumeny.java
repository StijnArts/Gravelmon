package drai.dev.gravelmon.pokemon.kuria;

public class Lumeny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lumeny() {
        super("Lumeny",
                Type.LIGHT,Type.???,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.SOOTHINGSHINE), Ability.SOOTHINGSHINE,
                4, 14,
                new Stats(1,1,1,1,1,1), 0,
                0.0,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Lumeny is a very gentle Pokémon and prefers not to fight, but instead to help. The soothing light coming from its antenna and tails gives a warm feeling that can make other Pokémon and even people feel a lot better."),
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
           setLangFileName("Lumeny");

    }


}
