package drai.dev.gravelmon.pokemon.orbis;

public class Jolteon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jolteon() {
        super("Jolteon",
                Type.ELECTRIC,
                new Stats(65,
                        65,
                        60,
                        110,
                        95,
                        130),
                List.of(Ability.VOLT_ABSORB), Ability.QUICK_FEET,
                8, 245,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its cells generate weak power that is amplified by its fur's static electricity to drop thunderbolts. The bristling fur is made of electrically charged needles."),
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
           setLangFileName("Jolteon");

    }


}
