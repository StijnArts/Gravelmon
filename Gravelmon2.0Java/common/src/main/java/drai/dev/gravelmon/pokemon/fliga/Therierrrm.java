package drai.dev.gravelmon.pokemon.fliga;

public class Therierrrm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Therierrrm() {
        super("Therierrrm",
                Type.GROUND,Type.NORMAL,
                new Stats(130,
                        130,
                        125,
                        35,
                        65,
                        60),
                List.of(Ability.OBLIVIOUS), Ability.POISON_HEAL,
                20, 1305,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                252, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Therierrrm is theorized to have evolved as a result of an actively detrimental diet fully degrading it's intelligence. Therierrrm have incredibly strong arms, capable of digging deep holes or throwing objects long distances."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Therierrrm");

    }


}
