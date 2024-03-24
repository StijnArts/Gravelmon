package drai.dev.gravelmon.pokemon.kuria;

public class Gekroak extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gekroak() {
        super("Gekroak",
                Type.WATER,Type.SOUND,
                new Stats(64,
                        62,
                        72,
                        91,
                        62,
                        64),
                List.of(Ability.TORRENT), Ability.REVERB,
                10, 205,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                155, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("While sometimes found to be mischievous, Gekroak are typically seen as guards of their territory. Each section of the swamp sounds slightly different, this is how you tell which Gekroak own what territory."),
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
           setLangFileName("Gekroak");

    }


}
