public class Exercice5 {
    public static void main(String[] args) {
        byte mois = 2;
        int annee= 2021; 
        

        if (mois > 0 && mois<= 12 && annee>0) {
            switch (mois) {
                case 1:
                    System.out.println("Janvier -- "+annee +" = 31 jours");
                    break;
                case 2:
                    if(annee%4==0 && annee%100!=0 || annee%400==0 ){
                        System.out.println("Février -- "+annee +" = 28 jours"); }
                        else{
                            System.out.println("Février -- "+annee +" = 29 jours"); }
                    break;
                case 3:
                    System.out.println("Mars -- "+annee +" = 31 jours");
                    break;
                case 4:
                    System.out.println("Avril -- "+annee +" = 30 jours");
                    break;
                case 5:
                    System.out.println("Mai -- "+annee +" = 31 jours");
                    break;
                case 6:
                    System.out.println("Juin -- "+annee +" = 30 jours");
                    break;
                case 7:
                    System.out.println("Juillet -- "+annee +" = 31 jours");
                    break;
                case 8:
                    System.out.println("Aout -- "+annee +" = 31 jours");
                    break;
                case 9:
                    System.out.println("Septembre -- "+annee +" = 30 jours");
                    break;
                case 10:
                    System.out.println("Octobre -- "+annee +" = 31 jours");
                    break;
                case 11:
                    System.out.println("Novembre -- "+annee +" = 30 jours");
                    break;
                case 12:
                    System.out.println("Décembre -- "+annee +" = 31 jours");
                    break;
            
                default:
                    System.out.println("Le mois et l'année doivent etre positif, et le mois ne peut de");
                    break;
            }
        }

        Exo5 test =new Exo5();
        test.setMonth(2);
        test.setYear(2021);

        switch (test.getMonth()) {
            case 1:
                System.out.println("Janvier -- "+test.getYear() +" = 31 jours");
                break;
            case 2:
                if(test.getYear()%4==0 && test.getYear()%100!=0 || test.getYear()%400==0 ){
                    System.out.println("Février -- "+test.getYear() +" = 28 jours"); }
                    else{
                        System.out.println("Février -- "+test.getYear() +" = 29 jours"); }
                break;
            case 3:
                System.out.println("Mars -- "+test.getYear() +" = 31 jours");
                break;
            case 4:
                System.out.println("Avril -- "+test.getYear() +" = 30 jours");
                break;
            case 5:
                System.out.println("Mai -- "+test.getYear() +" = 31 jours");
                break;
            case 6:
                System.out.println("Juin -- "+test.getYear() +" = 30 jours");
                break;
            case 7:
                System.out.println("Juillet -- "+test.getYear() +" = 31 jours");
                break;
            case 8:
                System.out.println("Aout -- "+test.getYear() +" = 31 jours");
                break;
            case 9:
                System.out.println("Septembre -- "+test.getYear() +" = 30 jours");
                break;
            case 10:
                System.out.println("Octobre -- "+test.getYear() +" = 31 jours");
                break;
            case 11:
                System.out.println("Novembre -- "+test.getYear() +" = 30 jours");
                break;
            case 12:
                System.out.println("Décembre -- "+test.getYear() +" = 31 jours");
                break;
        
            default:
                System.out.println("Le mois et l'année doivent etre positif, et le mois ne peut de");
                break;
        }
    }

        
        
        
    }

        
        
