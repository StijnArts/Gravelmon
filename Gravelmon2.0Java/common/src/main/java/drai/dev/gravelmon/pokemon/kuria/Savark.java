package drai.dev.gravelmon.pokemon.kuria;

public class Savark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Savark() {
        super("Savark",
                Type.GRASS,Type.NORMAL,
                new Stats(88,
                        115,
                        80,
                        52,
                        70,
                        91),
                List.of(Ability.UNNERVE,Ability.PICKUP), Ability.VERMILINGUA,
                21, 946,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Savark live on a diet of solely Bug-type Pokémon. Once it sees one, it will not stop hunting it down until either the bug or itself goes down."),
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
           setLangFileName("Savark");

    }


}
