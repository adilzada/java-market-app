import java.util.Scanner;

public class Market {
    public static void main(String[] args) {

        Scanner src=new Scanner(System.in);
        int totalMebleg =0;


        while(true){

            System.out.println("marketə xoş gəlmisiz!");
            System.out.println("ilk comanda daxil edin:\n 1-alış-verişə başla \n 2-alış verişi tamamla");
            int sechim=src.nextInt();
            if(sechim==1){

                String products="1- çörək-1 azn \n2- süd-2 azn \n 3-yağ-5 azn ";
                System.out.println(products);
                int productsSechim=src.nextInt();
                if (productsSechim==1){
                    totalMebleg=totalMebleg+1;
                }else if(productsSechim==2){
                    totalMebleg=totalMebleg+2;
                } else if (productsSechim==3) {
                    totalMebleg=totalMebleg+5;
                }else{
                    System.out.println("düzgün seçim edin!");
                }


            }else if(sechim==2){
                System.out.println("alış verişinizin dəyəri " +totalMebleg + " manat");
            }else{
                break;
            }

        }

    }
}
