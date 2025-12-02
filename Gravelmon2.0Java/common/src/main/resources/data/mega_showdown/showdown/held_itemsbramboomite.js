{
    name: "Bramboomite",
    spritenum: 620,
    megaStone: "bramboom-mega",
    megaEvolves: "bramboom",
    itemUser: ["bramboom"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10158: 760,
    gen: 6,
    isNonstandard: "Past"
}
