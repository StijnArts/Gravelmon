package drai.dev.gravelmon.pokemon.pastel island;

public class Drasilis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drasilis() {
        super("Drasilis",
                Type.BUG,Type.DRAGON,
                new Stats(58,
                        35,
                        85,
                        35,
                        86,
                        50),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                9, 180,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                122, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Statuesque and solid like rock, these Pokémon remain still while their bodies metamorphose inside. They are also surprisingly warm and used as pillows by some."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drasilis");

    }


}
