package drai.dev.gravelmon.pokemon.ultraspace;

public class Mushboom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mushboom() {
        super("Mushboom",
                Type.FIRE,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mushboom almost makes you wish for a Nuclear Winter. Its body can reach 100,000,000° Celsius. Its smoke-like cap can cause different hazardous weathers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAZARDCLOUD,1)                        ),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mushboom");

    }


}
