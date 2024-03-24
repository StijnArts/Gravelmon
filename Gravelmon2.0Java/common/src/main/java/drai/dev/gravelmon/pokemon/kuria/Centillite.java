package drai.dev.gravelmon.pokemon.kuria;

public class Centillite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Centillite() {
        super("Centillite",
                Type.BUG,
                new Stats(45,
                        35,
                        70,
                        20,
                        35,
                        25),
                List.of(Ability.COMPOUND_EYES), Ability.SIGNALBOOST,
                3, 19,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Centillite is baffling to scientists. Their strange structure allows them to give off odd signals that appears to be how they communicate with others of their kind. Some believe they are even trying to communicate with other planets."),
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
           setLangFileName("Centillite");

    }


}
