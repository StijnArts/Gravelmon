package drai.dev.gravelmon.pokemon.kuria;

public class Marvelaze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Marvelaze() {
        super("Marvelaze",
                Type.FIRE,Type.FAIRY,
                new Stats(88,
                        55,
                        55,
                        115,
                        95,
                        128),
                List.of(Ability.FLASH_FIRE,Ability.PRESSURE), Ability.SERENE_GRACE,
                10, 195,
                new Stats(0,0,0,0,0,3), 30,
                0.125,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Marvelaze are small but extremely quick Pokémon. It leaves a trail of marvelous fire behind when it flies through the air so that its Embay children can find it."),
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
           setLangFileName("Marvelaze");

    }


}
