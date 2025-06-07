package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.olysos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Olysos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Olysos();
    private Olysos() {
        super("Olysos");
    }

    @Override
    public void registerPokemon() {
        /*addNewPokemon(new Cubtus().addLabels(Label.STARTER));
        addNewPokemon(new Paddorn().addLabels(Label.STARTER));
        addNewPokemon(new Maanzagaro().addLabels(Label.STARTER));
        addNewPokemon(new Flambah().addLabels(Label.STARTER));
        addNewPokemon(new Ramligh().addLabels(Label.STARTER));
        addNewPokemon(new Vulkynamo().addLabels(Label.STARTER));
        addNewPokemon(new Sharkin().addLabels(Label.STARTER));
        addNewPokemon(new Mawrine().addLabels(Label.STARTER));
        addNewPokemon(new Orcanfrak().addLabels(Label.STARTER));
        addNewPokemon(new Phasmox());
        addNewPokemon(new Teumixen());
        addNewPokemon(new Arfruff());
        addNewPokemon(new Laelupus());
        addNewPokemon(new Woodpeckit());
        addNewPokemon(new Peckster());
        addNewPokemon(new Peckussion());
        addNewPokemon(new Inferpillar());
        addNewPokemon(new Flamupet());
        addNewPokemon(new Flamothra(new Stats(420, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Gnaphid());
        addNewPokemon(new Locusteror());
        addNewPokemon(new Punling());
        addNewPokemon(new Floretaya());
        addNewPokemon(new Grandrupe());
        addNewPokemon(new Happetite());
        addNewPokemon(new Serposter());
        addNewPokemon(new Venobat());
        addNewPokemon(new Noseferatu(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tryprock());
        addNewPokemon(new Trypagnet());
        addNewPokemon(new Trypolisk());
        addNewPokemon(new Grimlin());
        addNewPokemon(new Grumpelstil());
        addNewPokemon(new Oozegrim());
        addNewPokemon(new Kopiuzu());
        addNewPokemon(new Kebuzu());
        addNewPokemon(new Purazu());
        addNewPokemon(new Molore());
        addNewPokemon(new Minerolt());
        addNewPokemon(new Lunuhu());   //TODO
        addNewPokemon(new Oracowl());
        addNewPokemon(new Plagfowl());   //TODO
        addNewPokemon(new Misphecy());
        addNewPokemon(new Piedow());//TODO
        addNewPokemon(new Ceryneer());
        addNewPokemon(new Kabby());   //TODO
        addNewPokemon(new Avalak());
        addNewPokemon(new OlysosianBuneary("", Aspect.OLYSOSIAN)); //TODO
        addNewPokemon(new OlysosianLopunny("", Aspect.OLYSOSIAN));
        addNewPokemon(new Bubby());   //TODO
        addNewPokemon(new Coarsent());
        addNewPokemon(new Yinyan());   //TODO
        addNewPokemon(new Vivater());  //TODO
        addNewPokemon(new Hydrona());
        addNewPokemon(new Squishid());//TODO
        addNewPokemon(new Squidgeist());
        addNewPokemon(new Qoxipus());   //TODO
        addNewPokemon(new Plaxista());
        addNewPokemon(new Lapili());   //TODO
        addNewPokemon(new Tasmon());
        addNewPokemon(new Casanovil());
        addNewPokemon(new Lavaleon());   //TODO
        addNewPokemon(new Chamelaze());
        addNewPokemon(new Lavyrm());
        addNewPokemon(new Maganon());
        addNewPokemon(new Eruptinon());
        addPokedexPokemon("torkoal");
        addNewPokemon(new Tortorge());
        addNewPokemon(new OlysosianMightyena("", Aspect.OLYSOSIAN));
        addNewPokemon(new OlysosianPoochyena("", Aspect.OLYSOSIAN));
        addNewPokemon(new Alphayena(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Pepstep());
        addNewPokemon(new Devilance());
        addNewPokemon(new Twoghast());
        addNewPokemon(new Forcaken());
        addNewPokemon(new Scroul());   //TODO
        addNewPokemon(new Scrolock());
        addNewPokemon(new Skarawel());
        addNewPokemon(new Traplat());//TODO
        addNewPokemon(new Trapolem());
        addNewPokemon(new Allnown());
        addNewPokemon(new Mageleon());
        addNewPokemon(new Chereon());
        addNewPokemon(new Rustank());
        addNewPokemon(new Steamare());
        addNewPokemon(new Artikit());   //TODO
        addNewPokemon(new Sabretal());
        addNewPokemon(new Solsaur());   //TODO
        addNewPokemon(new Spinerno());
        addNewPokemon(new OlysosianSkorupi("", Aspect.OLYSOSIAN));
        addNewPokemon(new OlysosianDrapion("", Aspect.OLYSOSIAN)); //TODO
        addNewPokemon(new Snugub());   //TODO
        addNewPokemon(new Plushug());
        addNewPokemon(new Draconaut().addLabels(Label.PSEUDO_LEGENDARY));//TODO
        addNewPokemon(new Nebulazer().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Velocidron().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Cupidove());
        addNewPokemon(new Kismean());
        addNewPokemon(new Kryuu());
        addNewPokemon(new Kryoalis());
        addNewPokemon(new Phyuu());
        addNewPokemon(new Phosos());
        addNewPokemon(new Anyuu().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Anufelis().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Kaisaos().addLabels(Label.LEGENDARY));
        addNewPokemon(new Monokron().addLabels(Label.LEGENDARY));
        addNewPokemon(new Klepeck());
        addNewPokemon(new Magusong(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Yukibi());   //TODO
        addNewPokemon(new Yukiku());
        addNewPokemon(new Safrion());   //TODO
        addNewPokemon(new Saffry());
        addNewPokemon(new Nagamufin());   //TODO
        addNewPokemon(new Mediva());
        addNewPokemon(new Ladivy());
        addNewPokemon(new Terrino());
        addNewPokemon(new Mermana());
        addNewPokemon(new Fabumera());
        addNewPokemon(new Dideep());   //TODO
        addNewPokemon(new Searkat());
        addNewPokemon(new Mosaile());   //TODO
        addNewPokemon(new Krokoblok());
        addNewPokemon(new Mosalegod());
        addNewPokemon(new Flufflet());
        addNewPokemon(new Chrysow());
        addNewPokemon(new Worrym());
        addNewPokemon(new Sangorko());
        addNewPokemon(new Serenine(new Stats(380, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));*/
    }

}
