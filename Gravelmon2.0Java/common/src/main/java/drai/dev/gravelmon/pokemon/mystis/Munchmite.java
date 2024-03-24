package drai.dev.gravelmon.pokemon.mystis;

public class Munchmite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Munchmite() {
        super("Munchmite",
                Type.GRASS,Type.BUG,
                new Stats(75,
                        30,
                        45,
                        75,
                        55,
                        40),
                List.of(Ability.OVERGROW), Ability.TRIAGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of("It thrives in swarms, and can often be found lurking around all kinds of forests. It's best not to disturb them, as they are incredibly shy."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Munchmite");

    }


}
