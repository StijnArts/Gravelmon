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
        pokemon.add(new Gnatle());
        pokemon.add(new Growel());
        pokemon.add(new Huskerous());
        pokemon.add(new Lilyquack());
        pokemon.add(new Weeduck());
        pokemon.add(new Elegander());
        pokemon.add(new Minkit());
        pokemon.add(new Freicat());
        pokemon.add(new Gattekat());
        pokemon.add(new Bunbear());
        pokemon.add(new Combjorn());
        pokemon.add(new Burnbjorn());
        pokemon.add(new Ignewt());
        pokemon.add(new Hexelotl());
        pokemon.add(new Hylamancer());
        pokemon.add(new Calfyr());
        pokemon.add(new Pyrelk());
        pokemon.add(new Helelk());
        pokemon.add(new Pouffy());
        pokemon.add(new Puffard());
        pokemon.add(new Pelasquall());
        pokemon.add(new Buppie());
        pokemon.add(new Bubawl());
        pokemon.add(new Brinarder());
        pokemon.add(new Bayby());
        pokemon.add(new Tuscal());
        pokemon.add(new Norwale());
        pokemon.add(new Larver());
        pokemon.add(new Strikoon());
        pokemon.add(new Battlefly());
        pokemon.add(new Mothight());
        pokemon.add(new Rowdent());
        pokemon.add(new Lemini());
        pokemon.add(new Gnimmel());
        pokemon.add(new Wolverage());
        pokemon.add(new Beboink());
        pokemon.add(new Yoikid());
        pokemon.add(new Hyfae());
        pokemon.add(new Shrumin());
        pokemon.add(new Ignikid());
        pokemon.add(new Furyture());
        pokemon.add(new Speyeder());
        pokemon.add(new Thoriller());
        pokemon.add(new Thormite());
        pokemon.add(new Birdler());
        pokemon.add(new Magpyja());
        pokemon.add(new Beberin());
        pokemon.add(new Nimbairy());
        pokemon.add(new Bomblebee());
        pokemon.add(new Draftbee());
        pokemon.add(new Snootsnoot());
        pokemon.add(new Snowl());
        pokemon.add(new Wispear());
        pokemon.add(new Roomere());
        pokemon.add(new Scubaa());
        pokemon.add(new Hydroram());
        pokemon.add(new Chantarule());
        pokemon.add(new Chantabrute());

        pokemon.add(new Bunnler());
        pokemon.add(new Spinache());
        pokemon.add(new Beatroot());
        pokemon.add(new Moler());
        pokemon.add(new Moleheimer());
        pokemon.add(new Potiti());
        pokemon.add(new Potota(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        var tadit = new Tadit();
        pokemon.add(tadit);
        pokemon.add(new MastenianTadit("", Aspect.MASTENIAN));
        pokemon.add(new Ribhit());
        pokemon.add(new Thikachoo(new Stats(435, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Surgeskit());
        pokemon.add(new Firipeck());
        pokemon.add(new Fyrepecker());
        pokemon.add(new Bwug());
        pokemon.add(new Bwairy(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Shrisker());
        pokemon.add(new Swirrell());
        pokemon.add(new Meerii());
        pokemon.add(new Laxish(new Stats(387, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Tourtell());
        pokemon.add(new Thistelle(new Stats(407, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Aquatick());
        pokemon.add(new Clagcoon());
        pokemon.add(new Yggdraflygg());
        pokemon.add(new Grublin());
        pokemon.add(new Wyrmlagar());
        pokemon.add(new Pumfin());

        pokemon.add(new Toxing());
        pokemon.add(new Toxiver());
        pokemon.add(new Antle());
        pokemon.add(new Magnificant());
        pokemon.add(new Pyrstack(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Corvhugen());
        pokemon.add(new Vaiking());
        pokemon.add(new Fulion());
        pokemon.add(new Lopiliar());
        pokemon.add(new Rokstone());
        pokemon.add(new Temto(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Witherscence());
        pokemon.add(new Slickle());
        pokemon.add(new Stricklisk());
//        pokemon.add(new Mudrake()); Missing Art
//        pokemon.add(new Niidrake()); Member of Line not Finished
        pokemon.add(new Eolid());
        pokemon.add(new Eosoli());
        pokemon.add(new Eoterra());
        pokemon.add(new Tibeti());
        pokemon.add(new Greynine());
        pokemon.add(new Waugur());
        pokemon.add(new Svalbat());
        pokemon.add(new Svalor(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Escaruption(new Stats(578, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Dragamant());
        pokemon.add(new Snhail());
        pokemon.add(new Foulfoal());
        pokemon.add(new Sleepnir());
        pokemon.add(new Kittry());
        pokemon.add(new Pawstry(new Stats(510, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Cariboo());
        pokemon.add(new Spectrelk());
        pokemon.add(new Flaki());
        pokemon.add(new Oarora());
        pokemon.add(new Jaggagon(new Stats(477, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Snovice());
        pokemon.add(new Aprintice());
        pokemon.add(new Adepthawl(new Stats(567, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Sealady(new Stats(475, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Streuming());
        pokemon.add(new Basshark());
        pokemon.add(new Mannbrann());
        pokemon.add(new Sardiner());
        pokemon.add(new Charctic());
        pokemon.add(new Pengwin());
        pokemon.add(new Lilheim());
        pokemon.add(new Heimdrake());
        pokemon.add(new Lilpras());
        pokemon.add(new Queendra(new Stats(540, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Seascull(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Charryon());
        pokemon.add(new Wailwhale(new Stats(500, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Yellifish());
        pokemon.add(new Phantocean(new Stats(498, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of())));
        pokemon.add(new Birdurr(new Stats(376, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Mylili(new Stats(387, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        var crudecay = new Crudecay();
        pokemon.add(crudecay);
        pokemon.add(new MastenianCrudecay("", Aspect.MASTENIAN));  //Missing Stats
        pokemon.add(new Hingjaw());
        pokemon.add(new Saberian());
        pokemon.add(new Wreggog());
        pokemon.add(new Terrahorn());
        pokemon.add(new Thoraxe(new Stats(500, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Dunesparr());
        pokemon.add(new Milthunk(new Stats(490, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Deviburn());
        pokemon.add(new Valbear());
        pokemon.add(new Mountox(new Stats(460, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Rampina(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Permaent(new Stats(494, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Uldidi());
        pokemon.add(new Hulding());
        pokemon.add(new Huldamer(new Stats(567, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));

        pokemon.add(new Booseed());
        pokemon.add(new Glowghast(new Stats(512, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Anenome());
        pokemon.add(new Trollskgur());
        pokemon.add(new Sampig(new Stats(412, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Bloorn(new Stats(387, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Lansor(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Rhydoom(new Stats(485, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Crimgon());
        pokemon.add(new Slamander(new Stats(452, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Gloatem());
        pokemon.add(new Aydoliman(new Stats(487, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Elefjant());
        pokemon.add(new Mamoheim(new Stats(532, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Tundrius(new Stats(460, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Missacko(new Stats(453, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Grimgarmr(new Stats(500, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Reavler());
        pokemon.add(new Safian());
        pokemon.add(new Skatini());
        pokemon.add(new Skaterace());
        pokemon.add(new Spelewink());
        pokemon.add(new Burnmigi(new Stats(431, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Fjordrake(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Wulca());
        pokemon.add(new Wulcrush());
        pokemon.add(new Oystr());
        pokemon.add(new Monsturge(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Chiwowwa());
        pokemon.add(new Woofurr());
        pokemon.add(new Varghast());
        pokemon.add(new Dracoknight());
        pokemon.add(new Kiderr());
        pokemon.add(new Goaterr());
        pokemon.add(new Goathorr());
        pokemon.add(new Afunn());
        pokemon.add(new Volcunn(new Stats(534, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Mountunn(new Stats(534, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Glacunn(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Conduvan());
        pokemon.add(new Wellmr());
        pokemon.add(new Gazhel());
        pokemon.add(new Dracruel());
        pokemon.add(new Auumbull());
        pokemon.add(new Spiritnir());
        pokemon.add(new Valcurie());
        pokemon.add(new Steinfjorir());
        pokemon.add(new Fifii());
        pokemon.add(new Emii());
        pokemon.add(new Grimapa());
        pokemon.add(new Hoglog());
        pokemon.add(new Deiteress());
        pokemon.add(new Hamarrcal());
        pokemon.add(new Wyrmundel());
        pokemon.add(new Wulfang());
        pokemon.add(new Squisker());

    }

}
