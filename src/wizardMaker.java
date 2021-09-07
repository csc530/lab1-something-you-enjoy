public class wizardMaker{
    public static void main(String[] args){
        Wizard hero = new Wizard("Bugs", "Wind", 156410, false);
        Wizard villain = new Wizard("Daffy", "Lightning", 184105, true);
        System.out.println(hero);
        System.out.println(villain);
    }
}
