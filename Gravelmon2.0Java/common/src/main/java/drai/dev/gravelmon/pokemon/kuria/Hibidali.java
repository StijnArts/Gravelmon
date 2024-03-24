package drai.dev.gravelmon.pokemon.kuria;

public class Hibidali extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hibidali() {
        super("Hibidali",
                Type.GRASS,Type.LIGHT,
                new Stats(90,
                        95,
                        60,
                        60,
                        80,
                        95),
                List.of(Ability.HARVEST,Ability.LEAF_GUARD), Ability.FERTILEGIFTS,
                11, 130,
                new Stats(0,1,0,0,0,1), 45,
                0.0,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("Hibidali go from forest to forest to find Pokémon in need and give them one of their berries, as they remember how berries made them grow into what they are now."),
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
           setLangFileName("Hibidali");

    }


}
