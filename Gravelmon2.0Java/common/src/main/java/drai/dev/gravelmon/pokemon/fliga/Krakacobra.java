package drai.dev.gravelmon.pokemon.fliga;

public class Krakacobra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Krakacobra() {
        super("Krakacobra",
                Type.GROUND,Type.ELECTRIC,
                new Stats(60,
                        92,
                        60,
                        87,
                        68,
                        128),
                List.of(Ability.VOLT_ABSORB,Ability.SAND_FORCE), Ability.RECKLESS,
                27, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Krakacobra contain high-energy plasma within its translucent body, which it shoots out when slithering at high speeds. It creates a thundercloud on its head that zaps anything that dares to attack it."),
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
           setLangFileName("Krakacobra");

    }


}
