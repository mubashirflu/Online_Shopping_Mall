import java.time.Period;
import java.util.Scanner;
import javax.swing.text.DefaultStyledDocument.ElementSpec;
public class Online_Shopping_mall{
    public  static void logic(int n){
            if(n==1){
            System.out.println("choose_Payment_method\npress 1: Dixcy_Wallet_pin\npress 2: cash_on_delivery");
            try (Scanner sc = new Scanner(System.in)) {
                int a=sc.nextInt();
                switch(a){
                case 1:
                System.out.println("Enter the 4_digit Pin:");
                Scanner th=new Scanner(System.in);
                int c=th.nextInt();
                if(c==9990){
                System.out.println("wait Bank Processing...\nPayment successfully");
                System.out.println("Thanks For Shopping Here");
                }else{
                System.out.println("sorry Wrong pin");
                }
                break;
                case 2:
                System.out.println("your  paymnet is cash on delivery");
                System.out.println("Thanks For Shopping Here....!");
                   
                }
            }
            } else if(n==2){
            System.out.println("No any Add_to_Cart_products found...!");
            }
    }
    public static void main(String[] args) {
        System.out.println("**** Welcome To Online Shooping Mall *****");
        String Choose_Catogery,Fashion_products,Electronics_item,Grocery,Clothes,Home_appliances;
        System.out.println("Choose_Catogery\npress 1: Fashion_Products\npress 2: Electronics_item\npress 3: Grocery\npress 4: Clothes\npress 5: Home_Appliances:");
        System.out.println("Enter the Catogery Number:");
        try (Scanner choose_catogerys = new Scanner(System.in)) {
            int choose_catogery=choose_catogerys.nextInt();
            switch(choose_catogery){
            case 1:
            System.out.println("Fashion_Produacts_catogery\npress 1: Watches\npress 2: Beauty_item\npress 3: Shoes\npress 4: T_shirts");
            System.out.println("Choose_Fashion_Catogery");
            Scanner fashion_products=new Scanner(System.in);
            int fashion_product=fashion_products.nextInt();
            switch(fashion_product){
            case 1:
            System.out.println("Choose_Watches_Brands\npress 1: Armani_Brandes\npress 2: Rolex_Brands\npress 3: Curren_Brands\npress 4: Smarts_Watch");
            Scanner watch=new Scanner(System.in);
            int n=watch.nextInt();
            if(n==1)
            {
            System.out.println("The Retail Prize of Armnai Brands is:     Rs: 66,00,0 PKR!\npress 1: Buy Now\npress 2: Add_to_Cart");
            System.out.println("Are you want to sure to sure press (Y) \n Are you want to sure to sure press (N)  ");
        Scanner brands = new Scanner(System.in);
                int Buy=brands.nextInt();

                //logic(Buy);
                
            }
            else if(n==2)
            {
            System.out.println("The Retail Prize of Rolex Brands is   Rs: 60,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
            try (Scanner rolex = new Scanner(System.in)) {
                int Buy=rolex.nextInt();
                logic(Buy);
            }
            }
            else if(n==3)
            {
            System.out.println("The Retail Prize of Curren Brands is   Rs: 55,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
            try (Scanner curren = new Scanner(System.in)) {
                int curren_buy=curren.nextInt();
                logic(curren_buy);
            }
            }
            else if(n==4)
            {
            System.out.println("The Retail Prize of Amrt_watch_7_series  is Rs: 45,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
            try (Scanner smart = new Scanner(System.in)) {
                int smart_wacth=smart.nextInt();
                logic(smart_wacth);
            }
            } 
            else
            {
            System.out.println("sorry Wrong Input");
            }
             break;
            case 2:
             System.out.println("Choose_Beauty_Products\npress 1: Matkeup\npress 2: Nail_polish\npress 3: Ladies_Bands\npress 4: Ladies_perfumes");
             Scanner beauty=new Scanner(System.in);
            int b=beauty.nextInt();
            if(b==1)
            {
            System.out.println("The Retail Prize of Makeup only on   Rs: 120,00.0PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
            try (Scanner beauty1 = new Scanner(System.in)) {
                int beauty2=beauty1.nextInt();
                logic(beauty2);
            }   
            }
                    else if(b==2)
                    {
                        System.out.println("The Retail Prize of NaiL_polish is Rs: 5,00,0 PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner nail = new Scanner(System.in)) {
                            int nail_polish1=nail.nextInt();
                  logic(nail_polish1);
                        }
                    }
                    else if(b==3)
                    {
                        System.out.println("The Retail Prize of Ladies Bands is  Rs: 2,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner ladies = new Scanner(System.in)) {
                            int bands=ladies.nextInt();    
               logic(bands);
                        }
                    }
                    else if(b==4)
                    {
                            System.out.println("The Retail Prize of Ladies Perfumes  is Rs: 4,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner perfumes = new Scanner(System.in)) {
                            int ladies1=perfumes.nextInt();
                  logic(ladies1);
                        }
                    } else
                    {
                        System.out.println("sorry Wrong Input");
                    }
                     break;
                     case 3:
                     System.out.println("Choose_Shoes_variety\npress 1: Nike_Shoes\npress 2: Pume_shoes\npress 3: Armani_shoes\npress 4: Sandles");
                     Scanner shoes=new Scanner(System.in);
                     int s=shoes.nextInt();
                     if(s==1)
                    {
                        System.out.println("The Retail Prize of Nike_Shoes is  Rs: 10,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner niki_shoes = new Scanner(System.in)) {
                            int niki=niki_shoes.nextInt();
               logic(niki);
                        }   
                    }
                    else if(s==2)
                    {
                        System.out.println("The Retail Prize of Puma_shoes is  Rs: 5,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner pume_shoes = new Scanner(System.in)) {
                            int puma=pume_shoes.nextInt();
                   logic(puma);
                        }
                        
                    }
                    else if(s==3)
                    {
                        System.out.println("The Retail Prize of Armani_Shoes is  Rs: 7,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner armani_shoes = new Scanner(System.in)) {
                            int armani=armani_shoes.nextInt();    
                logic(armani);
                        }
                        
                    }
                    else if(s==4)
                    {
                            System.out.println("The Retail Prize of sandles  is  Rs: 4,00.0PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner sandles = new Scanner(System.in)) {
                            int mysandle=sandles.nextInt();
                   logic(mysandle);
                        }
                        
                    } else
                     {
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 4:
                     System.out.println("Choose_T_shirts_variety:\npress 1: puma_shirts\npress 2: horse_shirts\npress 3: Gucci_Shirts");
                     Scanner shirts=new Scanner(System.in);
                     int t_shirts=shirts.nextInt();
                     if(t_shirts==1)
                    {
                        System.out.println("The Retail Prize of puma_shirts is Rs: 5,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner puma_shirts = new Scanner(System.in)) {
                            int pumashirts=puma_shirts.nextInt();
                logic(pumashirts);
                        }
                        
                    }
                    else if(t_shirts==2)
                    {
                        System.out.println("The Retail Prize of horse_shirts is  Rs: 2,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner horse_shirts = new Scanner(System.in)) {
                            int horse=horse_shirts.nextInt();
                   logic(horse);
                        }
                        
                    }
                     else if(t_shirts==3)
                    {
                        System.out.println("The Retail Prize of Guccis_shirts is  Rs: 15,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner gucci_shirts = new Scanner(System.in)) {
                            int gucci=gucci_shirts.nextInt();    
                logic(gucci);
                        }
                        
                    }
                    
                    else
                    {
                        System.out.println("sorry Wrong Input");
                    }

                 default:
                  System.out.println("Sorry No Others Variety found");
                   break;
                
                }
                break;
                case 2:
                System.out.println("Electronics_item_catogery\npress 1: Refrigerator\npress 2: ACE\npress 3: Room_cooler\npress 4: Washing_machine\npress 5: Mobile_phone");
                System.out.println("Choose_Electronics_Catogery");
                Scanner Electronics_product=new Scanner(System.in);
                int electronic=Electronics_product.nextInt();
                switch(electronic){
                    case 1:
                    System.out.println("Choose_Refrigerator_Brandes:\npress 1: Dawlance_Refrigerator\npress 2: Haier_Refrigerator\npress 3: Orient_Refrigerator\npress 4: PEL_Refrigerator");
                    Scanner Refrigerator=new Scanner(System.in);
                    int R=Refrigerator.nextInt();
                    if(R==1){
                        System.out.println("The Retail Prize of Dawlance_Refrigerator is  Rs: 220,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner dawlance = new Scanner(System.in)) {
                            int daw=dawlance.nextInt();
                logic(daw);
                        }
                        
                    }else if(R==2){
                        System.out.println("The Retail Prize of Haier_Refrigerator is  Rs: 215,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner Haier = new Scanner(System.in)) {
                            int hai=Haier.nextInt();
                   logic(hai);
                        }
                        
                     }else if(R==3){
                        System.out.println("The Retail Prize of Orient_Refrigerator is Rs: 1,00,00,0 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner orient = new Scanner(System.in)) {
                            int orients=orient.nextInt();
                            logic(orients);
                        }
                        
                        }else if(R==4){
                            System.out.println("The Retail Prize of PEL_Refrigerator  is cRs: 60,00,0cPKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner PEl_Refrigeraor = new Scanner(System.in)) {
                            int PEl=PEl_Refrigeraor.nextInt();
                            logic(PEl);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 2:
                     System.out.println("Choose_ACE_Products:\npress 1: Dawlance_ACE\npress 2: Haie_ACE\npress 3: PEL_ACE\npress 4: Orient_ACE");
                     Scanner ACE_products=new Scanner(System.in);
                     int A=ACE_products.nextInt();
                     if(A==1){
                        System.out.println("The Retail Prize of Dawlance_ACE on    Rs: 2,200,00 PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner Dawalnce_Ace = new Scanner(System.in)) {
                            int Dawlance=Dawalnce_Ace.nextInt();
                logic(Dawlance);
                        }
                          
                    }else if(A==2){
                        System.out.println("The Retail Prize of Haie_ACE isc Rs: 220,00,0PKR\npress 1: Buy Now\npress 2: Add_to_Cart");
                        try (Scanner Haier_ACE = new Scanner(System.in)) {
                            int haier=Haier_ACE.nextInt();
                   logic(haier);
                        }
                        
                     }else if(A==3){
                        System.out.println("The Retail Prize of PEL_ACE is Rs: 122,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner PEL_ACE = new Scanner(System.in)) {
                            int pel=PEL_ACE.nextInt();    
                logic(pel);
                        }
                        
                    }else if(A==4){
                            System.out.println("The Retail Prize of Orients_ACE  is Rs: 140,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner orient_ACE = new Scanner(System.in)) {
                            int orient=orient_ACE.nextInt();
                   logic(orient);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 3:
                     System.out.println("Choose_Room_cooler:\npress 1: Dawlance_air_cooler:\npress 2: PEl_air_cooler:\npress 3: Haier_air_cooler:\npress 4: Orient_air_cooler");
                     Scanner room_cooler=new Scanner(System.in);
                     int room=room_cooler.nextInt();
                     if(room==1){
                        System.out.println("The Retail Prize of Dawlance_air_cooler is Rs: 156,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner dawlance_air_cooler = new Scanner(System.in)) {
                            int dawair=dawlance_air_cooler.nextInt();
            logic(dawair);
                        }
                        
                    }else if(room==2){
                        System.out.println("The Retail Prize of PEl_air_cooler is Rs: 55,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner pel_air_cooler = new Scanner(System.in)) {
                            int pelair=pel_air_cooler.nextInt();
                   logic(pelair);
                        }
                        
                     }else if(room==3){
                        System.out.println("The Retail Prize of Haier_air_cooler is Rs: 70,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Haier_air_cooler = new Scanner(System.in)) {
                            int haierair=Haier_air_cooler.nextInt();    
                logic(haierair);
                        }
                        
                    }else if(room==4){
                            System.out.println("The Retail Prize of Orient_air_cooler  is Rs: 45,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Orient_air_cooler = new Scanner(System.in)) {
                            int Orientair=Orient_air_cooler.nextInt();
                   logic(Orientair);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 4:
                     System.out.println("Choose_Washing_Machine_Brands:\npress 1: Dawlance_Washing_Machine:\npress 2: PEl_Washing_Machine:\npress 3:Haier_Washing_Machine\npress 4: Orient_Washing_Machine ");
                     Scanner Waching_Machine=new Scanner(System.in);
                     int Machine=Waching_Machine.nextInt();
                     if(Machine==1){
                        System.out.println("The Retail Prize of Dawlance_Washing_Machine is Rs: 55,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Dawlance_Washing_Machine = new Scanner(System.in)) {
                            int Dawlance=Dawlance_Washing_Machine.nextInt();
                logic(Dawlance);
                        }
                        
                    }else if(Machine==2){
                        System.out.println("The Retail Prize of PEl_Washing_Machine is Rs: 65,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner PEL_Washing_Machine = new Scanner(System.in)) {
                            int pelmachine=PEL_Washing_Machine.nextInt();
                   logic(pelmachine);
                        }
                        
                     }else if(Machine==3){
                        System.out.println("The Retail Prize of Haier_Washing_Machine is Rs: 88,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Haier_Washing_Machine = new Scanner(System.in)) {
                            int haiermachine=Haier_Washing_Machine.nextInt();    
                logic(haiermachine);
                        }
                        
                    } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 5:
                     System.out.println("Choose_Mobile_Phone_catogery:\npress 1: Samsung_s22_Altra:\npress 2: Apple_Iphone_14_pro:\npress 3:Infinix ");
                     Scanner Mobiel_phone=new Scanner(System.in);
                     int phone=Mobiel_phone.nextInt();
                     if(phone==1){
                        System.out.println("The Retail Prize of Samsung_s22_Altra is Rs: 339,496PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Samsung_s22_Altra = new Scanner(System.in)) {
                            int samsung=Samsung_s22_Altra.nextInt();
                logic(samsung);
                        }
                        
                    }else if(phone==2){
                        System.out.println("The Retail Prize of Iphone_14_pro_max is  Rs: 489,999KR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner iphone_14_pro_max = new Scanner(System.in)) {
                            int iphone=iphone_14_pro_max.nextInt();
                   logic(iphone);
                        }
                        
                     }else if(phone==3){
                        System.out.println("The Retail Prize of Infinix is Rs: 36,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner infinix = new Scanner(System.in)) {
                            int infinix_phone=infinix.nextInt();    
                logic(infinix_phone);
                        }
                        
                    } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;

                     default:
                     System.out.println("Sorry No Others Variety found");
                     break;
                }
                break;
                
                
                case 3:
                System.out.println("Grocery_catogery\npress 1: Oil & Ghee.:\npress 2: Rice & Flour. Atta, Besan & Maida.:\npress 3: Grains & Pulses. Daal & Chana. Bajra, Suji & More.\npress 4: Ketchup, Mayonnaise & Pickles. Sauces & Ketchup. Spreads & Mayonnaise");
                System.out.println("Choose_Grocery_Catogery");
                Scanner Grocery_product=new Scanner(System.in);
                int grocery=Grocery_product.nextInt();
                switch(grocery){
                    case 1:
                    System.out.println("Choose_Oil & Ghee_Brandes:\npress 1: Al_Habib:\npress 2: Dalda:\npress 3: Banspati:\npress 4: Khoya");
                    Scanner Oil_ghee=new Scanner(System.in);
                    int G=Oil_ghee.nextInt();
                    if(G==1){
                        System.out.println("The Retail Prize of Al_Habib Ghee and Oil is Rs: 10500PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Al_Habib = new Scanner(System.in)) {
                            int habib=Al_Habib.nextInt();
            logic(habib);
                        }
                        
                    }else if(G==2){
                        System.out.println("The Retail Prize of Dalda is Rs: 11000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Dalda = new Scanner(System.in)) {
                            int dalda=Dalda.nextInt();
                   logic(dalda);
                        }
                        
                     }else if(G==3){
                        System.out.println("The Retail Prize of Banspati is Rs: 10,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Banspati = new Scanner(System.in)) {
                        int banspati=Banspati.nextInt();
                        logic(banspati);
                    }
                    
                        }else if(G==4){
                            System.out.println("The Retail Prize of Khoya  is Rs: 9,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Khoya = new Scanner(System.in)) {
                        int khoya=Khoya.nextInt();
                        logic(khoya);
                    }
                    
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 2:
                     System.out.println("Choose_ Rice & Flour. Atta, Besan & Maida_items:\npress 1: Rice:\npress 2: Flour:\npress 3: Atta:\npress 4: Basan& Maida");
                     Scanner Rice_Flour=new Scanner(System.in);
                     int Rice=Rice_Flour.nextInt();
                     if(Rice==1){
                        System.out.println("The Retail Prize of Rice is  Rs: 200kg PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner rice = new Scanner(System.in)) {
                            int rice1=rice.nextInt();
                logic(rice1);
                        }
                        
                    }else if(Rice==2){
                        System.out.println("The Retail Prize of Flour is Rs: 1300 10kg PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner flour = new Scanner(System.in)) {
                            int atta=flour.nextInt();
                   logic(atta);
                        }
                        
                     }else if(Rice==3){
                        System.out.println("The Retail Prize of Atta_Chakki is Rs: 17,00 10KG  PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Atta = new Scanner(System.in)) {
                        int Atta_Chakki=Atta.nextInt();    
            logic(Atta_Chakki);
                    }
                    
                    }else if(Rice==4){
                            System.out.println("The Retail Prize of Basan_Maida is Rs: 15,00PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Baisan = new Scanner(System.in)) {
                            int Maida=Baisan.nextInt();
                   logic(Maida);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 3:
                     System.out.println("Choose_Grains & Pulses. Daal & Chana. Bajra, Suji & More.:\npress 1: Chana_Daal:\npress 2: Chana:\npress 3: Bajra:\npress 4: Suji");
                     Scanner Daal=new Scanner(System.in);
                     int daal_chana=Daal.nextInt();
                     if(daal_chana==1){
                        System.out.println("The Retail Prize of Daal_Chana is Rs: 89 per KG PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner daals = new Scanner(System.in)) {
                            int daal_chana_daal=daals.nextInt();
                logic(daal_chana_daal);
                        }
                        
                    }else if(daal_chana==2){
                        System.out.println("The Retail Prize of Chana is Rs: 70per KGPKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner chana = new Scanner(System.in)) {
                            int white_chana=chana.nextInt();
               logic(white_chana);
                        }
                        
                     }else if(daal_chana==3){
                        System.out.println("The Retail Prize of Bajra is Rs: 70,per kg\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner bajra = new Scanner(System.in)) {
                            int Bajra=bajra.nextInt();    
                logic(Bajra);
                        }
                        
                    }else if(daal_chana==4){
                            System.out.println("The Retail Prize of Suji  is Rs: 100Per KGPKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner suji = new Scanner(System.in)) {
                            int sujii=suji.nextInt();
                   logic(sujii);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 4:
                     System.out.println("Choose_Ketchup, Mayonnaise & Pickles. Sauces & Ketchup. Spreads & Mayonnaise:\npress 1: Ketchup:\npress 2: Mayonnaise:\npress 3:Sauces:");
                     Scanner Ketchup=new Scanner(System.in);
                     int ket=Ketchup.nextInt();
                     if(ket==1){
                        System.out.println("The Retail Prize of Ketchup is Rs: 350KR  5mm bottle:\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner ketchup = new Scanner(System.in)) {
                            int ketch=ketchup.nextInt();
                logic(ketch);
                        }
                           
                    }else if(ket==2){
                        System.out.println("The Retail Prize of Mayonnaise is Rs: 450PKR  5mm bottle:\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner mayonnaise = new Scanner(System.in)) {
                            int mayo=mayonnaise.nextInt();
                   logic(mayo);
                        }
                        
                     }else if(ket==3){
                        System.out.println("The Retail Prize of Sauces is Rs: 350PKRm 5mm bottle :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                         try (Scanner sauces = new Scanner(System.in)) {
                            int sau=sauces.nextInt();    
                logic(sau);
                        }
                        
                    } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     default:
                     System.out.println("Sorry No Others Variety found");
                } 
                break;
                case 4:
                System.out.println(" Clothes_catogery\npress 1: Winter_ collection.:\npress 2: Summar_collection:\npress 3: OTam_collection.\npress 4: Night_dress_collection");
                System.out.println("Choose_ Clothes_Catogery");
                Scanner clothes=new Scanner(System.in);
                int myclothes=clothes.nextInt();
                switch(myclothes){
                    case 1:
                    System.out.println("Choose_Winter_Ladies_Brands:\npress 1: Khaddi:\npress 2: Khaddar:\npress 3:Indure:\npress 4: Dixcy");
                    Scanner winter_brands=new Scanner(System.in);
                    int Winter=winter_brands.nextInt();
                    if(Winter==1){
                        System.out.println("The Retail Prize of Khaddi is Rs: 15,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner khaddi = new Scanner(System.in)) {
                            int khadddi=khaddi.nextInt();
            logic(khadddi);
                        }
                        
                    }else if(Winter==2){
                        System.out.println("The Retail Prize of Khaddar is Rs: 11,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner khaddar = new Scanner(System.in)) {
                            int mykhaddar=khaddar.nextInt();
                   logic(mykhaddar);
                        }
                        
                     }else if(Winter==3){
                        System.out.println("The Retail Prize of Indure is Rs: 10,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Indure = new Scanner(System.in)) {
                        int myindure=Indure.nextInt();
                        logic(myindure);
                    }
                    
                        }else if(Winter==4){
                            System.out.println("The Retail Prize of Dixcy  is Rs: 19,000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Dixcy = new Scanner(System.in)) {
                        int Dixcy_scott=Dixcy.nextInt();
                        logic(Dixcy_scott);
                    }
                    
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 2:
                     System.out.println("Choose_ Summar_Mens_Collection_Brands:\npress 1: J._Collection :\npress 2: Al_Karam:\npress 3: Danzy:");
                     Scanner Mens_collection=new Scanner(System.in);
                     int collection=Mens_collection.nextInt();
                     if(collection==1){
                        System.out.println("The Retail Prize of J.Collection is  Rs: 22,000 PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner jcollection = new Scanner(System.in)) {
                            int j=jcollection.nextInt();
                logic(j);
                        }
                        
                    }else if(collection==2){
                        System.out.println("The Retail Prize of Al_Karam is Rs: 13,000  PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Al_karam = new Scanner(System.in)) {
                            int Al=Al_karam.nextInt();
                   logic(Al);
                        }
                        
                     }else if(collection==3){
                        System.out.println("The Retail Prize of Danzy is Rs: 17,000   PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Danzy = new Scanner(System.in)) {
                        int myDanzy=Danzy.nextInt();    
            logic(myDanzy);
                    }
                    
                    }else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 3:
                     System.out.println("Choose_Otam_collection.:\npress 1: AL_Karam:\npress 2: j.collectiom:");
                     Scanner dress=new Scanner(System.in);
                     int mydess=dress.nextInt();
                     if(mydess==1){
                        System.out.println("The Retail Prize of Al_Karam is Rs: 18000  KG PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner alkaram = new Scanner(System.in)) {
                            int Karam=alkaram.nextInt();
                logic(Karam);
                        }
                        
                    }else if(mydess==2){
                        System.out.println("The Retail Prize of j.collection is Rs: 19000 PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner jcollection = new Scanner(System.in)) {
                            int jdress=jcollection.nextInt();
               logic(jdress);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 4:
                     System.out.println("Choose_Night_Dress_only for men:\npress 1: Danzy:\npress 2: khaddi:\npress 3:indure:");
                     Scanner night=new Scanner(System.in);
                     int mynight=night.nextInt();
                     if(mynight==1){
                        System.out.println("The Retail Prize of Danzy is Rs: 5000  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Demzy = new Scanner(System.in)) {
                            int mydemzy=Demzy.nextInt();
                logic(mydemzy);
                        }
                           
                    }else if(mynight==2){
                        System.out.println("The Retail Prize of Khaddi is Rs: 45000PKR  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner khaddi = new Scanner(System.in)) {
                            int oxmkhaddi=khaddi.nextInt();
                   logic(oxmkhaddi);
                        }
                        
                     }else if( mynight==3){
                     System.out.println("The Retail Prize of indure is Rs: 3500PKRm  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                     try (Scanner indure = new Scanner(System.in)) {
                        int myindure=indure.nextInt();    
                         logic(myindure);
                    }
                        
                    } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     default:
                     System.out.println("Sorry No Others Variety found");
                }
                break;
                case 5:
                System.out.println(" Home Appliances Catogery\npress 1: MicroWaves  :\npress 2: Iron:\npress 3: Cooking Cylinder.\npress 4: Flame Strip");
                System.out.println("Choose_ Appliances_Catogery");
                Scanner Appliances=new Scanner(System.in);
                int Home_Appliances=Appliances.nextInt();
                switch(Home_Appliances){
                    case 1:
                    System.out.println("Choose_MicroWaver_Brands:\npress 1: Panasonic:\npress 2: Samsung:\npress 3:Dawlance:\npress 4: Haier");
                    Scanner Microwaves=new Scanner(System.in);
                    int microWaves=Microwaves.nextInt();
                    if(microWaves==1){
                        System.out.println("The Retail Prize of Panasonic MicroWaver is Rs: 15,0000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner panasonic = new Scanner(System.in)) {
                            int micropanasonic=panasonic.nextInt();
            logic(micropanasonic);
                        }
                        
                    }else if(microWaves==2){
                        System.out.println("The Retail Prize of Samsung is Rs: 11,0000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner samsung = new Scanner(System.in)) {
                            int microsamsung=samsung.nextInt();
                   logic(microsamsung);
                        }
                        
                     }else if(microWaves==3){
                        System.out.println("The Retail Prize of Dawlance is Rs: 10,0000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Dawlance = new Scanner(System.in)) {
                        int microDawlance=Dawlance.nextInt();
                        logic(microDawlance);
                    }
                    
                        }else if(microWaves==4){
                            System.out.println("The Retail Prize of Haier Dixcy  is Rs: 19,0000PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Haier = new Scanner(System.in)) {
                        int microHaier=Haier.nextInt();
                        logic(microHaier);
                    }
                    
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 2:
                     System.out.println("Choose_ Iron_Brand_Collection:\npress 1: Samsung :\npress 2: Dawlance:\npress 3: Haier:");
                     Scanner Iron=new Scanner(System.in);
                     int iron=Iron.nextInt();
                     if(iron==1){
                        System.out.println("The Retail Prize of Samsung is  Rs: 50,000 PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner samsung = new Scanner(System.in)) {
                            int iromsamsung=samsung.nextInt();
                            logic(iromsamsung);
                        }
                        
                    }else if(iron==2){
                        System.out.println("The Retail Prize of Dawlance is Rs: 77,000  PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner Dawlance = new Scanner(System.in)) {
                            int homedawlance=Dawlance.nextInt();
                   logic(homedawlance);
                        }
                        
                     }else if(iron==3){
                        System.out.println("The Retail Prize of Haier is Rs: 34,000   PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                    try (Scanner Haier = new Scanner(System.in)) {
                        int homeHaier=Haier.nextInt();    
            logic(homeHaier);
                    }
                    
                    }else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 3:
                     System.out.println("Choose_Cooking Cylinder_Brands.:\npress 1: Dawlance:\npress 2: Haier");
                     Scanner cylinder=new Scanner(System.in);
                     int mycylinder=cylinder.nextInt();
                     if(mycylinder==1){
                        System.out.println("The Retail Prize of Dawlance Cylinder is Rs: 28000  PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner daw = new Scanner(System.in)) {
                            int dawcylinder=daw.nextInt();
                logic(dawcylinder);
                        }
                        
                    }else if(mycylinder==2){
                        System.out.println("The Retail Prize of Haier Cylinder is Rs: 49000 PKR\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner haierc = new Scanner(System.in)) {
                            int haiercylinder=haierc.nextInt();
               logic(haiercylinder);
                        }
                        
                     } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     case 4:
                     System.out.println("Choose_Flame Strip Brands:\npress 1: Samsung Latest Laser\npress 2: Dawlance:\npress 3:Kenwood:");
                     Scanner flame=new Scanner(System.in);
                     int flamestrip=flame.nextInt();
                     if(flamestrip==1){
                        System.out.println("The Retail Prize of Samsung Latest laser is Rs: 50000PKR  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner flamerStr = new Scanner(System.in)) {
                            int flamestri=flamerStr.nextInt();
                logic(flamestri);
                        }
                           
                    }else if(flamestrip==2){
                        System.out.println("The Retail Prize of Dawlance is Rs: 45000PKR  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                        try (Scanner DawlancerFlame = new Scanner(System.in)) {
                            int dawlaneflame=DawlancerFlame.nextInt();
                   logic(dawlaneflame);
                        }
                        
                     }else if( flamestrip==3){
                     System.out.println("The Retail Prize of Kenwood is Rs: 35000PKR  :\npress 1: Buy Now:\npress 2: Add_to_Cart");
                     try (Scanner kenwood = new Scanner(System.in)) {
                        int kenwoodflame=kenwood.nextInt();    
                         logic(kenwoodflame);
                    }
                        
                    } else{
                        System.out.println("sorry Wrong Input");
                     }
                     break;
                     default:
                     System.out.println("Sorry No Others Variety found");
                }

                break;
            }
        }

    }
}


