
package ico.fes.Mobile;


public class Test {
    
     public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.Samsung);
                Mobile mobile1 = MobileFactory.createMobile(Mobile.Iphone);
                Mobile mobile2 = MobileFactory.createMobile(Mobile.Sony);
                Mobile mobile3 = MobileFactory.createMobile(Mobile.Motorola);
                Mobile mobile4 = MobileFactory.createMobile(Mobile.Huawei);
                Mobile mobile5 = MobileFactory.createMobile(Mobile.LG);
                
                System.out.println("Componentes Samsung: " + mobile.Samsung + "\n");
                System.out.println("Componentes Iphone: "+ mobile.Iphone+"\n");
                System.out.println("Componentes Sony: "+ mobile.Sony+"\n");
                System.out.println("Componentes Motorola: "+ mobile.Motorola+"\n");
                System.out.println("Componentes Huawei: "+ mobile.Huawei+"\n");
                System.out.println("Componentes LG: "+ mobile.LG+"\n");
                
                
                

	}
    
}
