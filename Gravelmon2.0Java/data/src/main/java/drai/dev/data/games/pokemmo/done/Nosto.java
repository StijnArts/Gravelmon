package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.nosto.*;

import java.util.*;

//done
public class Nosto extends drai.dev.data.games.registry.Game {
    public Nosto() {
        super("Nosto");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Neschick());
        addNewPokemon(new Phloxling());
        addNewPokemon(new Mosstrich());
        addNewPokemon(new Treetle());
        addNewPokemon(new Tumball());
        addNewPokemon(new Titanoss());
        addNewPokemon(new Pepinch());
        addNewPokemon(new Torpepo());
        addNewPokemon(new Melauncher(new Stats(563, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Charrat());
        addNewPokemon(new Blashrew());
        addNewPokemon(new Explodent());
        addNewPokemon(new Squiddle());
        addNewPokemon(new Squignite());
        addNewPokemon(new Cephlame());
        addNewPokemon(new Drimp());
        addNewPokemon(new Prawnee());
        addNewPokemon(new Fabulusk());
        addNewPokemon(new Cheekii());
        addNewPokemon(new Grumpster());
        addNewPokemon(new Ferasquab());
        addNewPokemon(new Streedove());
        addNewPokemon(new Urbigeon(new Stats(492, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Principillar());
        addNewPokemon(new Kookoon());
        addNewPokemon(new Fluttereign());
        addNewPokemon(new Larvake());
        addNewPokemon(new Mockoon());
        addNewPokemon(new Mimoth());
        addNewPokemon(new Cherm());
        addNewPokemon(new Cherrish());
        addNewPokemon(new Denshirui());
        addNewPokemon(new Melabuzz());
        addNewPokemon(new Mieltz());
        addNewPokemon(new Mieltzar(new Stats(405, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Budcheep());
        addNewPokemon(new Paratweet());
        addNewPokemon(new Pinksqueek());
        addNewPokemon(new Pinkaboo(new Stats(425, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Stalittle());
        addNewPokemon(new Sedinane());
        addNewPokemon(new Carrauntain(new Stats(501, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tuburrow());
        addNewPokemon(new Tunnelurm());
        addNewPokemon(new Audibat());
        addNewPokemon(new Chiraudio());
        addNewPokemon(new Echolocave());
        addNewPokemon(new Flintten());
        addNewPokemon(new Scruffur());
        addNewPokemon(new Olynx());
        addNewPokemon(new Hairibble());
        addNewPokemon(new Furrocious());
        addNewPokemon(new Glyptic());
        addNewPokemon(new Buttereef());
        addNewPokemon(new Oarful());
        addNewPokemon(new Pyrant());
        addNewPokemon(new Piluma());
        addNewPokemon(new Killarumi());
        addNewPokemon(new Metalien());
        addNewPokemon(new Lunetal());
        addNewPokemon(new Galextrial());
        addNewPokemon(new Shrimpond(new Stats(312, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Pekaboo());
        addNewPokemon(new Pitohood());
        addNewPokemon(new Aviafel());
        addNewPokemon(new Cursour());
        addNewPokemon(new Frankensour());
//        pokemon.add(new Dragome()); Member of line Not Finished
        addNewPokemon(new Halux());
        addNewPokemon(new Visiangel());
        addNewPokemon(new Marshun());
        addNewPokemon(new Brailien());
        addNewPokemon(new Cereboost(new Stats(567, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Pix());
        addNewPokemon(new PixE());
        addNewPokemon(new PixL());
        addNewPokemon(new Twinkluppy());
        addNewPokemon(new Notillunar(new Stats(421, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
//        pokemon.add(new dog());Member of line Not Finished
        addNewPokemon(new Rosinella());
        addNewPokemon(new Sinsenella());
        addNewPokemon(new Dysmerella());
        addNewPokemon(new Signapsi());
        addNewPokemon(new Reneuron());
        addNewPokemon(new Brainergy());
        addPokedexPokemon("morelull-nostan, shiinotic-nostan");
        addNewPokemon(new Primmella());
        addNewPokemon(new Primmadame());
        addNewPokemon(new Primmoiselle());
        addNewPokemon(new Plasduck());
        addNewPokemon(new Fauxmingo());
        addNewPokemon(new Swandola());
        addNewPokemon(new Buldough());
        addPokedexPokemon("diglett-nostan, dugtrio-nostan");
        addNewPokemon(new Duggout());

        addNewPokemon(new Seasaw());
        addNewPokemon(new Chainjaw());
        addNewPokemon(new Atlarv());
        addNewPokemon(new Atlagon());
        addNewPokemon(new Pigstyk());
        addNewPokemon(new Lumboar());
        addNewPokemon(new Hogstead());
        addNewPokemon(new Planebe());
        addNewPokemon(new Staurbor());
        addNewPokemon(new Mantaqua());
        addPokedexPokemon("shellder-nostan, cloyster-nostan");
        addNewPokemon(new Merineon());
        addNewPokemon(new Teslax());
        addNewPokemon(new Zexalax());
        addNewPokemon(new Diagem());
        addNewPokemon(new Cephalotox());
        addNewPokemon(new Feiring());
        addNewPokemon(new Pendelf());
        addNewPokemon(new Encrona());
        addNewPokemon(new Tilow());
        addNewPokemon(new Candhoul());
        addNewPokemon(new Chandemise());
        addNewPokemon(new Novil());
        addNewPokemon(new Azatome());
        addNewPokemon(new Necromanos());
        addNewPokemon(new Vaniteeny());
        addNewPokemon(new Boodoir());
        addNewPokemon(new Maspook());
        addNewPokemon(new Cresprit());
        addNewPokemon(new Spectmare());
        addNewPokemon(new Suravi());
        addNewPokemon(new Pzeigon());
    }

}
