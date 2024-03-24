package drai.dev.gravelmon.pokemon.kuria;

public class Bluble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bluble() {
        super("Bluble",
                Type.WATER,Type.COSMIC,
                new Stats(50,
                        30,
                        60,
                        60,
                        60,
                        57),
                List.of(Ability.UNAWARE,Ability.OVERCOAT), Ability.WATER_BUBBLE,
                4, 104,
                new Stats(0,0,0,0,1,0), 150,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Bluble are seen as the most adorable cosmic Pokémon that exist. Their odd ears release a liquid that protects it from harm, necessary to survive in the rough cosmos."),
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
           setLangFileName("Bluble");

    }


}
