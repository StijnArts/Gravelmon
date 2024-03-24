package drai.dev.gravelmon.pokemon.theos;

public class Boomian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boomian() {
        super("Boomian",
                Type.FIGHTING,
                new Stats(60,
                        105,
                        70,
                        120,
                        70,
                        75),
                List.of(Ability.SOUNDPROOF,Ability.RIVALRY), Ability.COMPETITIVE,
                22, 800,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, Boomian immediately challenge the Alpha of their tribe. If they win, they leave their tribe and live in solidarity deeming them as too weak to be around."),
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
           setLangFileName("Boomian");

    }


}
