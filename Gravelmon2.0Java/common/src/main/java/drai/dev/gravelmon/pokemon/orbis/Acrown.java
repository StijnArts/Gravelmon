package drai.dev.gravelmon.pokemon.orbis;

public class Acrown extends drai.dev.gravelmon.pokemon.Pokemon {
    public Acrown() {
        super("Acrown",
                Type.GRASS,
                new Stats(45,
                        80,
                        90,
                        25,
                        30,
                        50),
                List.of(Ability.CHLOROPHYLL,Ability.ROCK_HEAD), Ability.SHEER_FORCE,
                2, 20,
                new Stats(0,0,1,0,0,0), 205,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Self-Destruct Normal - Growth Normal - Branch PokeSTAB Grass - Wood HammerSTAB Grass - Uproar Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Acrown");

    }


}
