package drai.dev.gravelmon.pokemon.fliga;

public class Whiskereef extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whiskereef() {
        super("Whiskereef",
                Type.WATER,
                new Stats(144,
                        63,
                        63,
                        82,
                        95,
                        53),
                List.of(Ability.THICK_FAT,Ability.SANDBATH), Ability.UNAWARE,
                15, 481,
                new Stats(3,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("-WIP-"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SANDYSPLASH,40)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Whiskereef");

    }


}
