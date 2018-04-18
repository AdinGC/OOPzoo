public class Tiger {

    //instance variables
    public String name;
    public String favoriteFood="meat";

    //constructor
    public Tiger(String name) {
        this.name=name;
    }

    //method 1
    public void sleep() {
        System.out.println(name + "sleeps for 8 hours");

    }

    //method 2
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.println(", Yum!" + name + " wants more "+ food+ ".");
        }else{
            sleep();
        }

    }


}




