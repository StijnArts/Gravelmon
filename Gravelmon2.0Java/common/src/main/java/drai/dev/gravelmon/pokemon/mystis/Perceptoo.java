package drai.dev.gravelmon.pokemon.mystis;

public class Perceptoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Perceptoo() {
        super("Perceptoo",
                Type.PSYCHIC,Type.FLYING,
                new Stats(43,
                        70,
                        36,
                        75,
                        39,
                        77),
                List.of(Ability.INSOMNIA,Ability.PERCEIVE), Ability.CLAIRVOYANCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It can use the blue spot on its forehead to see the future. Judging by how it reacts shortly after, a trainer can somewhat tell whats going to happen."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Perceptoo");

    }


}
