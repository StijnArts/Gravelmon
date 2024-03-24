package drai.dev.gravelmon.pokemon.pastel island;

public class Doiliwoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Doiliwoo() {
        super("Doiliwoo",
                Type.GHOST,Type.FAIRY,
                new Stats(71,
                        51,
                        32,
                        74,
                        97,
                        82),
                List.of(Ability.PASTEL_VEIL), Ability.FILTER,
                0, 0,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                142, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of(""),
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
           setLangFileName("Doiliwoo");

    }


}
