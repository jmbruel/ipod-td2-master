public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public String fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler actions. Example:
            return "Filling";
        }
        return "";
    }

    public String boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil the content. Example:
            boiled = true;
            return "Boiling";
        }
        return "";
   }

    public boolean isEmpty() { return empty;}

    public boolean isBoiled() { return boiled;}
}