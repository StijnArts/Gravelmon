package drai.dev.gravelmon.pokemon.nodorro;

public class Electone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Electone() {
        super("Electone",
                Type.ROCK,Type.ELECTRIC,
                new Stats(55,
                        80,
                        65,
                        95,
                        65,
                        60),
                List.of(Ability.LEVITATE), Ability.LIGHTNING_ROD,
                14, 740,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
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
           setLangFileName("Electone");

    }


}
