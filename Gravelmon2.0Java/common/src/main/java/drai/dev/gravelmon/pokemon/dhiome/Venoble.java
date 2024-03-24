package drai.dev.gravelmon.pokemon.dhiome;

public class Venoble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Venoble() {
        super("Venoble",
                Type.GRASS,Type.POISON,
                new Stats(75,
                        95,
                        80,
                        115,
                        70,
                        95),
                List.of(Ability.OVERGROW), Ability.POISON_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("Its chest flower wafts a mesmerising aroma. The taller their crown leaves are, the more respect they are treated with."),
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
           setLangFileName("Venoble");

    }


}
