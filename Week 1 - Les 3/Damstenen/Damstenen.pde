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

void setup() {
  size(500, 500);
  ellipseMode(CORNER);
  Damsteen[] Dam = new Damsteen[4]; 

  for (int i=0; i<Dam.length/2; i++) {
    Dam[i] = new Damsteen(255, i*50, i*50, 50);
  }

  for (int i=Dam.length/2; i<Dam.length; i++) {
    Dam[i] = new Damsteen(0, 50+i*50, 50+i*50, 50);
  }

  for (int i =0; i < Dam.length; i++) {
    Dam[i].teken();
  }
}