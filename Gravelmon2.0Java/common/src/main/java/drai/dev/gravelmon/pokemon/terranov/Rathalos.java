package drai.dev.gravelmon.pokemon.terranov;

public class Rathalos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rathalos() {
        super("Rathalos",
                Type.FIRE,Type.FLYING,
                new Stats(80,
                        100,
                        70,
                        110,
                        70,
                        115),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rathalos");

    }


}
