package drai.dev.gravelmon.pokemon.kuria;

public class Chichaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chichaw() {
        super("Chichaw",
                Type.GROUND,
                new Stats(55,
                        75,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.SAND_FORCE,Ability.STRONG_JAW), Ability.GLUTTONY,
                5, 130,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                74, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Chichaw show how they feel by how they bite you. Depending on if it bites gently or bites through flesh, it shows if it likes or dislikes you. Though even the gentle bites hurt."),
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
           setLangFileName("Chichaw");

    }


}
