package drai.dev.gravelmon.pokemon.theos;

public class Kestric extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kestric() {
        super("Kestric",
                Type.FLYING,Type.ELECTRIC,
                new Stats(60,
                        75,
                        55,
                        55,
                        50,
                        85),
                List.of(Ability.LIMBER), Ability.HUSTLE,
                7, 160,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Kestric are incredibly swift, causing small electrical currents to form behind them as they fly."),
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
           setLangFileName("Kestric");

    }


}
