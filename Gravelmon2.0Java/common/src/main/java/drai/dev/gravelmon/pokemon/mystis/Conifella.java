package drai.dev.gravelmon.pokemon.mystis;

public class Conifella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conifella() {
        super("Conifella",
                Type.GRASS,Type.FAIRY,
                new Stats(90,
                        80,
                        90,
                        90,
                        90,
                        50),
                List.of(Ability.SNOW_CLOAK,Ability.THICK_FAT), Ability.PERMAFROST,
                109, 3629,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Design Assistance: Scarffles"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conifella");

    }


}
