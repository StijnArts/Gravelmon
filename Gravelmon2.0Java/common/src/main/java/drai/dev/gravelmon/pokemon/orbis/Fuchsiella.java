package drai.dev.gravelmon.pokemon.orbis;

public class Fuchsiella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fuchsiella() {
        super("Fuchsiella",
                Type.GRASS,Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLOWER_VEIL), Ability.FLOWER_VEIL,
                6, 110,
                new Stats(0,0,0,0,2,0), 120,
                0.25,
                130, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fuchsiella");

    }


}
