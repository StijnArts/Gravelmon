package drai.dev.gravelmon.pokemon.terranov;

public class Baggi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baggi() {
        super("Baggi",
                Type.ICE,Type.PSYCHIC,
                new Stats(45,
                        30,
                        55,
                        65,
                        65,
                        70),
                List.of(Ability.DREAMTRAP), Ability.DREAMTRAP,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Baggis live in colder regions and are led by an alpha. They are agile and intelligent, and rely on outsmarting their prey instead of using brute strength."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baggi");

    }


}
