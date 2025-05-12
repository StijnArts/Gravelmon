package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.fabel.*;
import drai.dev.data.pokemon.mahal.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.orohnhavai.Cottoon;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Mahal extends drai.dev.data.games.registry.Game {
    public Mahal() {
        super("Mahal");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Honylin());
        addNewPokemon(new Madhulin());
        addNewPokemon(new Sabandolin());
        addNewPokemon(new Saany());
        addNewPokemon(new Saanarak());
        addNewPokemon(new Kobarak());
        addNewPokemon(new Wavalo());
        addNewPokemon(new Chigalo());
        addNewPokemon(new Buffaware());

        addNewPokemon(new Kyudoeye());
        addNewPokemon(new Typhogun());
        addNewPokemon(new Bushidurai());
        addNewPokemon(new Hedgehust());
        addNewPokemon(new Hedgehootz());
        addNewPokemon(new Birblyan());
        addNewPokemon(new Crikamer());
        addNewPokemon(new Athlerkoma());
        removePokedexPokemon("bunnelby-mahalan, diggersby-mahalan");
        addNewPokemon(new Sugarva());
        addNewPokemon(new Cottoon());
        addNewPokemon(new Sugottornet());
        addNewPokemon(new FabelianSugarva("", Aspect.FABELIAN));
        addNewPokemon(new FabelianCottoon("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSugottornet("", Aspect.FABELIAN));
        removePokedexPokemon("sugarva-fabelian");
        removePokedexPokemon("cottoon-fabelian");
        removePokedexPokemon("sugottornet-fabelian");
        addNewPokemon(new Cavahandax());
        addNewPokemon(new Cavahanbul());
        addNewPokemon(new Cavaraja());
        addNewPokemon(new Crowderer());
        removePokedexPokemon("poochyena-mahalan, mightyena-mahalan");
        addNewPokemon(new Werabiena());
        addNewPokemon(new Milkitt());
        addNewPokemon(new Feralassi());
        addNewPokemon(new Pomgromb());
        addNewPokemon(new Pomgranon());
        addNewPokemon(new Criagen());
        addNewPokemon(new Himalama());
        removePokedexPokemon("meowth-mahalan");
        addNewPokemon(new Perrsbal());
        addNewPokemon(new Yetrigori());
        addNewPokemon(new Yetranibal());
        addNewPokemon(new Fuwayuki());
        addNewPokemon(new Dumonke());
        addNewPokemon(new Furburnape());
        addNewPokemon(new Scramacal());
        removePokedexPokemon("crabrawler-mahalan");
        addNewPokemon(new Cococrabalm());
        addNewPokemon(new Pawlien());
        addNewPokemon(new Brishop());
        addNewPokemon(new Chequeen());
        removePokedexPokemon("sandygast-mahalan, palossand-mahalan");
        addNewPokemon(new Spinacuta());
        removePokedexPokemon("trubbish-mahalan, garbodor-mahalan");
        addNewPokemon(new Musell());
        addNewPokemon(new Mustic());
        addNewPokemon(new Tandash());
        addNewPokemon(new Toastoori());
        addNewPokemon(new Tandoroanix());
        addNewPokemon(new Smoochonk());
        addNewPokemon(new Smoochieva());
        removePokedexPokemon("larvesta-mahalan");
        addNewPokemon(new Varurona());
        addNewPokemon(new Dusdreacub());
        addNewPokemon(new Napear());
        addNewPokemon(new Jampear());
        addNewPokemon(new Beangravat());
        removePokedexPokemon("hippopotas-mahalan, hippowdon-mahalan");
        addNewPokemon(new Murrat());
        addNewPokemon(new Turrat());
        addNewPokemon(new Saboteurat());
        removePokedexPokemon("sinistea-mahalan, polteageist-mahalan");
        addNewPokemon(new Coffeenie());
        addNewPokemon(new Koincarp().fishingSpawnFromExisting());
        addNewPokemon(new Bahaurum());
        addNewPokemon(new Parool());
        addNewPokemon(new Pararpet());
        addNewPokemon(new Smotra());
        addNewPokemon(new Stortra());
        addNewPokemon(new Typhortra());
        removePokedexPokemon("yanma-mahalan");
        addNewPokemon(new Yanmonsta());
        addNewPokemon(new Urdurt());
        addNewPokemon(new Durnull());
        addNewPokemon(new Windinter());
        addNewPokemon(new Crescoold());
        removePokedexPokemon("spiritomb-mahalan, mankey-mahalan");
        addNewPokemon(new Priwabor());
        addNewPokemon(new Squittel());
        addNewPokemon(new Batmirrel());
        addNewPokemon(new Puffaguish().fishingSpawnFromExisting());
        addNewPokemon(new Undacuffa());
        removePokedexPokemon("staryu-mahalan");
        addNewPokemon(new Starshep());
        addNewPokemon(new Camocout());
        addNewPokemon(new Reacon());
        addNewPokemon(new Generaron());
        addNewPokemon(new Burflorodon()); //fossils
        addNewPokemon(new Iroflorodos()); //fossils
        addNewPokemon(new Burgustodon()); //fossils
        addNewPokemon(new Irogustodos()); //fossils
        addNewPokemon(new Farbaay());
        addNewPokemon(new Capronze());
        removePokedexPokemon("mantyke-mahalan, mantine-mahalan");
        addNewPokemon(new Armanta());
        removePokedexPokemon("torkoal-mahalan");
        addNewPokemon(new Steamboal());
        addNewPokemon(new Siaspor());
        addNewPokemon(new Lumiroom());
        addNewPokemon(new Lovtopus());
        addNewPokemon(new Momearve());
        addNewPokemon(new Chiji());
        addNewPokemon(new Viviji());
        addNewPokemon(new Vivijaka());
        addNewPokemon(new Posspitur());
        addNewPokemon(new Floarial().fishingSpawnFromExisting());
        addNewPokemon(new Makarial().fishingSpawnFromExisting());
        addNewPokemon(new Makarotus());
        removePokedexPokemon("dratini-mahalan, dragonair-mahalan");
        addNewPokemon(new Dragonice());
        addNewPokemon(new Regiwater());
        addNewPokemon(new Regigrass());
        removePokedexPokemon("tornadus-mahalan, thundurus-mahalan, landorus-mahalan");
        addNewPokemon(new Ivorata());
        addNewPokemon(new Ebodhenu());
        addNewPokemon(new Nirvakali());
        addNewPokemon(new Thronoor());
        addNewPokemon(new Sequardian());
        addNewPokemon(new Gogadra());
    }

}
