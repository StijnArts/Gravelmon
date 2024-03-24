package drai.dev.gravelmon.pokemon.dhiome;

public class Spearex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spearex() {
        super("Spearex",
                Type.GRASS,
                new Stats(45,
                        55,
                        45,
                        60,
                        45,
                        60),
                List.of(Ability.OVERGROW), Ability.POISON_POINT,
                5, 47,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("A scratch from the barb on its chest can render its foes powerless. It lives deep within the northern jungles."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spearex");

    }


}
