package drai.dev.gravelmon.pokemon.urzavos;

public class Injelligent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Injelligent() {
        super("Injelligent",
                Type.WATER,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.TORRENT,
                17, 363,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Cold and calculating, this 'Mon will not hesitate to bring down a foe by any means necessary. It often times itself to see just how fast it can dispatch its opponents, and often treats battling like solving a puzzle."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Injelligent");

    }


}
