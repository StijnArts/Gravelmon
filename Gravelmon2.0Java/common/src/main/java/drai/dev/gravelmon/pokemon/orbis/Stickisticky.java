package drai.dev.gravelmon.pokemon.orbis;

public class Stickisticky extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stickisticky() {
        super("Stickisticky",
                Type.FAIRY,
                new Stats(110,
                        45,
                        30,
                        75,
                        150,
                        45),
                List.of(Ability.THICK_FAT,Ability.SWEET_VEIL), Ability.MISTY_SURGE,
                8, 130,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of("- Explosion Normal - Misty ExplosionSTAB Fairy - Play Nice Normal - Stockpile Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stickisticky");

    }


}
