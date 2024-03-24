package drai.dev.gravelmon.pokemon.mystis;

public class Cocadoom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cocadoom() {
        super("Cocadoom",
                Type.PSYCHIC,Type.FLYING,
                new Stats(73,
                        85,
                        66,
                        85,
                        69,
                        107),
                List.of(Ability.INSOMNIA,Ability.PERCEIVE), Ability.CLAIRVOYANCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("The reason Pokémon constantly looks worried is because of what it sees in the future. It is believed to be able to temporarily project these visions onto others, sending them into fits of madness."),
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
           setLangFileName("Cocadoom");

    }


}
