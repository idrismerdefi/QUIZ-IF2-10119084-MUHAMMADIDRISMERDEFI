/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119084.muhammadidrismerdefi;

/**
 *
 * @author MERDEFI
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    

    @Override
    public void displayService() {
        
    }

    @Override
    public float getPrice(int serviceItem) {
       switch (serviceItem) {
            case 1:
                harga = 45;
                break;
            case 2:
                harga = 55;
                break;
            case 3:
                harga = 15;
                break;
            default:
                break;
        }
        return priceService;
        
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return true;
        
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return 0;
        
    }
    
    public float getTotalPay(float priceService,float discount){
        return 0;
        
    }
    
    
}
