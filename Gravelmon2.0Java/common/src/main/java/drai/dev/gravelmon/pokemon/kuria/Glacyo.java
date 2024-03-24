package drai.dev.gravelmon.pokemon.kuria;

public class Glacyo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glacyo() {
        super("Glacyo",
                Type.???,
                new Stats(58,
                        85,
                        103,
                        120,
                        85,
                        103),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                10, 100,
                new Stats(0,2,0,2,0,0), 0,
                0.0,
                226, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("These Pokémon were once trusted to guard the secrets of the crystal power. They use Crystail to swarm intruders and then finish them off with a powerful crystal attack. No one knows where they came from."),
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
           setLangFileName("Glacyo");

    }


}
