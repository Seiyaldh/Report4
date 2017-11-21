public class Main {
    public static void main (String[] args) {
        try {
            String str;
            str = "3．14";
            double value;
            value = Double.parseDouble(str);
        } catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatExceptionが発生");
        }
    }
}
