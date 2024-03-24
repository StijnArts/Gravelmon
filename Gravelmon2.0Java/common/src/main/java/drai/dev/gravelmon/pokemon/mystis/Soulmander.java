package drai.dev.gravelmon.pokemon.mystis;

public class Soulmander extends drai.dev.gravelmon.pokemon.Pokemon {
    public Soulmander() {
        super("Soulmander",
                Type.FIRE,Type.GHOST,
                new Stats(70,
                        75,
                        50,
                        95,
                        50,
                        140),
                List.of(Ability.LEVITATE,Ability.FLASH_FIRE), Ability.SOULABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("A close relative of Detonewt, assumed to have been extinct for hundreds of years. Latent dragon energy has reawakened it's spirit, and it's soul flame now burns uncontrollably."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Soulmander");

    }


}
