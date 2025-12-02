{
    name: "Deltaspidermetagrossite",
    spritenum: 620,
    megaStone: "metagross-deltaspider_mega",
    megaEvolves: "metagross",
    itemUser: ["metagross"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== deltaspider)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10257: 760,
    gen: 6,
    isNonstandard: "Past"
}
