package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.olysos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nodorro extends drai.dev.data.games.registry.Game {
    public Nodorro() {
        super("Nodorro");
    }

    @Override
    public void registerPokemon() {
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
        pokemon.add(new Suncada(new Stats(370, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        pokemon.add(new Lumiscent());
        pokemon.add(new Koiver());
        pokemon.add(new Koyshi());
        pokemon.add(new Rockillo());
        pokemon.add(new Armarolla());
        pokemon.add(new Armodrilla());
        pokemon.add(new Qualder(new Stats(495, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        pokemon.add(new hakid()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Hackile());   Missing Art
        pokemon.add(new furanea());
        pokemon.add(new Taranchusk());
        pokemon.add(new Trashic());
        pokemon.add(new Crabbish());
//        pokemon.add(new Leavat()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Falpire());   Missing Art
        pokemon.add(new Simburn());
        pokemon.add(new Felectroar());
        pokemon.add(new kibinusu());
//        pokemon.add(new Afripup()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Papadoooge());   Missing Art
//        pokemon.add(new Snaize()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Mimicorn());   Missing Art
//        pokemon.add(new Dracorn());   Missing Art
//        pokemon.add(new Balldude()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Ballevo());   Missing Art
        pokemon.add(new Choaking());
        pokemon.add(new Cerojolt());
//        pokemon.add(new Soapup());   Missing Art
//        pokemon.add(new Soapherd());   Missing Art
//        pokemon.add(new Penumbillar());   Missing Art
//        pokemon.add(new Particoon()); MEMBER OF LINE NOT FINISHED
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
        pokemon.add(new Yuheffa()); //Renamed from Ufo 2
//        pokemon.add(new Pillowghost());   Missing Art
        pokemon.add(new Hatgic());
        pokemon.add(new Hoodrikus());
        pokemon.add(new Puppesite());
        pokemon.add(new Akaineko());
        pokemon.add(new Squink());
        pokemon.add(new Inquidy());
        pokemon.add(new Krakuid());
        pokemon.add(new Sarqua());
        pokemon.add(new Slifin()); //Renamed from Sharfin
        pokemon.add(new Draquafin());
//        pokemon.add(new Pirook()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Jacksparrow());   Missing Art
//        pokemon.add(new Virusyte()); MEMBER OF LINE NOT FINISHED
        pokemon.add(new Orcawhale());
        pokemon.add(new Terranguis());
        pokemon.add(new Leviathrus());
        pokemon.add(new Scaelicius());
        pokemon.add(new Kuruhinomi(new Stats(580, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Kanyonomi());
        pokemon.add(new Kyokinomi(new Stats(580, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        pokemon.add(new Protagobits());
//        pokemon.add(new Trafficlight());   Missing Art
//        pokemon.add(new Knightfall());   Missing Art
    }

}
