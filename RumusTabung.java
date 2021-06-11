public class RumusTabung{
    //Tabung
    int jari, tinggi;
    double LuasTab, VolTab;
    double pi = 3.14;

    //Constructor set nilai awal
    //Setter / Method
    public void setJari(int jari){
        this.jari = jari;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    //Getter ada di gunakan di dalam MainBangunRuang
    public int GetJari(){
        return this.jari ;
    }

    public int GetTinggi(){
        return this.tinggi ;
    }
    public double LuasTabung(){
        this.LuasTab = 2 * pi * this.jari * (this.jari + this.tinggi);
        return this.LuasTab;
    }
    public double VolTabung(){
        this.VolTab = pi * this.jari * this.jari * this.tinggi;
        return this.VolTab;
    }
    //tostring
    @Override
    public String toString(){
       return "\nRuas Tabung : " + this.jari + "\nTinggi Tabung : "
       + this.tinggi;
   }
}



