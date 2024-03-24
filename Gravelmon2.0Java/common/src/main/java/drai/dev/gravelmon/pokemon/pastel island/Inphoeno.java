package drai.dev.gravelmon.pokemon.pastel island;

public class Inphoeno extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inphoeno() {
        super("Inphoeno",
                Type.FIRE,
                new Stats(80,
                        120,
                        70,
                        75,
                        70,
                        115),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                21, 391,
                new Stats(0,3,0,0,0,0), 70,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("A graceful Pokémon with powerful legs. By infusing their legs with heat, they can increase their kicks' power tenfold."),
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
           setLangFileName("Inphoeno");

    }


}
