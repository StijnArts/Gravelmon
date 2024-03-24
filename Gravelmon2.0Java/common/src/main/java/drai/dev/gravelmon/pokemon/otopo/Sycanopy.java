package drai.dev.gravelmon.pokemon.otopo;

public class Sycanopy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sycanopy() {
        super("Sycanopy",
                Type.GRASS,Type.GROUND,
                new Stats(105,
                        70,
                        85,
                        110,
                        70,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(1,0,0,2,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Sycanopy live for a very long period and see the numerous changes in Otopo. Many Bug and Normal-type Pokémon may be found in its canopy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sycanopy");

    }


}
