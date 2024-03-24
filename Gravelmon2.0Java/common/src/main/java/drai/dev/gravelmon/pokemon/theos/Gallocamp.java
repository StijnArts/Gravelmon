package drai.dev.gravelmon.pokemon.theos;

public class Gallocamp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gallocamp() {
        super("Gallocamp",
                Type.WATER,Type.FAIRY,
                new Stats(55,
                        55,
                        65,
                        95,
                        75,
                        80),
                List.of(Ability.TORRENT), Ability.DAZZLING,
                14, 460,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                143, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Gallocamp are very playful and energetic. They have the ability to run on water, often putting on shows to entertain wild Pokémon."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gallocamp");

    }


}
