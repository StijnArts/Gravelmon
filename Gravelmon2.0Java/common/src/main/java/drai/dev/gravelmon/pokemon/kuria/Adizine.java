package drai.dev.gravelmon.pokemon.kuria;

public class Adizine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Adizine() {
        super("Adizine",
                Type.ICE,Type.FIRE,
                new Stats(70,
                        90,
                        60,
                        123,
                        60,
                        109),
                List.of(Ability.BLAST), Ability.THERMALPOWER,
                8, 2565,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                176, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
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
           setLangFileName("Adizine");

    }


}
