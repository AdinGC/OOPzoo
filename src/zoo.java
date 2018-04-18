public class zoo {
    String favoriteFood = "bacon";

    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }


    public void sleep(String name){
        System.out.print(name + "sleeps for 8 hours");
    }

    public void eat (String name, String food){
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println(", Yum!" + name + " wants more "+ food+ ".");
        }else{
            sleep(name);
        }
    }
}
