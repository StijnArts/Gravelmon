package drai.dev.gravelmon.pokemon.mongratis;

public class Merlicun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Merlicun() {
        super("Merlicun",
                Type.DRAGON,Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TINTED_LENS), Ability.TINTED_LENS,
                8, 22,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Merlicun is a hardy insect creature that has evolved to be efficient at both attack and defense. They gather in the tree canopies of ancient forests to feed on fruits and leaves. When threatened they will first size up their opponent. If they feel as though they can win they will relentlessly headbutt their foe. But, if they appear to be overpowered they will compress their body into what resembles pupae and focus on defending themselves."),
                List.of(),
                List.of(                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Merlicun");

    }


}
