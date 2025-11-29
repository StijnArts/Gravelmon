package drai.dev.data.games.pokengine;

import drai.dev.data.pokemon.avalos.Carcahawk;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done
public class Okeno extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Okeno();
    private Okeno() {
        super("Okeno", "https://pokengine.org/collections/10h1yde3/Okeno");
    }

    @Override
    public void registerPokemon() {
//        addNewPokemon(new Fruibat().addLabels(Label.STARTER)); //Member of line not Finished
//        addNewPokemon(new Battack().addLabels(Label.STARTER)); //Member of line not Finished
//        addNewPokemon(new Batornado().addLabels(Label.STARTER)); //Member of line not Finished
//        addNewPokemon(new 420471().addLabels(Label.STARTER));   Missing Art
//        addNewPokemon(new 455818().addLabels(Label.STARTER));   Missing Art
//        addNewPokemon(new Komotox().addLabels(Label.STARTER));   //Member of line not Finished
        addNewPokemon(new Pubble().addLabels(Label.STARTER));
        addNewPokemon(new Bouldog().addLabels(Label.STARTER));
        addNewPokemon(new Vinagruff().addLabels(Label.STARTER));
        addNewPokemon(new Punibara());
        addNewPokemon(new Dopibara());
        var coathief = new Coathief();
        addNewPokemon(coathief);
        addNewPokemon(new MastenianCoathief("", Aspect.MASTENIAN));
        addNewPokemon(new Darskarf());
        addNewPokemon(new Ookawatt());
        addNewPokemon(new Inscribble());
        addNewPokemon(new Pupage());
        addNewPokemon(new Beetome());
        addNewPokemon(new Hatchick());
        addNewPokemon(new Scuffowl());
        addNewPokemon(new Rudester());
        addNewPokemon(new Boileror());
        addNewPokemon(new Feygon());
        addNewPokemon(new Deevigon());
        addNewPokemon(new Caballgon());
        addNewPokemon(new Tubaride());
        addNewPokemon(new Squeezoa());
        addNewPokemon(new Searside());
        addNewPokemon(new Erupshell());
        addNewPokemon(new Frirate());
        addNewPokemon(new Piratross());
        addNewPokemon(new Albagross());
        addNewPokemon(new Lepikite());
        addNewPokemon(new Humwing());
        addNewPokemon(new Colibreeze());
        addNewPokemon(new Kitweed());
        addNewPokemon(new Felifluff());
        addNewPokemon(new Empurroar());
        addNewPokemon(new Puppug());
        addNewPokemon(new Boshishe());
        addNewPokemon(new Nyanyum());
        addNewPokemon(new Yummyan());
        addNewPokemon(new Grubait());
        addNewPokemon(new Chococoon());
        addNewPokemon(new Bombeetle());
        addNewPokemon(new Popkern());
        addNewPokemon(new Pipkorn());
        addNewPokemon(new Piglitt());
        addNewPokemon(new Porklay());
        addNewPokemon(new Javernaut());
        addNewPokemon(new Barmor());
        addNewPokemon(new Beakapow());
//        addNewPokemon(new Kapony()); //Missing Art
//        addNewPokemon(new Coisteed()); //Missing Art
//        addNewPokemon(new Zebravery()); //Member of line not Finished
        addNewPokemon(new Reekoral());
        addNewPokemon(new Bleakonda());
        addNewPokemon(new Ignew());
        addNewPokemon(new Metarock());
        addNewPokemon(new Beherode());
//        addNewPokemon(new Tintap()); //Member of line not Finished
//        addNewPokemon(new Taprint()); //Member of line not Finished
//        addNewPokemon(new Celestapir()); //Missing Art
        addNewPokemon(new Torquoise());
        addNewPokemon(new Shivurr());
        addNewPokemon(new Frigivurr());
        addNewPokemon(new Carcaheet());
        addNewPokemon(new Carcahawk());
        addNewPokemon(new Dormie());
        addNewPokemon(new Dreamie());
        addNewPokemon(new Tomactus());
        addNewPokemon(new Cactower());
//        addNewPokemon(new Ferrenyou()); //Missing Art
//        addNewPokemon(new Ferrosaur()); //Member of line not Finished
        addNewPokemon(new Infurnace());
        addNewPokemon(new Fountide());
        addNewPokemon(new Mudpole());
        addNewPokemon(new Sapuddle());
        addNewPokemon(new Bulwart());
        addNewPokemon(new Krickiet());
        addNewPokemon(new Maestring());
        addNewPokemon(new Inspark());
        addNewPokemon(new Flantern());
        addNewPokemon(new Artifire());
        addNewPokemon(new Explosipede());
        addNewPokemon(new Oxessory());
        addNewPokemon(new Plurshie());
        addNewPokemon(new Phantoshie());
        addNewPokemon(new Pompuff());
        addNewPokemon(new Catertuff());
        addNewPokemon(new Pawstiche());
        addNewPokemon(new Equilibal());
        addNewPokemon(new Hoppler());
        addNewPokemon(new Troupican());
//        addNewPokemon(new Seepling()); //Missing Art
//        addNewPokemon(new Sproutrop()); //Member of line not Finished
//        addNewPokemon(new Carnaukaizer()); //Member of line not Finished
//        addNewPokemon(new Araukaizer()); //Missing Art
        addNewPokemon(new Slowris());
        addNewPokemon(new Soulverein());
        addNewPokemon(new Psykton());
        addNewPokemon(new Crustean());
//        addNewPokemon(new Nestling()); //Member of line not Finished
//        addNewPokemon(new Fernocious()); //Missing Art
        addNewPokemon(new Frutifeye());
        addNewPokemon(new Guaraneye());
//        addNewPokemon(new Coolshion()); //Missing Art
//        addNewPokemon(new Harmoset()); //Missing Art
//        addNewPokemon(new Amblush()); //Missing Art
//        addNewPokemon(new Scubeetle()); //Missing Art

//        addNewPokemon(new Pirambuouy()); //Missing Art
//        addNewPokemon(new Escagou()); //Member of line not Finished
        addNewPokemon(new Defecash());
//        addNewPokemon(new Slowris()); //Missing Art
//        addNewPokemon(new Soulverein()); //Missing Art
//        addNewPokemon(new Aracula()); //Missing Stats
//        addNewPokemon(new Arantula()); //Missing Stats
//        addNewPokemon(new Torquoise()); //Missing Art
//        addNewPokemon(new Lillama()); //Missing Art
//        addNewPokemon(new Alpacoat()); //Member of line not Finished
//        addNewPokemon(new Alpeak()); //Missing Art
//        addNewPokemon(new Soaraptor()); //Missing Art
//        addNewPokemon(new Lilquen()); //Missing Art
//        addNewPokemon(new Mosstatic()); //Missing Art
//        addNewPokemon(new Glowarm()); //Missing Art
//        addNewPokemon(new Digobite()); //Missing Art
//        addNewPokemon(new Drillobite()); //Member of line not Finished
//        addNewPokemon(new Magnit()); //Member of line not Finished
        addNewPokemon(new Vesoul());
        addNewPokemon(new Marajar());
        addNewPokemon(new Exoscythe());
        addNewPokemon(new Coastone());
        addNewPokemon(new Sandieval());
        addNewPokemon(new Desplash());
        addNewPokemon(new Desbrine());
        addNewPokemon(new Destropod());
        addNewPokemon(new Egcite());
        addNewPokemon(new Egxel());
        addNewPokemon(new Egxiking());
        addNewPokemon(new Bboing());
        addNewPokemon(new Tutu());
//        addNewPokemon(new Elefunn()); //Missing Art
//        addNewPokemon(new Eleflutter()); //Missing Art
//        addNewPokemon(new Elefancy()); //Missing Art
//        addNewPokemon(new Armodillo()); //Missing Art
//        addNewPokemon(new Goladillo()); //Missing Art
//        addNewPokemon(new Adobrick()); //Missing Art
//        addNewPokemon(new Adobuild()); //Missing Art
//        addNewPokemon(new Concretech()); //Missing Art
        addNewPokemon(new Lundrey());
        addNewPokemon(new Dirthrown());
//        addNewPokemon(new Roacheap()); //Missing Art
//        addNewPokemon(new Roaproach()); //Missing Art
//        addNewPokemon(new Rorscharf()); //Missing Art
//        addNewPokemon(new Tiklok()); //Member of line not Finished
//        addNewPokemon(new Tricklock()); //Missing Art
//        addNewPokemon(new Midnaught()); //Missing Art
//        addNewPokemon(new Xyloathone()); //Missing Art
//        addNewPokemon(new Squeakey()); //Missing Art
//        addNewPokemon(new Rodentoy()); //Missing Art
//        addNewPokemon(new Virack()); //Missing Art
//        addNewPokemon(new Bacteary()); //Missing Art
//        addNewPokemon(new Allergix()); //Member of line not Finished
        addNewPokemon(new Duolecule());
        addNewPokemon(new Valvacid());
        addNewPokemon(new Larvomit());
        addNewPokemon(new Drogaster());
//        addNewPokemon(new Bysect()); //Missing Art
        addNewPokemon(new Mycerial());
        addNewPokemon(new Unfortunist());
        addNewPokemon(new Dullahaunt());
        addNewPokemon(new Ombrella());
//        addNewPokemon(new Komrant()); //Missing Art
//        addNewPokemon(new Kombatant()); //Missing Art
//        addNewPokemon(new Komandant()); //Member of line not Finished
//        addNewPokemon(new Ohvni()); //Missing Art
        addNewPokemon(new Carnation());
        addNewPokemon(new Corsage());
//        addNewPokemon(new Kisadee()); //Missing Art
//        addNewPokemon(new Warbleer()); //Missing Art
//        addNewPokemon(new Gnatsure()); //Missing Art
//        addNewPokemon(new Averidge()); //Missing Art
//        addNewPokemon(new Beanstork()); //Missing Art
//        addNewPokemon(new Shrimpish()); //Missing Art
//        addNewPokemon(new Lobstrom()); //Missing Art
//        addNewPokemon(new Surfish()); //Missing Art
//        addNewPokemon(new Darbyss()); //Missing Art
//        addNewPokemon(new Amenemy()); //Missing Art
//        addNewPokemon(new Venemone()); //Missing Art
//        addNewPokemon(new Duskolony()); //Member of line not Finished
//        addNewPokemon(new Spikips()); //Missing Art
//        addNewPokemon(new Espetepse()); //Missing Art
//        addNewPokemon(new Orthocoil()); //Missing Art
//        addNewPokemon(new Cerashell()); //Missing Art
//        addNewPokemon(new Narwartic()); //Missing Art
//        addNewPokemon(new Pyrotile()); //Missing Art
//        addNewPokemon(new Tropiguana()); //Missing Art
//        addNewPokemon(new Brazilisk()); //Missing Art
        addNewPokemon(new Selveger().addLabels(Label.LEGENDARY));
        addNewPokemon(new Hoatrex().addLabels(Label.LEGENDARY));
        addNewPokemon(new Gnetic().addLabels(Label.MYTHICAL));

    }

}
