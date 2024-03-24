package drai.dev.gravelmon.pokemon.urzavos;

public class Scuffrel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scuffrel() {
        super("Scuffrel",
                Type.NORMAL,Type.FIGHTING,
                new Stats(66,
                        90,
                        76,
                        50,
                        64,
                        94),
                List.of(Ability.PICKUP,Ability.MOXIE), Ability.SCRAPPY,
                9, 299,
                new Stats(0,0,0,0,0,0), 127,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Scuffrel get into frequent battles with neighboring 'Mons for both territory and to test their abilities. Bird 'Mons of all kinds are their mortal enemies, and they will attack them on sight."),
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
           setLangFileName("Scuffrel");

    }


}
