package drai.dev.gravelmon.pokemon.kuria;

public class Clusteorus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clusteorus() {
        super("Clusteorus",
                Type.ROCK,Type.COSMIC,
                new Stats(65,
                        85,
                        125,
                        45,
                        90,
                        34),
                List.of(Ability.SOLID_ROCK,Ability.ENTERSPHERE), Ability.WEAK_ARMOR,
                13, 1725,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                154, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
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
           setLangFileName("Clusteorus");

    }


}
