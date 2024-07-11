package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.nodorro.regional.*;
import drai.dev.data.pokemon.nodorro.Scroul;
import drai.dev.data.pokemon.olysos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Nodorro extends drai.dev.data.games.registry.Game {
    public Nodorro() {
        super("Nodorro");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new NodorranAmoonguss("", Aspect.NODORRAN));
        pokemon.add(new NodorranArbok("", Aspect.NODORRAN));
        pokemon.add(new NodorranBeartic("", Aspect.NODORRAN));
        pokemon.add(new NodorranBonsly("", Aspect.NODORRAN));
        pokemon.add(new NodorranChimchar("", Aspect.NODORRAN));
        pokemon.add(new NodorranCubchoo("", Aspect.NODORRAN));
        pokemon.add(new NodorranDewott("", Aspect.NODORRAN));
        pokemon.add(new NodorranDrifblim("", Aspect.NODORRAN));
        pokemon.add(new NodorranDrifloon("", Aspect.NODORRAN));
        pokemon.add(new NodorranEelektrik("", Aspect.NODORRAN));
        pokemon.add(new NodorranEelektross("", Aspect.NODORRAN));
        pokemon.add(new NodorranEkans("", Aspect.NODORRAN));
        pokemon.add(new NodorranFoongus("", Aspect.NODORRAN));
        pokemon.add(new NodorranGastly("", Aspect.NODORRAN));
        pokemon.add(new NodorranGengar("", Aspect.NODORRAN));
        pokemon.add(new NodorranGrovyle("", Aspect.NODORRAN));
        pokemon.add(new NodorranGyarados("", Aspect.NODORRAN));
        pokemon.add(new NodorranHaunter("", Aspect.NODORRAN));
        pokemon.add(new NodorranHippopotas("", Aspect.NODORRAN));
        pokemon.add(new NodorranHippowdon("", Aspect.NODORRAN));
        pokemon.add(new NodorranHoothoot("", Aspect.NODORRAN));
        pokemon.add(new NodorranInfernape("", Aspect.NODORRAN));
        pokemon.add(new NodorranKoffing("", Aspect.NODORRAN));
        pokemon.add(new NodorranMagikarp("", Aspect.NODORRAN));
        pokemon.add(new NodorranMonferno("", Aspect.NODORRAN));
        pokemon.add(new NodorranNoctowl("", Aspect.NODORRAN));
        pokemon.add(new NodorranNosepass("", Aspect.NODORRAN));
        pokemon.add(new NodorranOnix("", Aspect.NODORRAN));
        pokemon.add(new NodorranOshawott("", Aspect.NODORRAN));
        pokemon.add(new NodorranProbopass("", Aspect.NODORRAN));
        pokemon.add(new NodorranSamurott("", Aspect.NODORRAN));
        pokemon.add(new NodorranSceptile("", Aspect.NODORRAN));
        pokemon.add(new NodorranSteelix("", Aspect.NODORRAN));
        pokemon.add(new NodorranSudowoodo("", Aspect.NODORRAN));
        pokemon.add(new NodorranSunflora("", Aspect.NODORRAN));
        pokemon.add(new NodorranTeddiursa("", Aspect.NODORRAN));
        pokemon.add(new NodorranTreecko("", Aspect.NODORRAN));
        pokemon.add(new NodorranTynamo("", Aspect.NODORRAN));
        pokemon.add(new NodorranUrsaring("", Aspect.NODORRAN));
        pokemon.add(new NodorranWeezing("", Aspect.NODORRAN));
        pokemon.add(new Faunox());
        pokemon.add(new oxboy());
        pokemon.add(new Sylvotaur());
        pokemon.add(new Mouslit());
        pokemon.add(new Ignimus());
        pokemon.add(new Necromus());
        pokemon.add(new Feloam());
        pokemon.add(new Mistiger());
        pokemon.add(new Torahaze());
        pokemon.add(new Haffy());
        pokemon.add(new Baldawk());
        pokemon.add(new Stoadent());
        pokemon.add(new Amiesel());
        pokemon.add(new Ratamie());
        pokemon.add(new Betterfree());
        pokemon.add(new Imicada());
//        pokemon.add(new Suncada());   Missing Stats
        pokemon.add(new Lumiscent());
        pokemon.add(new Koiver());
        pokemon.add(new Koyshi());
        pokemon.add(new Rockillo());
        pokemon.add(new Armarolla());
        pokemon.add(new Armodrilla());
//        pokemon.add(new Qualder());   Missing Stats
        pokemon.add(new hakid());
//        pokemon.add(new Hackile());   Missing Stats
        pokemon.add(new furanea());
        pokemon.add(new Taranchusk());
        pokemon.add(new Trashic());
        pokemon.add(new Crabbish());
        pokemon.add(new Leavat());
//        pokemon.add(new Falpire());   Missing Art
        pokemon.add(new Simburn());
        pokemon.add(new Felectroar());
        pokemon.add(new kibinusu());
        pokemon.add(new Afripup());
//        pokemon.add(new Papadoooge());   Missing Art
        pokemon.add(new Snaize());
//        pokemon.add(new Mimicorn());   Missing Art
//        pokemon.add(new Dracorn());   Missing Art
        pokemon.add(new Balldude());
//        pokemon.add(new Ballevo());   Missing Art
        pokemon.add(new Choaking());
        pokemon.add(new Cerojolt());
//        pokemon.add(new Soapup());   Missing Art
//        pokemon.add(new Soapherd());   Missing Art
//        pokemon.add(new Penumbillar());   Missing Art
        pokemon.add(new Particoon());
//        pokemon.add(new Totalimoth());   Missing Art
//        pokemon.add(new Rockdude());   Missing Art
        pokemon.add(new Rostone());
        pokemon.add(new Electone());
        pokemon.add(new Gravatone());
        pokemon.add(new Moistone());
        pokemon.add(new Aquatone());
        pokemon.add(new Meltone());
        pokemon.add(new Firerock2());
        pokemon.add(new Pastone());
        pokemon.add(new Mosstone());
//        pokemon.add(new Buckalf());   Missing Art
//        pokemon.add(new Camel2());   Missing Art
        pokemon.add(new Runnabun());
//        pokemon.add(new TReggs());   Missing Art
        pokemon.add(new Crabip());
        pokemon.add(new Scissorab());
        pokemon.add(new Crabruner());
        pokemon.add(new Snolm());
        pokemon.add(new Snowder());
        pokemon.add(new Frauster());
        pokemon.add(new Scroul()); //Renamed from Scroul
        pokemon.add(new OlysosianScroul("", Aspect.OLYSOSIAN));
        pokemon.add(new Magisbook());
        pokemon.add(new Prudexwell());
        pokemon.add(new Clusk());
        pokemon.add(new Nimbusk());
        pokemon.add(new Yuheffo());
        pokemon.add(new Ufo2());
//        pokemon.add(new Pillowghost());   Missing Art
        pokemon.add(new Hatgic());
        pokemon.add(new Hoodrikus());
        pokemon.add(new puppesite());
        pokemon.add(new Akaineko());
        pokemon.add(new Squink());
        pokemon.add(new Inquidy());
        pokemon.add(new krakuid());
        pokemon.add(new Sarqua());
        pokemon.add(new Slifin()); //Renamed from Sharfin
        pokemon.add(new Draquafin());
        pokemon.add(new Pirook());
//        pokemon.add(new Jacksparrow());   Missing Art
        pokemon.add(new Virusyte());
        pokemon.add(new Orcawhale());
        pokemon.add(new Terranguis());
        pokemon.add(new Leviathrus());
        pokemon.add(new Scaelicius());
//        pokemon.add(new Kuruhinomi());   Missing Stats
        pokemon.add(new Kanyonomi());
//        pokemon.add(new Kyokinomi());   Missing Stats
        pokemon.add(new Protagobits());
//        pokemon.add(new Trafficlight());   Missing Art
//        pokemon.add(new Knightfall());   Missing Art
    }

}
