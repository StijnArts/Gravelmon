package drai.dev.gravelmon.pokemon.theos;

public class Bunursery extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bunursery() {
        super("Bunursery",
                Type.FAIRY,
                new Stats(120,
                        75,
                        85,
                        75,
                        85,
                        70),
                List.of(Ability.CUTE_CHARM,Ability.FRIEND_GUARD), Ability.CLOUD_NINE,
                15, 250,
                new Stats(3,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bunursery are very caring and calm Pokémon. Daycares often work along side them as they're very good with young Pokémon and taking care of Pokémon Eggs."),
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
           setLangFileName("Bunursery");

    }


}
