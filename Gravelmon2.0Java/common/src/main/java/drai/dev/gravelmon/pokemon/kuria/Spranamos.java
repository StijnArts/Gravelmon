package drai.dev.gravelmon.pokemon.kuria;

public class Spranamos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spranamos() {
        super("Spranamos",
                Type.POISON,Type.FIGHTING,
                new Stats(100,
                        120,
                        94,
                        100,
                        84,
                        72),
                List.of(Ability.INTIMIDATE,Ability.SPICETANK), Ability.RECKLESS,
                19, 1013,
                new Stats(1,2,0,0,0,0), 45,
                0.5,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Spranamos has a growth on its back that is used to mix spices into a concoction of potent poison. It's very spicy, so it's easy to get burned. Some people like the taste."),
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
           setLangFileName("Spranamos");

    }


}
