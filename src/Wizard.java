public class Wizard{
    private String name;
    private String element;
    private int powerLevel;
    private boolean evil;

    public Wizard(String name, String element, int powerLevel, boolean evil){
        setName(name);
        setElement(element);
        setPowerLevel(powerLevel);
        setAlignment(evil);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length() < 2)
            throw new IllegalArgumentException("A wizard's name must be at least 2 characters long.");
        this.name = name;
    }

    public String getElement(){
        return element;
    }

    /**
     * Set the Wizard's (preferred) element
     * @param element
     */
    public void setElement(String element){
        if(element.length() < 3)
            throw new IllegalArgumentException("A wizard's element (name) must be at least 3 characters long.");
        this.element = element;
    }

    /**
     * Get the power level value
     * @return an int of Wizard's power level
     */
    public int getPowerLevel(){
        return powerLevel;
    }

    /**
     * Set the power level of the Wizard
     * @param powerLevel a positive int value
     */
    public void setPowerLevel(int powerLevel){
        if(powerLevel < 0)
            throw new IllegalArgumentException("A wizard's power level cannot be less than zero (negative).");
        this.powerLevel = powerLevel;
    }

    /**
     * Get the string value of the Wizard's (moral) alignment
     * @return aString of good or evil
     */
    public String getAlignment(){
        return evil ? "evil" : "good";
    }

    /**
     * Sets the (moral) alignment of the Wizard
     * @param evil a boolean if the Wizard is evil, true if the Wizard is evil and false if they are good
     */
    public void setAlignment(boolean evil){
        this.evil = evil;
    }

    /**
     * A string summarizing the Wizard
     * @return a summary of all the Wizard's attributes
     */
    @Override
    public String toString(){
        String allegiance = evil ? "evil" : "good";
        return String.format("%s the wizard, a master of %s at a power level of %d. One who uses their power for %s.",name,element,powerLevel,allegiance);
    }
}
