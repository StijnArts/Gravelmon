package drai.dev.gravelmon.pokemon.theos;

public class Crysaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crysaur() {
        super("Crysaur",
                Type.ROCK,Type.DRAGON,
                new Stats(65,
                        100,
                        80,
                        40,
                        80,
                        50),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                18, 860,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crysaur love to consume precious stones. Tales tell of Crysaur often eating the entire treasure vaults of Kings back in ancient times."),
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
           setLangFileName("Crysaur");

    }


}
