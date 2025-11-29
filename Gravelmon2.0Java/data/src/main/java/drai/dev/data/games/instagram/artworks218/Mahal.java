package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.fabel.*;
import drai.dev.data.pokemon.mahal.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.orohnhavai.Cottoon;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Mahal extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Mahal();
    private Mahal() {
        super("Mahal", "https://www.instagram.com/artworks218_/?hl=en");
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
        addNewPokemon(new Honylin().addLabels(Label.STARTER));
        addNewPokemon(new Madhulin().addLabels(Label.STARTER));
        addNewPokemon(new Sabandolin().addLabels(Label.STARTER));
        addNewPokemon(new Saany().addLabels(Label.STARTER));
        addNewPokemon(new Saanarak().addLabels(Label.STARTER));
        addNewPokemon(new Kobarak().addLabels(Label.STARTER));
        addNewPokemon(new Wavalo().addLabels(Label.STARTER));
        addNewPokemon(new Chigalo().addLabels(Label.STARTER));
        addNewPokemon(new Buffaware().addLabels(Label.STARTER));

        addNewPokemon(new Kyudoeye());
        addNewPokemon(new Typhogun());
        addNewPokemon(new Bushidurai());
        addNewPokemon(new Hedgehust());
        addNewPokemon(new Hedgehootz());
        addNewPokemon(new Birblyan());
        addNewPokemon(new Crikamer());
        addNewPokemon(new Athlerkoma());
        addNewPokemon(new MahalianBunnelby("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianDiggersby("", Aspect.MAHALIAN));
        addNewPokemon(new Sugarva());
        addNewPokemon(new Cottoon());
        addNewPokemon(new Sugottornet());
        addNewPokemon(new FabelianSugarva("", Aspect.FABELIAN));
        addNewPokemon(new FabelianCottoon("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSugottornet("", Aspect.FABELIAN));
        addNewPokemon(new Cavahandax());
        addNewPokemon(new Cavahanbul());
        addNewPokemon(new Cavaraja());
        addNewPokemon(new Crowderer());
        addNewPokemon(new MahalianPoochyena("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianMightyena("", Aspect.MAHALIAN));
        addNewPokemon(new Werabiena());
        addNewPokemon(new Milkitt());
        addNewPokemon(new Feralassi());
        addNewPokemon(new Pomgromb());
        addNewPokemon(new Pomgranon());
        addNewPokemon(new Criagen());
        addNewPokemon(new Himalama());
        addNewPokemon(new MahalianMeowth("", Aspect.MAHALIAN));
        addNewPokemon(new Perrsbal());
        addNewPokemon(new Yetrigori());
        addNewPokemon(new Yetranibal());
        addNewPokemon(new Fuwayuki());
        addNewPokemon(new Dumonke());
        addNewPokemon(new Furburnape());
        addNewPokemon(new Scramacal());
        addNewPokemon(new MahalianCrabrawler("", Aspect.MAHALIAN));
        addNewPokemon(new Cococrabalm());
        addNewPokemon(new Pawlien());
        addNewPokemon(new Brishop());
        addNewPokemon(new Chequeen());
        addNewPokemon(new MahalianSandygast("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianPalossand("", Aspect.MAHALIAN));
        addNewPokemon(new Spinacuta());
        addNewPokemon(new MahalianTrubbish("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianGarbodor("", Aspect.MAHALIAN));
        addNewPokemon(new Musell());
        addNewPokemon(new Mustic());
        addNewPokemon(new Tandash());
        addNewPokemon(new Toastoori());
        addNewPokemon(new Tandoroanix());
        addNewPokemon(new Smoochonk());
        addNewPokemon(new Smoochieva());
        addNewPokemon(new MahalianLarvesta("", Aspect.MAHALIAN));
        addNewPokemon(new Varurona());
        addNewPokemon(new Dusdreacub());
        addNewPokemon(new Napear());
        addNewPokemon(new Jampear());
        addNewPokemon(new Beangravat());
        addNewPokemon(new MahalianHippopotas("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianHippowdon("", Aspect.MAHALIAN));
        addNewPokemon(new Murrat());
        addNewPokemon(new Turrat());
        addNewPokemon(new Saboteurat());
        addNewPokemon(new MahalianSinistea("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianPolteageist("", Aspect.MAHALIAN));
        addNewPokemon(new Coffeenie());
        addNewPokemon(new Koincarp().fishingSpawnFromExisting());
        addNewPokemon(new Bahaurum());
        addNewPokemon(new Parool());
        addNewPokemon(new Pararpet());
        addNewPokemon(new Smotra());
        addNewPokemon(new Stortra());
        addNewPokemon(new Typhortra());
        addNewPokemon(new MahalianYanma("", Aspect.MAHALIAN));
        addNewPokemon(new Yanmonsta());
        addNewPokemon(new Urdurt());
        addNewPokemon(new Durnull());
        addNewPokemon(new Windinter());
        addNewPokemon(new Crescoold());
        addNewPokemon(new MahalianSpiritomb("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianMankey("", Aspect.MAHALIAN));
        addNewPokemon(new Priwabor());
        addNewPokemon(new Squittel());
        addNewPokemon(new Batmirrel());
        addNewPokemon(new Puffaguish().fishingSpawnFromExisting());
        addNewPokemon(new Undacuffa());
        addNewPokemon(new MahalianStaryu("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new Starshep());
        addNewPokemon(new Camocout());
        addNewPokemon(new Reacon());
        addNewPokemon(new Generaron());
        addNewPokemon(new Burflorodon().addLabels(Label.FOSSIL)); //fossils
        addNewPokemon(new Iroflorodos().addLabels(Label.FOSSIL)); //fossils
        addNewPokemon(new Burgustodon().addLabels(Label.FOSSIL)); //fossils
        addNewPokemon(new Irogustodos().addLabels(Label.FOSSIL)); //fossils
        addNewPokemon(new Farbaay());
        addNewPokemon(new Capronze());
        addNewPokemon(new MahalianMantyke("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new MahalianMantine("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new Armanta());
        addNewPokemon(new MahalianTorkoal("", Aspect.MAHALIAN));
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
        addNewPokemon(new MahalianDratini("", Aspect.MAHALIAN).fishingSpawnFromExisting().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new MahalianDragonair("", Aspect.MAHALIAN).fishingSpawnFromExisting().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Dragonice().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Regiwater().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Regigrass().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new MahalianTornadus("", Aspect.MAHALIAN).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new MahalianThundurus("", Aspect.MAHALIAN).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new MahalianLandorus("", Aspect.MAHALIAN).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Ivorata().addLabels(Label.LEGENDARY));
        addNewPokemon(new Ebodhenu().addLabels(Label.LEGENDARY));
        addNewPokemon(new Nirvakali().addLabels(Label.LEGENDARY));
        addNewPokemon(new Thronoor().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Sequardian().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Gogadra().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new MahalianRaichu("", Aspect.MAHALIAN));
    }

}
