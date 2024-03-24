package drai.dev.gravelmon.pokemon.mystis;

public class Carval extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carval() {
        super("Carval",
                Type.GRASS,Type.STEEL,
                new Stats(90,
                        100,
                        100,
                        70,
                        60,
                        80),
                List.of(Ability.RIVALRY), Ability.DEFIANT,
                51, 2863,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It carves into rocks using its powerful horn. These carvings seem to be warnings and ways to communicate. It uses the end of its tail to file down rocks and remove the carvings. Carval fight among each other to sharpen their horns, leading to many carvings on its body, especially around the face."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,1),
                        new MoveLearnSetEntry(Move.ROYALJOUST,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carval");

    }


}
