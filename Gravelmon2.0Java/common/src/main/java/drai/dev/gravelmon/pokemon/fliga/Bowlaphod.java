package drai.dev.gravelmon.pokemon.fliga;

public class Bowlaphod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bowlaphod() {
        super("Bowlaphod",
                Type.GROUND,Type.BUG,
                new Stats(80,
                        75,
                        100,
                        70,
                        75,
                        80),
                List.of(Ability.HEATPROOF,Ability.SAND_RUSH), Ability.EARTH_EATER,
                10, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("Bowlaphods are used to the high temperature in Fliga, and have adapted to make sure they don't roast in the intense heat. They roll wet balls of mud and dung and bury the ball for their young."),
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
           setLangFileName("Bowlaphod");

    }


}
