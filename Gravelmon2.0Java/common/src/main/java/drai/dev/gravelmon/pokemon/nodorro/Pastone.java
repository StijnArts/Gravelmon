package drai.dev.gravelmon.pokemon.nodorro;

public class Pastone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pastone() {
        super("Pastone",
                Type.ROCK,Type.GRASS,
                new Stats(80,
                        90,
                        80,
                        60,
                        65,
                        45),
                List.of(Ability.GREENTHUMB), Ability.GREENTHUMB,
                15, 1200,
                new Stats(0,1,1,0,0,0), 100,
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
           setLangFileName("Pastone");

    }


}
