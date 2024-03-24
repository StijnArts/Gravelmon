package drai.dev.gravelmon.pokemon.kuria;

public class Illuseon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Illuseon() {
        super("Illuseon",
                Type.???,
                new Stats(130,
                        65,
                        60,
                        65,
                        95,
                        110),
                List.of(Ability.MAGICIAN,Ability.SHIELD_DUST), Ability.TRACE,
                11, 377,
                new Stats(2,0,0,0,0,0), 45,
                0.125,
                198, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Illuseon has a magical aura that allows them to control what those around them see. They can disappear in an instant but they're never really gone."),
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
           setLangFileName("Illuseon");

    }


}
