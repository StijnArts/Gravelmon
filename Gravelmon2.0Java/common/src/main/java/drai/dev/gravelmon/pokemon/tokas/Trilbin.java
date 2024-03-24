package drai.dev.gravelmon.pokemon.tokas;

public class Trilbin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trilbin() {
        super("Trilbin",
                Type.FLYING,Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GALE_WINGS), Ability.SOUNDPROOF,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Trilbin are a common sight in Tokas. In the early mornings their songs can be heard, waking up people with gentle tunes."),
                List.of(),
                List.of(                        ),
                List.of(Label.TOKAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trilbin");

    }


}
