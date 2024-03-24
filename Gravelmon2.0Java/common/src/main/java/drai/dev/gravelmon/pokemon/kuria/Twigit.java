package drai.dev.gravelmon.pokemon.kuria;

public class Twigit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twigit() {
        super("Twigit",
                Type.GRASS,
                new Stats(58,
                        35,
                        65,
                        45,
                        67,
                        50),
                List.of(Ability.OVERGROW), Ability.SUDDENSEED,
                5, 104,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Twigit are rare Pokémon found in deep forests. While typically smug, if they see a Pokémon in need they will do what they can. The bush around their neck will actually grow berries, which they horde for the winter season."),
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
           setLangFileName("Twigit");

    }


}
