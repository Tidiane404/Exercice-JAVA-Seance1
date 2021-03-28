public class Exercice3{
    public static void main(String[] args) {
        int nbre1 = 1; 
        int nbre2 = 2; 
        int nbre3 = 3; 
        int min = 0;
        int max = 0; 
        int moy = 0;
       
        if(nbre1>nbre2){
            min=nbre2;
            max=nbre1;
        }else{
            min=nbre1;
            max=nbre2;
        }
        if(nbre3<min){
            moy=min;
            min=nbre3;
        }else{
            if(nbre3<max){
              moy=nbre3;
            }else{
              moy=max;
              max=nbre3;
            }
        }

        System.out.println("L'ordre croissant donne :"+min +"-"+ moy +"-"+ max);
        System.out.println("L'ordre décroissant donne :"+max +"-"+ moy +"-"+ min);


    }
}

