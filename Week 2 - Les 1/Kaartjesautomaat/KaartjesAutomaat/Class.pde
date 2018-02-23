class KaartjesMachine {
  String n; 
  float p, w, t, i;

  KaartjesMachine(String n, float p) {
    this.n = n;
    this.p = p;
  }

  float berekenWisselgeld() {
    this.w = this.i - this.p;
    return this.w;
  }

  void geefWisselgeld() {
    if (this.w == 0) {
      println("Geen wisselgeld, bedankt en tot ziens");
    } else if (this.w < 0) {
      println("Werp meer geld in");
    } else if (this.w > 0) {
      println("Wisselgeld ="+this.w);
    }
  }
}