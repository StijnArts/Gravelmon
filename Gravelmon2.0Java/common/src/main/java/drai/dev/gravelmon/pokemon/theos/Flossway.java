package drai.dev.gravelmon.pokemon.theos;

public class Flossway extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flossway() {
        super("Flossway",
                Type.FAIRY,
                new Stats(65,
                        50,
                        60,
                        60,
                        55,
                        50),
                List.of(Ability.SWEET_VEIL), Ability.LINGERING_AROMA,
                4, 35,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Flossway are kind and gentle Pokémon. Whenever you smell a sweet scent in the air, it's likely that a Flossway is nearby."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flossway");

    }


}
