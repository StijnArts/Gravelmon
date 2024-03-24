package drai.dev.gravelmon.pokemon.terranov;

public class Tetsucabra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tetsucabra() {
        super("Tetsucabra",
                Type.ROCK,
                new Stats(105,
                        80,
                        105,
                        55,
                        75,
                        70),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Amphibians with powerful hind legs allowing them to leap up even the steepest of slopes. The terrifying tusks on their enormous jaws allow them to excavate deep trenches, effectively trapping their prey."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tetsucabra");

    }


}
