package drai.dev.gravelmon.pokemon.kuria;

public class Asawaji extends drai.dev.gravelmon.pokemon.Pokemon {
    public Asawaji() {
        super("Asawaji",
                Type.???,
                new Stats(63,
                        56,
                        78,
                        66,
                        81,
                        116),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                6, 8,
                new Stats(0,0,0,0,0,2), 45,
                0.0,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Most often seen roaming deserted ruins from an age long past, Asawaji act as some sort of defender. Perhaps no one told them the ruins they patrol are no longer in use."),
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
           setLangFileName("Asawaji");

    }


}
