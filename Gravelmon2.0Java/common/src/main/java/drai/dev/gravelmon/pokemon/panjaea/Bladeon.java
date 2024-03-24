package drai.dev.gravelmon.pokemon.panjaea;

public class Bladeon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bladeon() {
        super("Bladeon",
                Type.STEEL,
                new Stats(65,
                        130,
                        110,
                        60,
                        65,
                        95),
                List.of(Ability.CLEAR_BODY), Ability.SHARPNESS,
                8, 310,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.PANJAEA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bladeon");

    }


}
