package drai.dev.gravelmon.pokemon.fliga;

public class Uroshella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Uroshella() {
        super("Uroshella",
                Type.ICE,Type.NORMAL,
                new Stats(77,
                        105,
                        70,
                        108,
                        70,
                        75),
                List.of(Ability.DOUBLETAP), Ability.MEGA_LAUNCHER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Uroshella");

    }


}
