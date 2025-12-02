{
    name: "Sheagullite",
    spritenum: 620,
    megaStone: "sheagull-mega",
    megaEvolves: "sheagull",
    itemUser: ["sheagull"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10217: 760,
    gen: 6,
    isNonstandard: "Past"
}
