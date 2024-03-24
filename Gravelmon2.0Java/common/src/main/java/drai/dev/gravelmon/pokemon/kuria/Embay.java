package drai.dev.gravelmon.pokemon.kuria;

public class Embay extends drai.dev.gravelmon.pokemon.Pokemon {
    public Embay() {
        super("Embay",
                Type.FIRE,Type.FAIRY,
                new Stats(44,
                        35,
                        35,
                        45,
                        70,
                        106),
                List.of(Ability.FLASH_FIRE,Ability.PRESSURE), Ability.SERENE_GRACE,
                1, 1,
                new Stats(0,0,0,0,0,1), 180,
                0.125,
                67, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Embay use their fiery wings to intimidate predators. If that fails, they'll blow a smoke screen to escape, as they are often too passive to fight back."),
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
           setLangFileName("Embay");

    }


}
