package drai.dev.gravelmon.pokemon.fliga;

public class Hullk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hullk() {
        super("Hullk",
                Type.STEEL,Type.FIRE,
                new Stats(127,
                        67,
                        191,
                        109,
                        53,
                        23),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(0,0,3,0,0,0), 45,
                0.0,
                231, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-027 Titan. A member of an Ultra Beast family. It's flames that burn from it's presumed mouth never peter out, even in rain. It can emit such a bright light that it can give the illusion of a sunrise at midnight."),
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
           setLangFileName("Hullk");

    }


}
