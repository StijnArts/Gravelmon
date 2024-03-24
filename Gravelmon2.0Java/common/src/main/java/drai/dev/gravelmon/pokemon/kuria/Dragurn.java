package drai.dev.gravelmon.pokemon.kuria;

public class Dragurn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dragurn() {
        super("Dragurn",
                Type.DRAGON,
                new Stats(50,
                        60,
                        90,
                        60,
                        90,
                        20),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                6, 100,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("When born Dragurn find a vessel to hide within to protect themselves from predators. They will stay in their new-found homes all of their life."),
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
           setLangFileName("Dragurn");

    }


}
