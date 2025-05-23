package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.nodorro.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//TODO update
public class Nodorro extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Nodorro();
    private Nodorro() {
        super("Nodorro");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Faunox());
        addNewPokemon(new Fauxian());
        addNewPokemon(new Sylvotaur());
        addNewPokemon(new Mouslit());
        addNewPokemon(new Ignimus());
        addNewPokemon(new Necromus());
        addNewPokemon(new Feloam());
        addNewPokemon(new Mistiger());
        addNewPokemon(new Torahaze());
        addNewPokemon(new Haffy());
        addNewPokemon(new Baldawk());
        addNewPokemon(new Stoadent());
        addNewPokemon(new Amiesel());
        addPokedexPokemon("rattata");
        addNewPokemon(new Ratamie());
        addPokedexPokemon("caterpie, metapod");
        addNewPokemon(new Betterfree());
        addNewPokemon(new Imicada());
        addNewPokemon(new Suncada(new Stats(370, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addPokedexPokemon("sunkern");
        addNewPokemon(new NodorranSunflora("", Aspect.NODORRAN));
        addPokedexPokemon("oddish, gloom, vileplume, bellossom");
        addNewPokemon(new Lumiscent());
        addNewPokemon(new NodorranFoongus("", Aspect.NODORRAN));
        addNewPokemon(new NodorranAmoonguss("", Aspect.NODORRAN));
        addNewPokemon(new Koiver());
        addNewPokemon(new Koyshi());
        addNewPokemon(new Rockillo());
        addNewPokemon(new Armarolla());
        addNewPokemon(new Armodrilla());
        addNewPokemon(new Qualder(new Stats(495, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        addNewPokemon(new hakid()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Hackile());   Missing Art
        addNewPokemon(new Furanea());
        addNewPokemon(new Taranchusk());
        addNewPokemon(new Trashic());
        addNewPokemon(new Crabbish());
        addNewPokemon(new NodorranMagikarp("", Aspect.NODORRAN));
        addNewPokemon(new NodorranGyarados("", Aspect.NODORRAN));
//        addNewPokemon(new Leavat()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Falpire());   Missing Art
        addNewPokemon(new NodorranTeddiursa("", Aspect.NODORRAN));
        addNewPokemon(new NodorranUrsaring("", Aspect.NODORRAN));
        addNewPokemon(new NodorranHoothoot("", Aspect.NODORRAN));
        addNewPokemon(new NodorranNoctowl("", Aspect.NODORRAN));
        addNewPokemon(new NodorranHippopotas("", Aspect.NODORRAN));
        addNewPokemon(new NodorranHippowdon("", Aspect.NODORRAN));
        addNewPokemon(new NodorranCubchoo("", Aspect.NODORRAN));
        addNewPokemon(new NodorranBeartic("", Aspect.NODORRAN));
        addNewPokemon(new NodorranEkans("", Aspect.NODORRAN));
        addNewPokemon(new NodorranArbok("", Aspect.NODORRAN));
        addNewPokemon(new Simburn());
        addNewPokemon(new Felectroar());
        addNewPokemon(new kibinusu());
//        addNewPokemon(new Afripup()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Papadoooge());   Missing Art
//        addNewPokemon(new Snaize()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Mimicorn());   Missing Art
//        addNewPokemon(new Dracorn());   Missing Art
        addNewPokemon(new NodorranBonsly("", Aspect.NODORRAN));
        addNewPokemon(new NodorranSudowoodo("", Aspect.NODORRAN));
        addNewPokemon(new NodorranNosepass("", Aspect.NODORRAN));
        addNewPokemon(new NodorranProbopass("", Aspect.NODORRAN));
//        addNewPokemon(new Balldude()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Ballevo());   Missing Art
        addNewPokemon(new NodorranKoffing("", Aspect.NODORRAN));
        addNewPokemon(new NodorranWeezing("", Aspect.NODORRAN));
        addNewPokemon(new Choaking());
        addNewPokemon(new Cerojolt());
//        addNewPokemon(new Soapup());   Missing Art
//        addNewPokemon(new Soapherd());   Missing Art
//        addNewPokemon(new Penumbillar());   Missing Art
//        addNewPokemon(new Particoon()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Totalimoth());   Missing Art
//        addNewPokemon(new Rockdude());   Missing Art
        addNewPokemon(new Rostone());
        addNewPokemon(new Electone());
        addNewPokemon(new Gravatone());
        addNewPokemon(new Moistone());
        addNewPokemon(new Aquatone());
        addNewPokemon(new Meltone());
        addNewPokemon(new Magtone());
        addNewPokemon(new Pastone());
        addNewPokemon(new Mosstone());
//        addNewPokemon(new Buckalf());   Missing Art
//        addNewPokemon(new Camel2());   Missing Art
        addNewPokemon(new Runnabun());
//        addNewPokemon(new TReggs());   Missing Art
        addNewPokemon(new Crabip());
        addNewPokemon(new Scissorab());
        addNewPokemon(new Crabruner());
        addNewPokemon(new NodorranGastly("", Aspect.NODORRAN));
        addNewPokemon(new NodorranHaunter("", Aspect.NODORRAN));
        addNewPokemon(new NodorranGengar("", Aspect.NODORRAN));
        addNewPokemon(new Snolm());
        addNewPokemon(new Snowder());
        addNewPokemon(new Frauster());
        addNewPokemon(new Scroul()); //Renamed from Scroul
//        addNewPokemon(new OlysosianScroul("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Magisbook());
        addNewPokemon(new Prudexwell());
        addNewPokemon(new NodorranOnix("", Aspect.NODORRAN));
        addNewPokemon(new NodorranSteelix("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranTynamo("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranEelektrik("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranEelektross("", Aspect.NODORRAN)); MISSING ART
        addNewPokemon(new Clusk());
        addNewPokemon(new Nimbusk());
        addNewPokemon(new Yuheffo());
        addNewPokemon(new Yuheffa()); //Renamed from Ufo 2
        addNewPokemon(new NodorranDrifblim("", Aspect.NODORRAN));
        addNewPokemon(new NodorranDrifloon("", Aspect.NODORRAN));
//        addNewPokemon(new Pillowghost());   Missing Art
        addNewPokemon(new Hatgic());
        addNewPokemon(new Hoodrikus());
        addNewPokemon(new Puppesite());
        addNewPokemon(new Akaineko());
        addNewPokemon(new Cephinky()); //renamed from squink
        addNewPokemon(new Inquidy());
        addNewPokemon(new Krakuid());
        addNewPokemon(new Sarqua());
        addNewPokemon(new Slifin()); //Renamed from Sharfin
        addNewPokemon(new Draquafin());
//        addNewPokemon(new Pirook()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Jacksparrow());   Missing Art
//        addNewPokemon(new Virusyte()); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Tortanic());
        addNewPokemon(new Terranguis());
        addNewPokemon(new Leviathrus());
        addNewPokemon(new Scaelicius());
//        addNewPokemon(new NodorranTreecko("", Aspect.NODORRAN));  MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranGrovyle("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranSceptile("", Aspect.NODORRAN)); Missing art
        addNewPokemon(new NodorranChimchar("", Aspect.NODORRAN));
        addNewPokemon(new NodorranMonferno("", Aspect.NODORRAN));
        addNewPokemon(new NodorranInfernape("", Aspect.NODORRAN));
        addNewPokemon(new NodorranOshawott("", Aspect.NODORRAN));
        addNewPokemon(new NodorranDewott("", Aspect.NODORRAN));
        addNewPokemon(new NodorranSamurott("", Aspect.NODORRAN));
        addNewPokemon(new Kuruhinomi(new Stats(580, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Kanyonomi());
        addNewPokemon(new Kyokinomi(new Stats(580, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Protagobits());
//        addNewPokemon(new Trafficlight());   Missing Art
//        addNewPokemon(new Knightfall());   Missing Art
    }

}
