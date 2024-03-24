package drai.dev.gravelmon.pokemon.mushi;

public class Bramoth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bramoth() {
        super("Bramoth",
                Type.DARK,Type.FLYING,
                new Stats(75,
                        65,
                        60,
                        125,
                        105,
                        70),
                List.of(Ability.TINTED_LENS), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,3,1,0), 60,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bramoth");

    }


}
