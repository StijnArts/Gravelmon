package drai.dev.gravelmon.pokemon.olysos;

public class Molore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Molore() {
        super("Molore",
                Type.ELECTRIC,Type.GROUND,
                new Stats(50,
                        60,
                        80,
                        35,
                        55,
                        30),
                List.of(Ability.STATIC), Ability.SAND_VEIL,
                4, 65,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Molore is known for its impressive burrowing skills, which it uses to navigate underground tunnels and create its own burrows. Its back is covered in spikey, electrically charged fur that can stun predators, making it difficult for them to attack. Despite its clumsy appearance, Molore is surprisingly quick and nimble when it needs to be, using its sharp claws to dig through soil and rocks."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Molore");

    }


}
