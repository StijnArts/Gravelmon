package drai.dev.gravelmon.pokemon.urzavos;

public class Snatchirp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snatchirp() {
        super("Snatchirp",
                Type.DARK,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.PICKPOCKET), Ability.PICKUP,
                4, 91,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("These 'Mons are known to be bold enough to steal items right off of people, in broad daylight! They are obsessed with treasure, and often pick fight with other birds for their items."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snatchirp");

    }


}
