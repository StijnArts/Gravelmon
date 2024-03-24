package drai.dev.gravelmon.pokemon.kuria;

public class Sennitoad extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sennitoad() {
        super("Sennitoad",
                Type.WATER,Type.SOUND,
                new Stats(84,
                        73,
                        92,
                        126,
                        75,
                        85),
                List.of(Ability.TORRENT), Ability.REVERB,
                18, 628,
                new Stats(0,0,0,3,0,0), 0,
                0.875,
                238, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("These Pokémon are rarely seen, and will only come out from the depths of their swamp when their young is in trouble. A single croak can turn a five-story building to rubble."),
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
           setLangFileName("Sennitoad");

    }


}
