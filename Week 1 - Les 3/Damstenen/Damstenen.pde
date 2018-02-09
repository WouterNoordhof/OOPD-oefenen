class Damsteen {
  int kleur, x, y, diameter;

  Damsteen(int kleur, int x, int y, int diameter) {
    this.kleur = kleur;
    this.x = x;
    this.y = y;
    this.diameter = diameter;
  }  
  void teken () {
    fill(kleur);
    ellipse(x, y, diameter, diameter);
  }
}

Damsteen[] Dam = 
  { 
  new Damsteen (#ABCDEF, 0, 0, 50), 
  new Damsteen (#ABCDEF, 50, 50, 50), 
  new Damsteen (#FEDCBA, 0, 50, 50), 
  new Damsteen (#FEDCBA, 50, 0, 50)
};

//Dam[0] = new Damsteen(255, 0, 0, 50);
//Dam[1] = new Damsteen(255, 50, 50, 50);
//Dam[2] = new Damsteen(0, 0, 50, 50);
//Dam[3] = new Damsteen(0, 50, 0, 50);

void setup() {
  size(500, 500);
  ellipseMode(CORNER);

  for (int i =0; i < Dam.length; i++) {
    Dam[i].teken();
  }
}