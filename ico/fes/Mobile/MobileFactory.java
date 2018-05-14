
package ico.fes.Mobile;


import prueba.celulares.Samsung;
import prueba.celulares.LG;
import prueba.celulares.Motorola;
import prueba.celulares.Sony;
import prueba.celulares.Huawei;
import prueba.celulares.Iphone;
import static ico.fes.Mobile.Mobile.Samsung;
import static ico.fes.Mobile.Mobile.Sony;
import static ico.fes.Mobile.Mobile.Iphone;
import static ico.fes.Mobile.Mobile.Motorola;



public class MobileFactory {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.Iphone)){
			return new Iphone(3, "A9", "A9 GPu");
		}else if(type.equals(Mobile.Sony)){
			return new Sony(4,"Qualcomm Snapdragon","ARM");
		}else if(type.equals(Mobile.Samsung)){
			return new Samsung(2,"Qualcomm Snapdragon","Intel");
		}else if(type.equals(Mobile.Huawei)){
			return new Huawei(3, "Kirin 980", "ARM");
		}else if(type.equals(Mobile.LG)){
			return new LG(2, "Qualcomm Snapdragon", "ARM");
		}else if(type.equals(Mobile.Motorola)){
			return new Motorola(3, "Qualcomm Snapdragon", "ARM");
                }else
                {
			return null;
		}
	}
}
    

