void main() {
    Leaf a = new Leaf();
    Page b = new Page();
    Pancake c = new Pancake();
    LightSwitch d = new LightSwitch();
    CompassPoint e = new CompassPoint();

    for (int i = 0; i < 5; i++) {
        a.turn();
        b.turn();
        c.turn();
        d.turn();
        e.turn();
        System.out.println();
    }


}