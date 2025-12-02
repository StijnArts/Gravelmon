{
    name: "Deltaruinmetagrossite",
    spritenum: 620,
    megaStone: "metagross-deltaruin_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== deltaruin)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10258: 760,
    gen: 6,
    isNonstandard: "Past"
}
