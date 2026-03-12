public class macrocalculator {

    int getQty(String[] words,int i,int defaultQty){

        int qty = defaultQty;
        if(i>0){
            String num = words[i-1].replaceAll("[^0-9]","");
            if(!num.equals("")){
                qty = Integer.parseInt(num);
            }
        }
        if(qty==defaultQty && i>1){
            String num = words[i-2].replaceAll("[^0-9]","");
            if(!num.equals("")){
                qty = Integer.parseInt(num);
            }
        }
        return qty;
    }
    public void macroCalculator(){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        double calories = 0;
        double protein = 0;
        double carbs = 0;
        double fats = 0;

        int weight = 70;

        double goalCalories = weight * 30;
        double goalProtein = weight * 1.6;
        double goalFats = weight * 0.8;

        double proteinCalories = goalProtein * 4;
        double fatCalories = goalFats * 9;

        double carbCalories = goalCalories - proteinCalories - fatCalories;

        double goalCarbs = carbCalories / 4;

        System.out.println("Enter what you ate today:");

        String input = sc.nextLine().toLowerCase();

        String[] words = input.split(" ");

        for(int i=0;i<words.length;i++){

            if(words[i].equals("egg") || words[i].equals("eggs")){

                int qty = getQty(words,i,1);

                calories+=qty*70;
                protein+=qty*6;
                fats+=qty*5;
            }

            else if(words[i].equals("idly")){

                int qty = getQty(words,i,1);

                calories+=qty*70;
                carbs+=qty*15;
                protein+=qty*2;
            }

            else if(words[i].equals("dosa")){

                int qty = getQty(words,i,1);

                calories+=qty*150;
                carbs+=qty*18;
                protein+=qty*4;
                fats+=qty*7;
            }

            else if(words[i].equals("upma")){

                int qty = getQty(words,i,100);

                calories+=qty*1.20;
                carbs+=qty*0.23;
                protein+=qty*0.03;
                fats+=qty*0.04;
            }

            else if(words[i].equals("biryani")){

                int qty = getQty(words,i,100);

                calories+=qty*1.45;
                carbs+=qty*0.18;
                protein+=qty*0.07;
                fats+=qty*0.06;
            }

            else if(words[i].equals("chicken")){

                int qty = getQty(words,i,100);

                calories+=qty*1.65;
                protein+=qty*0.31;
                fats+=qty*0.036;
            }

            else if(words[i].equals("soya")){

                int qty = getQty(words,i,40);

                calories+=qty*3.45;
                protein+=qty*0.52;
                carbs+=qty*0.33;
            }

            else if(words[i].equals("rice")){

                int qty = getQty(words,i,100);

                calories+=qty*1.30;
                carbs+=qty*0.28;
                protein+=qty*0.027;
            }

            else if(words[i].equals("chapati")){

                int qty = getQty(words,i,1);

                calories+=qty*120;
                carbs+=qty*20;
                protein+=qty*3;
            }

            else if(words[i].equals("milk")){

                int qty = getQty(words,i,100);

                calories+=qty*0.60;
                protein+=qty*0.032;
                carbs+=qty*0.05;
                fats+=qty*0.033;
            }

            else if(words[i].equals("banana")){

                int qty = getQty(words,i,1);

                calories+=qty*105;
                carbs+=qty*27;
                protein+=qty*1.3;
            }

            else if(words[i].equals("bread")){

                int qty = getQty(words,i,1);

                calories+=qty*80;
                carbs+=qty*15;
                protein+=qty*3;
            }

            else if(words[i].equals("oats")){

                int qty = getQty(words,i,100);

                calories+=qty*1.50;
                carbs+=qty*0.27;
                protein+=qty*0.05;
                fats+=qty*0.03;
            }

            else if(words[i].equals("paneer")){

                int qty = getQty(words,i,100);

                calories+=qty*2.65;
                protein+=qty*0.18;
                fats+=qty*0.20;
            }

            else if(words[i].equals("curd") || words[i].equals("yogurt")){

                int qty = getQty(words,i,100);

                calories+=qty*0.60;
                protein+=qty*0.035;
                carbs+=qty*0.047;
            }

            else if(words[i].equals("fish")){

                int qty = getQty(words,i,100);

                calories+=qty*2.06;
                protein+=qty*0.22;
                fats+=qty*0.12;
            }

            else if(words[i].equals("almonds")){

                int qty = getQty(words,i,1);

                calories+=qty*7;
                protein+=qty*0.26;
                fats+=qty*0.6;
            }

            else if(words[i].equals("peanuts")){

                int qty = getQty(words,i,1);

                calories+=qty*6;
                protein+=qty*0.25;
                fats+=qty*0.5;
            }

            else if(words[i].equals("peanutbutter")){

                int qty = getQty(words,i,1);

                calories+=qty*94;
                protein+=qty*4;
                carbs+=qty*3;
                fats+=qty*8;
            }

            else if(words[i].equals("cheese")){

                int qty = getQty(words,i,1);

                calories+=qty*113;
                protein+=qty*7;
                fats+=qty*9;
            }

            else if(words[i].equals("butter")){

                int qty = getQty(words,i,100);

                calories+=qty*7.17;
                fats+=qty*0.81;
            }

            else if(words[i].equals("ghee")){

                int qty = getQty(words,i,100);

                calories+=qty*9;
                fats+=qty*1;
            }

            else if(words[i].equals("maggi")){

                int qty = getQty(words,i,1);

                calories+=qty*350;
                carbs+=qty*50;
                protein+=qty*8;
                fats+=qty*15;
            }

            else if(words[i].equals("pizza")){

                int qty = getQty(words,i,1);

                calories+=qty*285;
                carbs+=qty*36;
                protein+=qty*12;
                fats+=qty*10;
            }

            else if(words[i].equals("whey")){

                int qty = getQty(words,i,1);

                calories+=qty*120;
                protein+=qty*24;
                carbs+=qty*3;
                fats+=qty*1.5;
            }

            else if(words[i].equals("cooldrink") || words[i].equals("cola") || words[i].equals("coke")){

                int qty = getQty(words,i,1);

                calories+=qty*140;
                carbs+=qty*39;
            }

            else if(words[i].equals("apple")){

                int qty = getQty(words,i,1);

                calories+=qty*95;
                carbs+=qty*25;
            }

            else if(words[i].equals("potato")){

                int qty = getQty(words,i,100);

                calories+=qty*1.60;
                carbs+=qty*0.37;
                protein+=qty*0.04;
            }

        }

        System.out.println("\n------ Macro Summary ------");

        System.out.println("Total Calories : "+calories+" kcal");
        System.out.println("Protein        : "+protein+" g");
        System.out.println("Carbs          : "+carbs+" g");
        System.out.println("Fats           : "+fats+" g");

        if(protein < goalProtein){
            System.out.println("Suggestion : Increase protein (eggs, chicken, whey)");
        }

        if(carbs < goalCarbs){
            System.out.println("Suggestion : Increase carbs (rice, chapati, oats)");
        }

        if(fats < goalFats){
            System.out.println("Suggestion : Add healthy fats (almonds, peanuts)");
        }

    }
}