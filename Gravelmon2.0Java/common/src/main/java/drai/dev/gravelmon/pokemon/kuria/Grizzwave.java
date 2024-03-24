package drai.dev.gravelmon.pokemon.kuria;

public class Grizzwave extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grizzwave() {
        super("Grizzwave",
                Type.SOUND,Type.DARK,
                new Stats(90,
                        100,
                        50,
                        100,
                        70,
                        130),
                List.of(Ability.TRICKSTER,Ability.COMPETITIVE), Ability.FREESTYLE,
                14, 182,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Grizzwave wants nothing more than to play its sounds for huge crowds. Its speakers are so powerful it can be heard thousands of miles away."),
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
           setLangFileName("Grizzwave");

    }


}
