package Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kantin {
    
    private HashMap<Integer,Tenant> daftarTenant = new HashMap<>();
    private HashMap<Integer, Menu> daftarMenu = new HashMap<>();
    Tenant satu = new Tenant(1,"Cafetarian");
   
    public void loadMenu(){
        
        Tenant dua = new Tenant(2, "Mivorian");
        
        Menu kantin;
        
        kantin = new Menu(satu, 1, "Nasi Goreng", "Makanan", 10000);
        daftarMenu.put(kantin.idmenu, kantin);
        kantin = new Menu(satu, 2, "Nasi Bakar", "Makanan", 12000);
        daftarMenu.put(kantin.idmenu, kantin);
        kantin = new Menu(satu, 3, "Nasi Goreng Spesial", "Makanan", 15000);
        daftarMenu.put(kantin.idmenu, kantin);
        kantin = new Menu(satu, 4, "Sayur Nanas", "Makanan", 12000);
        daftarMenu.put(kantin.idmenu, kantin);
        kantin = new Menu(satu, 5, "Ayam Bakar", "Makanan", 14000);
        daftarMenu.put(kantin.idmenu, kantin);
        kantin = new Menu(satu, 6, "Sekoteng", "Minuman", 8000);
        daftarMenu.put(kantin.idmenu, kantin);
        
    }
    public ArrayList ListMenu(){
        ArrayList<Menu> list = new ArrayList<>();
        Menu kantin;
        kantin = new Menu(satu, 1, "Nasi Goreng", "Makanana", 12000);
        list.add(kantin);
        return list;
    }
    public void printDaftarMenu(){
        
        System.out.println("Nama Tenant:"+satu.namatenant);
        daftarMenu.entrySet().stream().map((entry) -> {
            Integer key = entry.getKey();
            return entry;
        }).map((entry) -> entry.getValue()).forEachOrdered((value) -> {
            value.printinfo();
        });
    }
    
    public static void main(String[] args) {
        Kantin a = new Kantin();
        System.out.println("===== INFO TENANT ======");
        a.loadMenu();
        a.printDaftarMenu();
    }
}
    
    
