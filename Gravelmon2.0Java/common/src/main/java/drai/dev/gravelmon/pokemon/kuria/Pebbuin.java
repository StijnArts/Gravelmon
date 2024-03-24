package drai.dev.gravelmon.pokemon.kuria;

public class Pebbuin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pebbuin() {
        super("Pebbuin",
                Type.ROCK,
                new Stats(45,
                        54,
                        66,
                        74,
                        66,
                        45),
                List.of(Ability.SOLID_ROCK), Ability.CHLOROPHYLL,
                4, 85,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("Although they aren't capable of long term flight, Pebbuin can lift off the ground just long enough to launch itself at an opponent. They don't hurt much, though."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pebbuin");

    }


}
