package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.pokemon.xenoverse.*;
import drai.dev.data.pokemon.xenoverse.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Xenoverse extends Game {
    public static final Game INSTANCE = new Xenoverse();

    private Xenoverse() {
        super("Xenoverse");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Shyleon().addLabels(Label.STARTER));
        addNewPokemon(new ShyleonTerrestrial("", Aspect.TERRESTRIAL).addLabels(Label.STARTER));
        addNewPokemon(new ShyleonXenoversal("", Aspect.XENOVERSAL).addLabels(Label.STARTER));
        addNewPokemon(new ShyleonAstral("", Aspect.ASTRAL).addLabels(Label.STARTER));
        addNewPokemon(new Trishout().addLabels(Label.STARTER));
        addNewPokemon(new TrishoutTerrestrial("", Aspect.TERRESTRIAL).addLabels(Label.STARTER));
        addNewPokemon(new TrishoutXenoversal("", Aspect.XENOVERSAL).addLabels(Label.STARTER));
        addNewPokemon(new TrishoutAstral("", Aspect.ASTRAL).addLabels(Label.STARTER));
        addNewPokemon(new Shulong().addLabels(Label.STARTER));
        addNewPokemon(new ShulongTerrestrial("", Aspect.TERRESTRIAL).addLabels(Label.STARTER));
        addNewPokemon(new ShulongXenoversal("", Aspect.XENOVERSAL).addLabels(Label.STARTER));
        addNewPokemon(new ShulongAstral("", Aspect.ASTRAL).addLabels(Label.STARTER));
        addNewPokemon(new Sparkowl());
        addNewPokemon(new Shawkbird());
        addNewPokemon(new Harrowk());
        addNewPokemon(new Yemin());
        addNewPokemon(new Kungfur());
        addNewPokemon(new Masgot());
        addNewPokemon(new Bremand());
        addNewPokemon(new BassistBremand(Aspect.BASSIST));
        addNewPokemon(new DrummerBremand(Aspect.DRUMMER));
        addNewPokemon(new GuitaristBremand(Aspect.GUITARIST));
        addNewPokemon(new Bremand());
        addNewPokemon(new Bremand());
        addNewPokemon(new Puppillon());
        addNewPokemon(new Hangead());
        addNewPokemon(new Nunvil());
        addNewPokemon(new Whisteract());
        addNewPokemon(new Blingrimm());
        addNewPokemon(new Blingrudge());
        addNewPokemon(new Hikiloo());
        addNewPokemon(new Mylomute());
        addNewPokemon(new Kidoon());
        addNewPokemon(new Honchen());
        addNewPokemon(new EldiwanMeowth("", Aspect.ELDIWAN));
        addNewPokemon(new Persage());
        addNewPokemon(new Koinkoin());
        addNewPokemon(new Beefle());
        addNewPokemon(new Punchbug());
        addNewPokemon(new Hercurcules());
        addNewPokemon(new Chigami());
        addNewPokemon(new Grudako());
        Pokemon sabolt = new Sabolt();
        addNewPokemon(sabolt);
        addNewPokemon(new SaboltTerrestrial("", Aspect.TERRESTRIAL));
        addNewPokemon(new SaboltXenoversal("", Aspect.XENOVERSAL));
        addNewPokemon(new Gachigachoo());
        addNewPokemon(new Hystearic());
        addNewPokemon(new Wystearia());
        addNewPokemon(new Pepequeno());
        Pokemon scovile = new Scovile();
        addNewPokemon(scovile);
        addNewPokemon(new Excalibould());
        addNewPokemon(new Madieval());
        addNewPokemon(new Rockapye());
        addNewPokemon(new Troglolith());
        addNewPokemon(new Sputnink());
        addNewPokemon(new Nebyura());
        addNewPokemon(new Birigiri());
        addNewPokemon(new Chubiburny());
        addNewPokemon(new Goombear());
        addNewPokemon(new Manticoeur());
        addNewPokemon(new Fatail());
        addNewPokemon(new Reindear());
        addNewPokemon(new Reindigo());
        addNewPokemon(new Sosqwatch());
        addNewPokemon(new Vroombug());
        addNewPokemon(new Skravroom());

        addNewPokemon(new Chikaboo());
        addNewPokemon(new Peckabone());
        addNewPokemon(new Rexquiem());
        addNewPokemon(new Scaracno());
        addNewPokemon(new Scaracluo());
        addNewPokemon(new Scarphasmo());
        addNewPokemon(new Tokakle());
        addNewPokemon(new Donanas());
        addNewPokemon(new Chimaooze());
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Bandeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Scaleon().addLabels(Label.EEVEELUTION));
        addPokedexPokemon("porygon," +
                "porygon2," +
                "porygonz");
        addNewPokemon(new PorygonWES());
        addNewPokemon(new Dusmee().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Egohiss().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Egorgeon().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Chiripe().addLabels(Label.STARTER));
        addNewPokemon(new Batnana().addLabels(Label.STARTER));
        addNewPokemon(new Vesperfum().addLabels(Label.STARTER));
        addNewPokemon(new Croakling().addLabels(Label.STARTER));
        addNewPokemon(new Bullverin().addLabels(Label.STARTER));
        addNewPokemon(new Croakraze().addLabels(Label.STARTER));

        addNewPokemon(new Inflant().addLabels(Label.STARTER));
        addNewPokemon(new Floatusk().addLabels(Label.STARTER));
        addNewPokemon(new Swelephant().addLabels(Label.STARTER));
        addNewPokemon(new Luxflon().addLabels(Label.LEGENDARY));
        Pokemon dragalisk = new Dragalisk().addLabels(Label.LEGENDARY);
        addNewPokemon(dragalisk.addLabels(Label.LEGENDARY));
        addNewPokemon(new Dielebi().addLabels(Label.MYTHICAL));
        addNewPokemon(new Reginalous().addLabels(Label.SUB_LEGENDARY));

