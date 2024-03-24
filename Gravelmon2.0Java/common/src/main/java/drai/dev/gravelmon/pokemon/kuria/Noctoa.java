package drai.dev.gravelmon.pokemon.kuria;

public class Noctoa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Noctoa() {
        super("Noctoa",
                Type.NORMAL,Type.DARK,
                new Stats(63,
                        95,
                        60,
                        60,
                        60,
                        94),
                List.of(Ability.INFILTRATOR), Ability.SHADOW_TAG,
                9, 92,
                new Stats(0,2,0,0,0,1), 120,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Noctoa differ in day and night. During the day, Noctoa is as kind as it was as a Biroo. But at night, it becomes a truly violent monstrosity."),
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
           setLangFileName("Noctoa");

    }


}
