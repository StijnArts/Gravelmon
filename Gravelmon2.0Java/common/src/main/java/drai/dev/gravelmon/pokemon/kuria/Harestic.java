package drai.dev.gravelmon.pokemon.kuria;

public class Harestic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harestic() {
        super("Harestic",
                Type.GRASS,Type.???,
                new Stats(72,
                        55,
                        75,
                        75,
                        87,
                        51),
                List.of(Ability.OVERGROW), Ability.SUDDENSEED,
                10, 175,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                153, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Harestic mystify audiences by quickly disappearing from one place and reappearing in another. They are known for playing innocent tricks."),
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
           setLangFileName("Harestic");

    }


}
