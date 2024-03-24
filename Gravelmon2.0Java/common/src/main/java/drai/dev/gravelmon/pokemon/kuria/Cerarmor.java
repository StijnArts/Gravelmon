package drai.dev.gravelmon.pokemon.kuria;

public class Cerarmor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cerarmor() {
        super("Cerarmor",
                Type.FIRE,Type.SOUND,
                new Stats(91,
                        99,
                        100,
                        123,
                        100,
                        42),
                List.of(Ability.ROARINGHORN), Ability.ROARINGHORN,
                22, 2715,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of(""),
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
           setLangFileName("Cerarmor");

    }


}
