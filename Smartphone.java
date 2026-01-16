
package w7l1;
public class Smartphone {
    String brand;
    int storage; 

    public Smartphone() {
        this.brand ="Generic";
        this.storage=64;
                
    }

    public Smartphone(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }
    public void SetBrand(){
    if (brand != null && !brand.trim().isEmpty()) {
        this.brand = brand;
    } else {
        this.brand = "Generic";
    }
    }
    public String getBrand (){
    return brand;
    }
    
    public void SetStorage(){
      if (storage >=32 && storage <= 1024) {
            this.storage = storage;
        } else {
            System.out.println("error");
        }
    }
    public int getStorage (){
    return storage;
    }
    public double getBrandCost (){
          if (brand.equalsIgnoreCase("Apple")) {
        return 1000;
    } else if (brand.equalsIgnoreCase("Samsung")) {
        return 800;
    } else {
        return 500;       }
    }
    public double getStorgeCost (){
            if (storage >= 32 && storage <= 128) {
        return storage * 4;
    } 
    else if (storage >= 129 && storage <= 512) {
        return storage * 3;
    } 
    else { // 513 to 1024
        return storage * 2;
    }
    }
    
    public double getTotalCost (){
       return getStorgeCost()+getBrandCost();
    }
    
    public void UpgradeStorage(int newStorage) {
    this.storage += newStorage;
    }
    
    @Override
    public String toString() {
          return "Brand: " + brand +
           ", Storage: " + storage + "GB" +
           ", Brand Cost: " + getBrandCost() +
           ", Storage Cost: " + getStorgeCost() +
           ", Total Cost: " + getTotalCost();
}
    }
    
    
    
    

