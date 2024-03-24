package drai.dev.gravelmon.pokemon.kuria;

public class Evercle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Evercle() {
        super("Evercle",
                Type.WATER,Type.???,
                new Stats(95,
                        70,
                        70,
                        110,
                        96,
                        79),
                List.of(Ability.MADNESS,Ability.SWIFT_SWIM), Ability.TRACE,
                14, 346,
                new Stats(1,0,0,1,1,0), 75,
                0.25,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Evercle come across as friendly, but beware of the large beak they have beneath their tentacles. They often quarrel with Jellectric."),
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
           setLangFileName("Evercle");

    }


}
