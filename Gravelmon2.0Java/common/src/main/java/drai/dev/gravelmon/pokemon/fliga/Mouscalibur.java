package drai.dev.gravelmon.pokemon.fliga;

public class Mouscalibur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mouscalibur() {
        super("Mouscalibur",
                Type.FAIRY,Type.ELECTRIC,
                new Stats(65,
                        127,
                        41,
                        107,
                        42,
                        93),
                List.of(Ability.LIGHTNING_ROD), Ability.TECHNICIAN,
                14, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mouscalibur are valiant defenders of both trainers both physical and digital. When it sees people bullying others online, it will personally track them down and destroy the device they most favor."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mouscalibur");

    }


}
