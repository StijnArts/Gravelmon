package drai.dev.data.games.pbs;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.solarlightlunardark.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class SolarLightLunarDark extends drai.dev.data.games.registry.Game {
	public static final Game INSTANCE = new SolarLightLunarDark();
	private SolarLightLunarDark() {
        super("SolarLightLunarDark");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Herovor().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Forestone().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Mountree().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Purrlit().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Purryo().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Flearoe().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).addLabels(Label.STARTER));
        addNewPokemon(new Salatad().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanSwimInWater(true).setCanBreatheUnderwater(true).fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Salanip().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanSwimInWater(true).setCanBreatheUnderwater(true).addLabels(Label.STARTER));
        addNewPokemon(new Salaslam().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .starter()
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP)
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanSwimInWater(true).setCanBreatheUnderwater(true).addLabels(Label.STARTER));
        addNewPokemon(new Hamstar().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(4).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snuffuzz().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(19).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Budcheep().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Budcherp().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(15).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Budsoar().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(30).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Elecritter().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Weashock().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Stickit().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Stickut().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cheepip().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(4).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aeroma().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lavenseed().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FLORAL)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lavenbelle().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(15).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FLORAL)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lavenrina().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(29).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FLORAL)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Moonky().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lunape().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tadart().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dartoad().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Doveheart().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(14).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                .setSpawnPreset(SpawnPreset.VILLAGE).build()));
        addNewPokemon(new Spidox().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(2).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Widox().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Glowig().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST).atNight()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Glocoon().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST).atNight()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Glowing().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FOREST).atNight()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Stotox().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(50)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bouldox().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(26).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(50)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Crystox().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(50)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jumple().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Casspring().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(22).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Flowby().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanFly(true));
        addNewPokemon(new Nimblow().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanFly(true));
        addNewPokemon(new Cirribus().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(40).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanFly(true));
        addNewPokemon(new Pixwee().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(6).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FLORAL).setAntiBiomes(Biome.IS_PLAINS).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pixilily().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_FLORAL).setAntiBiomes(Biome.IS_PLAINS).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Ugling().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP, Biome.IS_FLORAL).canSeeSky()
                .setSpawnPreset(SpawnPreset.NEAR_WATER).build()).setCanBreatheUnderwater(true).setCanSwimInWater(true));
        addNewPokemon(new Swellegant().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP, Biome.IS_FLORAL).canSeeSky()
                .setSpawnPreset(SpawnPreset.NEAR_WATER).build()).setCanBreatheUnderwater(true).setCanSwimInWater(true));
        addNewPokemon(new Angling().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.SUBMERGED)
                .setBiomes(Biome.IS_RIVER).canSeeSky()
                .setSpawnPreset(SpawnPreset.UNDERWATER).build()).fishingSpawnFromExisting().setAquatic());
        addNewPokemon(new Angelish().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.SUBMERGED)
                .setBiomes(Biome.IS_RIVER).canSeeSky()
                .setSpawnPreset(SpawnPreset.UNDERWATER).build()).fishingSpawnFromExisting().setAquatic());
        addNewPokemon(new Angelight().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.SUBMERGED)
                .setBiomes(Biome.IS_RIVER).canSeeSky()
                .setSpawnPreset(SpawnPreset.UNDERWATER).build()).fishingSpawnFromExisting().setAquatic());
        addNewPokemon(new Rubball().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                .setSpawnPreset(SpawnPreset.VILLAGE).build()));
        addNewPokemon(new Rubbunny().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(25).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                .setSpawnPreset(SpawnPreset.VILLAGE).build()));

        addNewPokemon(new Aquad().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.SUBMERGED)
                .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                .setSpawnPreset(SpawnPreset.UNDERWATER).build()));
        addNewPokemon(new Smaqua().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(28).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.SUBMERGED)
                .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                .setSpawnPreset(SpawnPreset.UNDERWATER).build()));
        addNewPokemon(new Vennap().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_JUNGLE)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Monstrap().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_JUNGLE)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lophug().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SPOOKY).duringDaytime()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Beopup().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SPOOKY)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Werehide().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                .setContext(SpawnContext.GROUNDED).atNight()
                .setBiomes(Biome.IS_SPOOKY)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aractula().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SPOOKY)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Terrotula().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(26).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SPOOKY)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Geckone().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(19).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SPOOKY)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Toron().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Oriture().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(26).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Natoron().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(38).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Zuppy().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky().duringDaytime()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rushot().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_GRASSLAND).canSeeSky().duringDaytime()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Flawk().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST).duringDaytime()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Legenix().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST).duringDaytime()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snazap().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_BADLANDS)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cobolta().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(27).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_BADLANDS)
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bushoo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.TREE_TOP).build()));
        addNewPokemon(new Bushup().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.TREE_TOP).build()));
        addNewPokemon(new Bushairy().overwriteSpawnData(new PokemonSpawnDataBuilder(3)
                .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                .setSpawnPreset(SpawnPreset.TREE_TOP).build()));
        addNewPokemon(new Platyplat().overwriteSpawnData(
                new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Platyplash().overwriteSpawnData(new PokemonSpawnDataBuilder(2)
                .setMinLevel(27).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_SWAMP).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Terraz().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()).setCanFly(true));
        addNewPokemon(new Terravolt().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dinomite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dinopion().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Formling().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Raizid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Raizodon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Vambat().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dracubat().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Countula().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Golkid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Golemo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Golossus().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Buzzeed().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Ecobuzz().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Signileaf().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pupool().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pooldog().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Peafan().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Psyflock().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Phoxy().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Phoxiven().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Paracaw().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Paraful().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Parabow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hummzing().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hummzap().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Spony().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Horshush().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gworm().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Wormune().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Wormole().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Scorlit().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Scorpinova().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dugmite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Erramite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sandster().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Monstune().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Wraphro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pharobe().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Roobeo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Roobeop().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dodont().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rexite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tarexite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Stegron().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Stegasteel().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Atomix().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Atomotro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Atomotrix().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Skrabble().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jeweltal().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Weakid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bulker().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dynaball().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Explonade().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fawnite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Chardeer().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Elkindle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Shrubsea().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kahula().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Weedsea().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kelpula().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Eclipo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Eclipser().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Feva().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fevira().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fevesta().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Moostone().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Moostrike().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kidlit().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Billaze().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Airimp().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blimpoon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cuburn().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Grizzler().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Magrizzly().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Barball().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Barbviral().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fyant().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blitzy().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blitziglow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blitziboom().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hottop().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fizire().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Volcadon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Napkid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Phansheet().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Psytric().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tortarock().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bouldoise().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Porfin().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Doflap().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Shrimpet().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Shrimpoon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sharko().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Markrush().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kinip().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Guppish().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Eqwater().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gillyde().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Seagic().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Orcail().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jellitot().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jellitic().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jelliking().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new JellitotOne().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jellinip().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Jelliqueen().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Parasea().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Paradiso().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Surfide().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tidude().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Crablue().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rockster().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Toxidon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snapike().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Holloweed().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hollowkin().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rottoween().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Swampheap().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Purpole().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Frogoo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Toxitoad().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aqlarva().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Mosliquo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Slibloo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fungerm().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kapplash().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Trollow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Trollurk().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Trollger().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Skeledeep().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Scrow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gaslit().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dozand().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Skreech().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Banshreek().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Banscream().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Finflix().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Finndra().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hydrogon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Merkid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Mermarine().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Mersidon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Corrine().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Coralush().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Coraltle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gravole().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Specstone().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snoozee().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Ghoullow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baawool().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baabush().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baablaze().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baabble().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baabreeze().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baablock().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Baablizz().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Parafox().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Spirix().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pupetal().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pupyro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Puplash().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Felove().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Yayak().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Yakkle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Leonite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Flapinko().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rollie().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Elestomp().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Girafire().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Giraflame().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bullson().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Zebrite().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hippond().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hippotone().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cheetric().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cosmet().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Meterock().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Syrill().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cycrill().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Syphoon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hypnopuff().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hypnosmog().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Nawale().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Whaley().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Humbreech().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Squidart().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lisquid().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Hamawl().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Silvicious().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Groilla().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Groillum().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Kongrilla().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Woodbeak().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Woodawn().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Wingon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aerogon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tikiki().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tikitik().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tikitoko().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cryodro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cryodrago().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));//cryodra
        addNewPokemon(new Brachio().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Brachiodon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bugray().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dracofly().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tapire().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tapiblaze().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sluggah().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Mossnail().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lazloth().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Mystablet().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Bunnic().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Arctichare().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Moofork().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Avaldeer().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Molice().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tundrill().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Huskpup().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Huskold().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Crysilla().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cryscoon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Crystiwing().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snowlow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Snowrong().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aurorai().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Colcub().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Subearo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Polarpow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rinolar().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Rinotic().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Noseal().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Isealcle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sealberg().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Apein().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sascrush().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Battic().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blizzibat().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Carbonix().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Carbonitro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Iggle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Iglow().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gigloo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Puffle().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Puffpeak().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pinglett().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pinglade().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tweetot().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Melotweet().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Eelect().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Chamelec().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Chamelectro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Palmo().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cocorocko().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Sealug().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Nembroslug().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Droot().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Dragoon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Frugon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Serpyro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Slitheat().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Blazilisk().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pinkmee().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Valure().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Beautifin().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Strikon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Strikloud().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Strikyon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fayely().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fayegon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Fayedra().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Terradon().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tigacore().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Searine().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Tornadowl().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Aethera().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Solaran().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Lunaro().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Cellance().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Healthia().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Pollusion().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
        addNewPokemon(new Gemmany().overwriteSpawnData(new PokemonSpawnDataBuilder(1)
                .setMinLevel(9).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_VOID).canSeeSky()
                .setSpawnPreset(SpawnPreset.NATURAL).build()));
    }
}
