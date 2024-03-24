package drai.dev.gravelmon.pokemon.dhiome;

public class Wisdaum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wisdaum() {
        super("Wisdaum",
                Type.NORMAL,Type.PSYCHIC,
                new Stats(110,
                        128,
                        66,
                        101,
                        88,
                        67),
                List.of(Ability.WONDER_SKIN,Ability.SUPER_LUCK), Ability.UNAWARE,
                17, 1256,
                new Stats(2,3,0,0,0,0), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("It lives in seclusion, defending its tail with its four hands. It is said that the sound of its tail is the sound of enlightenment itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wisdaum");

    }


}
