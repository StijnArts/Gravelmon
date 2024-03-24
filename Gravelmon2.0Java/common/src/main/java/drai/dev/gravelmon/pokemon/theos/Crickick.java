package drai.dev.gravelmon.pokemon.theos;

public class Crickick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crickick() {
        super("Crickick",
                Type.BUG,Type.FIGHTING,
                new Stats(60,
                        120,
                        80,
                        50,
                        60,
                        85),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                6, 108,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ability: Lead Foot - Boosts the power of 'kicking' moves"),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crickick");

    }


}
