package drai.dev.gravelmon.pokemon.dhiome;

public class Jagrowth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jagrowth() {
        super("Jagrowth",
                Type.GRASS,Type.POISON,
                new Stats(60,
                        70,
                        60,
                        80,
                        60,
                        75),
                List.of(Ability.OVERGROW), Ability.POISON_POINT,
                9, 225,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("Its thorns secrete a poisonous substance that can paralyze anyone who touches it. It is very territorial."),
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
           setLangFileName("Jagrowth");

    }


}
