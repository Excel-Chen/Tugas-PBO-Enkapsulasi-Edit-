public class RumusKubus{
    //Kubus
    int sisi, LuasKub,VolKub;
    //Constructor set nilai awal
    //Setter / Method
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    //Getter ada di gunakan di dalam MainBangunRuang
    public int GetSisi(){
        return this.sisi ;
    }

    public int LuasKubus(){
        this.LuasKub = 6  * this.sisi * this.sisi;
        return this.LuasKub;
    }
    public int VolKubus(){
        this.VolKub = this.sisi * this.sisi * this.sisi;
        return this.VolKub;
    }
    //tostring
    @Override
    public String toString(){
       return "\nSisi Kubus : " + this.sisi ;
   }
}

