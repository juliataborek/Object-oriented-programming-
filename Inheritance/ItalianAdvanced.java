public class ItalianAdvanced extends ItalianBasic{
    public static String [] noPl = {"jeden","dwa","trzy"};
    public static String [] noIt = {"uno", "due", "tre"};

    public static String noTOpl(String ni){
        int i;
        for(i=0; i< noIt.length; i++){
            if(noIt[i].equals(ni)){
                return noPl[i];
            }
        }
        return "No number";
    }

    public static String noTOit(String np){
        int i;
        for(i=0; i< noPl.length; i++){
            if(noPl[i].equals(np)){
                return noIt[i];
            }
        }
        return "No number";
    }

}
