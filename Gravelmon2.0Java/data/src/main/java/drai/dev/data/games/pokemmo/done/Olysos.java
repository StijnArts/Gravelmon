package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.olysos.*;

import java.util.*;

public class Olysos extends drai.dev.data.games.registry.Game {
    public Olysos() {
        super("Olysos");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Cubtus());
        addNewPokemon(new Paddorn());
        addNewPokemon(new Maanzagaro());
        addNewPokemon(new Flambah());
        addNewPokemon(new Ramligh());
        addNewPokemon(new Vulkynamo());
        addNewPokemon(new Sharkin());
        addNewPokemon(new Mawrine());
        addNewPokemon(new Orcanfrak());
//        addNewPokemon(new Phasmox());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Teumixen());   Missing Art
//        addNewPokemon(new Arfruff());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Laelupus());   Missing Art
        addNewPokemon(new Woodpeckit());
        addNewPokemon(new Peckster());
        addNewPokemon(new Peckussion());
        addNewPokemon(new Inferpillar());
        addNewPokemon(new Flamupet());
        addNewPokemon(new Flamothra(new Stats(420, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
//        addNewPokemon(new Gnaphid());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Locusteror());   Missing Art
//        addNewPokemon(new Punling());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Floretaya());   Missing Art
//        addNewPokemon(new Grandrupe());   Missing Art
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
//        addNewPokemon(new Kopiuzu());  MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Kebuzu());   Missing Art
//        addNewPokemon(new Purazu());   Missing Art
//        addNewPokemon(new Molore());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Minerolt());   Missing Art
//        addNewPokemon(new Lunuhu());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Oracowl());   Missing Art
//        addNewPokemon(new Plagfowl());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Misphecy());   Missing Art
//        addNewPokemon(new Piedow());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Ceryneer());   Missing Art
//        addNewPokemon(new Kabby());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Avalak());   Missing Art
//        addNewPokemon(new Bubby());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Coarsent());   Missing Art
//        addNewPokemon(new Yinyan());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Vivater());  MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Hydrona());   Missing Art
//        addNewPokemon(new Squishid());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Squidgeist());   Missing Art
//        addNewPokemon(new Qoxipus());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Plaxista());   Missing Art
//        addNewPokemon(new Lapili());   MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Tasmon());
        addNewPokemon(new Casanovil());
//        addNewPokemon(new Lavaleon());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Chamelaze());   Missing Art
        addNewPokemon(new Lavyrm());
        addNewPokemon(new Maganon());
        addNewPokemon(new Eruptinon());
        addPokedexPokemon("torkoal");
        addNewPokemon(new Tortorge());
        addPokedexPokemon("poochyena-olysosian, mightyena-olysosian");
        addNewPokemon(new Alphayena(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Pepstep());
        addNewPokemon(new Devilance());
//        addNewPokemon(new Twoghast());   Missing Art
//        addNewPokemon(new Forcaken());   Missing Art
//        addNewPokemon(new Scroul());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Scrolock());   Missing Art
        addNewPokemon(new Skarawel());
//        addNewPokemon(new Traplat());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Trapolem());   Missing Art
        addNewPokemon(new Allnown());
//        addNewPokemon(new Mageleon());   Missing Art
//        addNewPokemon(new Chereon());   Missing Art
        addNewPokemon(new Rustank());
        addNewPokemon(new Steamare());
//        addNewPokemon(new Artikit());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Sabretal());   Missing Art
//        addNewPokemon(new Solsaur());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Spinerno());   Missing Art
//        addNewPokemon(new Snugub());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Plushug());   Missing Art
//        addNewPokemon(new Draconaut());MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Nebulazer());   Missing Art
//        addNewPokemon(new Velocidron());   Missing Art
//        addNewPokemon(new Cupidove());   Missing Art
//        addNewPokemon(new Kismean());   Missing Art
        addNewPokemon(new Kryuu());
        addNewPokemon(new Kryoalis());
        addNewPokemon(new Phyuu());
        addNewPokemon(new Phosos());
        addNewPokemon(new Anyuu());
        addNewPokemon(new Anufelis());
        addNewPokemon(new Kaisaos());
        addNewPokemon(new Monokron());
        addNewPokemon(new Klepeck());
        addNewPokemon(new Magusong(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new Yukibi());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Yukiku());   Missing Art
//        addNewPokemon(new Safrion());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Saffry());   Missing Art
//        addNewPokemon(new Nagamufin());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Mediva());   Missing Art
//        addNewPokemon(new Ladivy());   Missing Art
//        addNewPokemon(new Terrino());   Missing Art
//        addNewPokemon(new Mermana());   Missing Art
//        addNewPokemon(new Fabumera());   Missing Art
//        addNewPokemon(new Dideep());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Searkat());   Missing Art
//        addNewPokemon(new Mosaile());   MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Krokoblok());   Missing Art
//        addNewPokemon(new Mosalegod());   Missing Art
//        addNewPokemon(new Flufflet());   Missing Art
//        addNewPokemon(new Chrysow());   Missing Art
//        addNewPokemon(new Worrym());   Missing Art
//        addNewPokemon(new Sangorko());   Missing Art
        addNewPokemon(new Serenine(new Stats(380, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
    }

}
