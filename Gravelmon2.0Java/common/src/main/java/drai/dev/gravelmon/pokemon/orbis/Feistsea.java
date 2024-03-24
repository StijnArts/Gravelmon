package drai.dev.gravelmon.pokemon.orbis;

public class Feistsea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Feistsea() {
        super("Feistsea",
                Type.NORMAL,Type.WATER,
                new Stats(70,
                        80,
                        30,
                        40,
                        55,
                        60),
                List.of(Ability.COMPETITIVE), Ability.COMPETITIVE,
                5, 170,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Feistsea");

    }


}
