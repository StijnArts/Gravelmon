package drai.dev.gravelmon.pokemon.dhiome;

public class Polynett extends drai.dev.gravelmon.pokemon.Pokemon {
    public Polynett() {
        super("Polynett",
                Type.WATER,
                new Stats(40,
                        55,
                        75,
                        50,
                        65,
                        40),
                List.of(Ability.ARENA_TRAP), Ability.DAMP,
                6, 177,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Polynett");

    }


}
