package drai.dev.gravelmon.pokemon.fliga;

public class Treecko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Treecko() {
        super("Treecko",
                Type.ROCK,
                new Stats(35,
                        65,
                        35,
                        45,
                        55,
                        70),
                List.of(Ability.SAND_FORCE), Ability.UNBURDEN,
                23, 104,
                new Stats(0,1,0,0,0,0), 25,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Living in the rocky mountains of Fliga, Treecko prefer to snack on minerals to provide nutrients to its sturdy skin."),
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
           setLangFileName("Treecko");

    }


}
