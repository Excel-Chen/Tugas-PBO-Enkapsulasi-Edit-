public class RumusBalok{
   //Balok
   int panjang, lebar, tinggi, LuasBal,VolBal;
   //Setter / Method
   //Constructor set nilai awal
   public void setPanjang(int panjang){
       this.panjang = panjang;
   }
   public void setLebar(int lebar){
       this.lebar = lebar;
   }
   public void setTinggi(int tinggi){
       this.tinggi = tinggi;
   }

   //Getter ada di gunakan di dalam MainBangunRuang
   public int GetPanjang(){
       return this.panjang ;
   }
   public int GetLebar(){
       return this.lebar ;
   }
   public int GetTinggi(){
       return this.tinggi;
   }

   public int LuasBalok(){
       this.LuasBal = 2  * (this.panjang * this.lebar + this.panjang * this.tinggi
        + this.lebar * this.tinggi)  ;
       return this.LuasBal;
   }
   public int VolBalok(){
       this.VolBal = this.panjang * this.lebar * this.tinggi;
       return this.VolBal;
   }
   //tostring
   @Override
   public String toString(){
       return "\nPanjang Balok : " + this.panjang + "\nLebar Balok : "
       + this.lebar + "\nTinggi Balok : " + this.tinggi;
   }
}

