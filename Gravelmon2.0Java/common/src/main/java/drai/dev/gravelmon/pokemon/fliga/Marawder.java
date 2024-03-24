package drai.dev.gravelmon.pokemon.fliga;

public class Marawder extends drai.dev.gravelmon.pokemon.Pokemon {
    public Marawder() {
        super("Marawder",
                Type.WATER,Type.DARK,
                new Stats(90,
                        120,
                        85,
                        75,
                        65,
                        100),
                List.of(Ability.TORRENT), Ability.GUTS,
                22, 1923,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Marawder are towering, brutal Pokémon that have forsaken their kindly demeanor and have fully adopted their instincts as fighters. That is, that's what they'd like for you to think. In private, Marawder are as jovial as ever."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Marawder");

    }


}
