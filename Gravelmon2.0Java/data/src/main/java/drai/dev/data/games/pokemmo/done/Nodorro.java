package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.nodorro.*;

import java.util.*;

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
        addNewPokemon(new Ratamie());
        addNewPokemon(new Betterfree());
        addNewPokemon(new Imicada());
        addNewPokemon(new Suncada(new Stats(370, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Lumiscent());
        addNewPokemon(new Koiver());
        addNewPokemon(new Koyshi());
        addNewPokemon(new Rockillo());
        addNewPokemon(new Armarolla());
        addNewPokemon(new Armodrilla());
        addNewPokemon(new Qualder(new Stats(495, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        addNewPokemon(new hakid()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Hackile());   Missing Art
        addNewPokemon(new furanea());
        addNewPokemon(new Taranchusk());
        addNewPokemon(new Trashic());
        addNewPokemon(new Crabbish());
//        addNewPokemon(new Leavat()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Falpire());   Missing Art
        addNewPokemon(new Simburn());
        addNewPokemon(new Felectroar());
        addNewPokemon(new kibinusu());
//        addNewPokemon(new Afripup()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Papadoooge());   Missing Art
//        addNewPokemon(new Snaize()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Mimicorn());   Missing Art
//        addNewPokemon(new Dracorn());   Missing Art
//        addNewPokemon(new Balldude()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Ballevo());   Missing Art
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
        addNewPokemon(new Snolm());
        addNewPokemon(new Snowder());
        addNewPokemon(new Frauster());
        addNewPokemon(new Scroul()); //Renamed from Scroul
//        addNewPokemon(new OlysosianScroul("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Magisbook());
        addNewPokemon(new Prudexwell());
        addNewPokemon(new Clusk());
        addNewPokemon(new Nimbusk());
        addNewPokemon(new Yuheffo());
        addNewPokemon(new Yuheffa()); //Renamed from Ufo 2
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
