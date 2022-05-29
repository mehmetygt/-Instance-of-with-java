
class Hayvan{
  private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
    return "hayvan konuşuyor..";}
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class At extends  Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Main {
      public static void konustur(Object object){
          // polimorphism kullanmadığımız zaman böyylesi bir uzun yol kullanmak zorunda kalırız.
          //
       
          if (object instanceof Hayvan) {
             Hayvan hayvan=(Hayvan)object;
              System.out.println(hayvan.konus());
          }
          else if (object instanceof Kedi) {
              Kedi kedi=(Kedi)object;
               System.out.println(kedi.konus());
              
          }
          else if (object instanceof Kopek) {
             Kopek kopek=(Kopek)object;
              System.out.println(kopek.konus());
              
          }
           else if (object instanceof At) {
             At at=(At)object;
              System.out.println(at.konus());
              
          }
}
    
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("çiçek");
        Hayvan kedi=new Kedi("tekir");
        Hayvan kopek=new Kopek("karabaş");
        Hayvan at=new At("şahbatur");
        
      
        
        konustur(hayvan);
        konustur(kedi);
        konustur(kopek);
        konustur(at);
        
        
    }
  
    
}
