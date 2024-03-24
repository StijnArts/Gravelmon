package drai.dev.gravelmon.pokemon.nodorro;

public class Particoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Particoon() {
        super("Particoon",
                Type.BUG,
                new Stats(75,
                        50,
                        95,
                        70,
                        95,
                        20),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                4, 400,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has always been believed that this Pokemon has strong connections to the moon. As such, ancient cultures would keep and praise these Pokemon in hopes of appeasing the god of night."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Particoon");

    }


}
