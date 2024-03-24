package drai.dev.gravelmon.pokemon.theos;

public class Squibble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squibble() {
        super("Squibble",
                Type.NORMAL,
                new Stats(40,
                        65,
                        40,
                        65,
                        40,
                        65),
                List.of(Ability.STEADFAST), Ability.FRISK,
                4, 36,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                63, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Squibble never stay still and are always on the look out for berries to store in trees. When startled, they will bite onto their attacker with their strong front teeth."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squibble");

    }


}
