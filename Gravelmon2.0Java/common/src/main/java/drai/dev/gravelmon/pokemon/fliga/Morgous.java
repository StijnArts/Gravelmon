package drai.dev.gravelmon.pokemon.fliga;

public class Morgous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Morgous() {
        super("Morgous",
                Type.GHOST,Type.PSYCHIC,
                new Stats(130,
                        105,
                        80,
                        150,
                        135,
                        80),
                List.of(Ability.TIMETWIST), Ability.SOULABSORB,
                33, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("In a time long past, Morgous was a friend to one of the most powerful Pokémon in Fliga, created as a companion. However, when Morgous grew jealous of its creator, it swore it would attain it's power through any means necessary. It's love of curses has corrupted it's body."),
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
           setLangFileName("Morgous");

    }


}