//        addPokedexPokemon(
        addNewPokemon(new ElekidX("Elekid", Aspect.X));
        addNewPokemon(new ElectabuzzX("", Aspect.X));
        addNewPokemon(new Electaburst());
        addNewPokemon(new SpiritombX("", Aspect.X));
        addNewPokemon(new CarvanhaX("", Aspect.X));
        addNewPokemon(new SharpedoX("", Aspect.X));
        addNewPokemon(new PyukumukuX("", Aspect.X));
        addNewPokemon(new PikachuMaleX("Pikachu", Aspect.MALE_X));
        addNewPokemon(new PikachuFemaleX("Pikachu", Aspect.FEMALE_X));
        addNewPokemon(new JoltikX("", Aspect.X));
        addNewPokemon(new GalvantulaX("", Aspect.X));
        addNewPokemon(new SmeargleX("Smeargle", Aspect.X));
        addNewPokemon(new Chientilly());
        addNewPokemon(new GastlyX("", Aspect.X));
        addNewPokemon(new HaunterX("", Aspect.X));
        addNewPokemon(new GengarX("", Aspect.X));
        addNewPokemon(new YamaskX("", Aspect.X));
        addNewPokemon(new CofagrigusX("", Aspect.X));
        addNewPokemon(new PonytaX("", Aspect.X));
        addNewPokemon(new RapidashX("", Aspect.X));
        addNewPokemon(new RapidashStorm("", Aspect.STORM));
        addNewPokemon(new CacneaX("", Aspect.X));
        addNewPokemon(new CacturneX("", Aspect.X));
        addNewPokemon(new SwirlixX("Swirlix", Aspect.X));
        addNewPokemon(new SlurpuffX("Slurpuff", Aspect.X));
        addNewPokemon(new BudewX("", Aspect.X));
        addNewPokemon(new RoseliaX("", Aspect.X));
        addNewPokemon(new RoseradeX("", Aspect.X));
        addNewPokemon(new MareanieX("", Aspect.X));
        addNewPokemon(new ToxapexX("Toxapex", Aspect.X));
        addNewPokemon(new GreninjaX("Greninja", Aspect.X));
        addNewPokemon(new MewtwoX("", Aspect.X).addLabels(Label.LEGENDARY));
        addNewPokemon(new RaichuX("", Aspect.X));
        addNewPokemon(new BisharpX("", Aspect.X));
        addNewPokemon(new ScovileX("", Aspect.X));
        addNewPokemon(new TyranitarX("Tyranitar", Aspect.X).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DittoX("", Aspect.X));
        addNewPokemon(new AegislashX("Aegislash", Aspect.X));
        addNewPokemon(new TapuFiniX("", Aspect.X).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new TapuLeleX("", Aspect.X).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new TapuKokoX("", Aspect.X).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new TapuBuluX("", Aspect.X).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new DragaliskX("", Aspect.X).addLabels(Label.LEGENDARY));
        addNewPokemon(new ShyleonX("", Aspect.X).addLabels(Label.STARTER));
        addNewPokemon(new TrishoutX("", Aspect.X).addLabels(Label.STARTER));
        addNewPokemon(new ShulongX("", Aspect.X).addLabels(Label.STARTER));

        addNewPokemon(new UnownEarth("Unown", Aspect.EARTH));
        addNewPokemon(new UnownXenoverse("Unown", Aspect.XENOVERSE));
    }
}
