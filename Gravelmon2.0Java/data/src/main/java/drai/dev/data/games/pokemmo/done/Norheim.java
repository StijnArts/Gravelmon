package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Norheim extends drai.dev.data.games.registry.Game {
    public Norheim() {
        super("Norheim");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Gnatle());
        addNewPokemon(new Growel());
        addNewPokemon(new Huskerous());
        addNewPokemon(new Lilyquack());
        addNewPokemon(new Weeduck());
        addNewPokemon(new Elegander());
        addNewPokemon(new Minkit());
        addNewPokemon(new Freicat());
        addNewPokemon(new Gattekat());
        addNewPokemon(new Bunbear());
        addNewPokemon(new Combjorn());
        addNewPokemon(new Burnbjorn());
        addNewPokemon(new Ignewt());
        addNewPokemon(new Hexelotl());
        addNewPokemon(new Hylamancer());
        addNewPokemon(new Calfyr());
        addNewPokemon(new Pyrelk());
        addNewPokemon(new Helelk());
        addNewPokemon(new Pouffy());
        addNewPokemon(new Puffard());
        addNewPokemon(new Pelasquall());
        addNewPokemon(new Buppie());
        addNewPokemon(new Bubawl());
        addNewPokemon(new Brinarder());
        addNewPokemon(new Bayby());
        addNewPokemon(new Tuscal());
        addNewPokemon(new Norwale());
        addNewPokemon(new Larver());
        addNewPokemon(new Strikoon());
        addNewPokemon(new Battlefly());
        addNewPokemon(new Mothight());
        addPokedexPokemon("ratata-norheiman");
        addNewPokemon(new Rowdent());
        addNewPokemon(new Lemini());
        addNewPokemon(new Gnimmel());
        addNewPokemon(new Wolverage());
        addNewPokemon(new Beboink());
        addNewPokemon(new Yoikid());
        addNewPokemon(new Hyfae());
        addNewPokemon(new Shrumin());
        addNewPokemon(new Ignikid());
        addNewPokemon(new Furyture());
        addNewPokemon(new Speyeder());
        addNewPokemon(new Thoriller());
        addNewPokemon(new Thormite());
        addNewPokemon(new Birdler());
        addNewPokemon(new Magpyja());
        addNewPokemon(new Beberin());
        addNewPokemon(new Nimbairy());
        addNewPokemon(new Bomblebee());
        addPokedexPokemon("combee, vespiquen");
        addNewPokemon(new Draftbee());
        addNewPokemon(new Snootsnoot());
        addNewPokemon(new Snowl());
        addNewPokemon(new Wispear());
        addNewPokemon(new Roomere());
        addNewPokemon(new Scubaa());
        addNewPokemon(new Hydroram());
        addPokedexPokemon("foongus-norheiman");
        addNewPokemon(new Chantarule());
        addNewPokemon(new Chantabrute());

        addNewPokemon(new Bunnler());
        addNewPokemon(new Spinache());
        addNewPokemon(new Beatroot());
        addNewPokemon(new Moler());
        addNewPokemon(new Moleheimer());
        addNewPokemon(new Potiti());
        addNewPokemon(new Potota(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        var tadit = new Tadit();
        addNewPokemon(tadit);
        addNewPokemon(new MastenianTadit("", Aspect.MASTENIAN));
        addNewPokemon(new Ribhit());
        addNewPokemon(new Thikachoo(new Stats(435, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addPokedexPokemon("surskit");
        addPokedexPokemon("masquerain-norheiman");
        addNewPokemon(new Surgeskit());
        addPokedexPokemon("voltorb-norheiman, electrode-norheiman");
        addNewPokemon(new Firipeck());
        addNewPokemon(new Fyrepecker());
        addNewPokemon(new Bwug());
        addNewPokemon(new Bwairy(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Shrisker());
        addNewPokemon(new Swirrell());
        addNewPokemon(new Meerii());
        addNewPokemon(new Laxish(new Stats(387, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Tourtell());
        addNewPokemon(new Thistelle(new Stats(407, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Aquatick());
        addNewPokemon(new Clagcoon());
        addNewPokemon(new Yggdraflygg());
        addPokedexPokemon("pineco, forretress-norheiman");
        addNewPokemon(new Grublin());
        addNewPokemon(new Wyrmlagar());
        addNewPokemon(new Pumfin());

        addNewPokemon(new Toxing());
        addNewPokemon(new Toxiver());
        addNewPokemon(new Antle());
        addNewPokemon(new Magnificant());
        addNewPokemon(new Pyrstack(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("rookidee-norheiman, corvisquire-norheiman");
        addNewPokemon(new Corvhugen());
        addPokedexPokemon("falinks-norheiman");
        addNewPokemon(new Vaiking());
        addNewPokemon(new Fulion());
        addNewPokemon(new Lopiliar());
        addNewPokemon(new Rokstone());
        addNewPokemon(new Temto(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("gossifleur, eldegoss");
        addNewPokemon(new Witherscence());
        addNewPokemon(new Slickle());
        addNewPokemon(new Stricklisk());
//        addNewPokemon(new Mudrake()); Missing Art
//        addNewPokemon(new Niidrake()); Member of Line not Finished
        addNewPokemon(new Eolid());
        addNewPokemon(new Eosoli());
        addNewPokemon(new Eoterra());
        addNewPokemon(new Tibeti());
        addNewPokemon(new Greynine());
        addPokedexPokemon("unown-norheiman");
        addNewPokemon(new Waugur());
        addNewPokemon(new Svalbat());
        addNewPokemon(new Svalor(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addPokedexPokemon("slugma, magcargo");
        addNewPokemon(new Escaruption(new Stats(578, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Dragamant());
        addNewPokemon(new Snhail());
        addNewPokemon(new Foulfoal());
        addNewPokemon(new Sleepnir());
        addNewPokemon(new Kittry());
        addNewPokemon(new Pawstry(new Stats(510, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Cariboo());
        addNewPokemon(new Spectrelk());
        addNewPokemon(new Flaki());
        addNewPokemon(new Oarora());
        addNewPokemon(new Jaggagon(new Stats(477, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Snovice());
        addNewPokemon(new Aprintice());
        addNewPokemon(new Adepthawl(new Stats(567, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Sealady(new Stats(475, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Streuming());
        addNewPokemon(new Basshark());
        addNewPokemon(new Mannbrann());
        addNewPokemon(new Sardiner());
        addNewPokemon(new Charctic());
        addNewPokemon(new Pengwin());
        addNewPokemon(new Lilheim());
        addNewPokemon(new Heimdrake());
        addNewPokemon(new Lilpras());
        addPokedexPokemon("lapras");
        addPokedexPokemon("horsea, seadra-norheiman");
        addNewPokemon(new Queendra(new Stats(540, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("corphish-norheiman, crawdaunt-norheiman, wingull");
        addNewPokemon(new Seascull(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Charryon());
        addPokedexPokemon("wailwhale-norheiman");
        addNewPokemon(new Wailwhale(new Stats(500, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Yellifish());
        addNewPokemon(new Phantocean(new Stats(498, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of())));
        addNewPokemon(new Birdurr(new Stats(376, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Mylili(new Stats(387, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        var crudecay = new Crudecay();
        addNewPokemon(crudecay);
        addNewPokemon(new MastenianCrudecay("", Aspect.MASTENIAN));  //Missing Stats
        removePokedexPokemon("crudecay-mastenian");
        addPokedexPokemon("shellder-norheiman");
        addNewPokemon(new Hingjaw());
        addNewPokemon(new Saberian());
        addPokedexPokemon("ditto-norheiman");
        addNewPokemon(new Wreggog());
        addNewPokemon(new Terrahorn());
        addNewPokemon(new Thoraxe(new Stats(500, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Dunesparr());
        addNewPokemon(new Milthunk(new Stats(490, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Deviburn());
        addNewPokemon(new Valbear());
        addPokedexPokemon("numel-norheiman");
        addNewPokemon(new Mountox(new Stats(460, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Rampina(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("diglett-norheiman");
        addPokedexPokemon("dugtrio-norheiman");
        addPokedexPokemon("snover");
        addNewPokemon(new Permaent(new Stats(494, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Uldidi());
        addNewPokemon(new Hulding());
        addNewPokemon(new Huldamer(new Stats(567, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));

        addNewPokemon(new Booseed());
        addNewPokemon(new Glowghast(new Stats(512, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("glimmora-norheiman");
        addNewPokemon(new Anenome());
        addNewPokemon(new Trollskgur());
        addNewPokemon(new Sampig(new Stats(412, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Bloorn(new Stats(387, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Lansor(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Rhydoom(new Stats(485, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Crimgon());
        addNewPokemon(new Slamander(new Stats(452, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addPokedexPokemon("sigilyph-norheiman");
        addNewPokemon(new Gloatem());
        addNewPokemon(new Aydoliman(new Stats(487, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Elefjant());
        addNewPokemon(new Mamoheim(new Stats(532, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Tundrius(new Stats(460, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Missacko(new Stats(453, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addPokedexPokemon("misdreavus");
        addPokedexPokemon("mismagius-norheiman");
        addPokedexPokemon("houndour-norheiman");
        addNewPokemon(new Grimgarmr(new Stats(500, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Reavler());
        addNewPokemon(new Safian());
        addNewPokemon(new Skatini());
        addNewPokemon(new Skaterace());
        addNewPokemon(new Spelewink());
        addNewPokemon(new Burnmigi(new Stats(431, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Fjordrake(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Wulca());
        addNewPokemon(new Wulcrush());
        addNewPokemon(new Oystr());
        addNewPokemon(new Monsturge(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Chiwowwa());
        addNewPokemon(new Woofurr());
        addNewPokemon(new Varghast());
        addPokedexPokemon("dratini");
        addPokedexPokemon("dragonair-norheiman");
        addNewPokemon(new Dracoknight());
        addNewPokemon(new Kiderr());
        addNewPokemon(new Goaterr());
        addNewPokemon(new Goathorr());
        addNewPokemon(new Afunn());
        addNewPokemon(new Volcunn(new Stats(534, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Mountunn(new Stats(534, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Glacunn(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Conduvan());
        addNewPokemon(new Wellmr());
        addNewPokemon(new Gazhel());
        addNewPokemon(new Dracruel());
        addNewPokemon(new Auumbull());
        addNewPokemon(new Spiritnir());
        addNewPokemon(new Valcurie());
        addNewPokemon(new Steinfjorir());
        addNewPokemon(new Fifii());
        addNewPokemon(new Emii());
        addNewPokemon(new Grimapa());
        addNewPokemon(new Hoglog());
        addNewPokemon(new Deiteress());
        addNewPokemon(new Hamarrcal());
        addNewPokemon(new Wyrmundel());
        addNewPokemon(new Wulfang());
        addNewPokemon(new Squisker());

    }

}
