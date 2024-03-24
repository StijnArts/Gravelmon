package drai.dev.gravelmon.pokemon.pastel island;

public class Cobblelf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cobblelf() {
        super("Cobblelf",
                Type.FAIRY,
                new Stats(45,
                        35,
                        60,
                        45,
                        65,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 15,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cobblelf");

    }


}
