public class ItalianBasic {
    public static String [] basicIT = {"ciao","grazie","si","no"};
    public static String [] basicPl = {"cześć","dziękuję","tak","nie"};

    public static String plToit(String pl){
        int i;
        for(i=0; i< basicPl.length;i++){
            if(basicPl[i].equals(pl)){
                return basicIT[i];
            }
        }
        return "No word";
    }

    public static String itTOpl(String it){
        int i;
        for(i=0;i< basicIT.length;i++){
            if(basicIT[i].equals(it)){
                return basicPl[i];
            }
        }
        return "No word";
    }
}
